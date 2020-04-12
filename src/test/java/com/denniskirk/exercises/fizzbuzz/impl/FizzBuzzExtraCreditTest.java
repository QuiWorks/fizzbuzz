package com.denniskirk.exercises.fizzbuzz.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Test;

import com.denniskirk.exercises.fizzbuzz.FizzBuzz;

public class FizzBuzzExtraCreditTest extends FizzBuzzTest
{

	private ExtraCreditTestState testState;

	@Test
	public void extraCreditTest() throws Exception
	{
		for(int fizz = 1; fizz <= 10; fizz++) {
			for(int buzz = 1; buzz <= 10; buzz++) {
				setState(fizz, buzz);
				super.run();
			}
		}

	}

	@Override
	String getCorrectOutput()
	{
		return IntStream.range(1, 101)
			.mapToObj(this::getAnswer)
			.collect(Collectors.joining("\n")) + "\n";
	}

	@Override
	FizzBuzz getTestClass()
	{
		return testState.getCurrentInstance();
	}

	private FizzBuzzExtraCredit getTestInstance(
		int fizz,
		int buzz) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException
	{
		Class<Integer> type = Integer.TYPE;
		return FizzBuzzExtraCredit.class.getDeclaredConstructor(type, type).newInstance(fizz, buzz);
	}

	private void setState(
		int fizz,
		int buzz) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException
	{
		FizzBuzzExtraCredit testInstance = getTestInstance(fizz, buzz);
		testState = new ExtraCreditTestState(testInstance, fizz, buzz);
	}

	private String getAnswer(int i)
	{
		if(isFizz(i) && isBuzz(i)) {
			return "FizzBuzz";
		} else if(isFizz(i)) {
			return "Fizz";
		} else if(isBuzz(i)) {
			return "Buzz";
		} else {
			return String.valueOf(i);
		}
	}

	private boolean isFizz(int i)
	{
		return i % testState.getFizz() == 0;
	}

	private boolean isBuzz(int i)
	{
		return i % testState.getBuzz() == 0;
	}

	private static class ExtraCreditTestState
	{
		private final FizzBuzzExtraCredit currentInstance;
		private final int fizz;
		private final int buzz;

		ExtraCreditTestState(FizzBuzzExtraCredit testInstance, int fizz, int buzz)
		{
			this.currentInstance = testInstance;
			this.fizz = fizz;
			this.buzz = buzz;
		}


		FizzBuzzExtraCredit getCurrentInstance()
		{
			return currentInstance;
		}

		int getFizz()
		{
			return fizz;
		}

		int getBuzz()
		{
			return buzz;
		}
	}
}
