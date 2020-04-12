package com.denniskirk.exercises.fizzbuzz.impl;

import java.util.stream.IntStream;

import com.denniskirk.exercises.fizzbuzz.FizzBuzz;

/**
 * A base class to hold the logic shared by the different implementations of the FizzBuzz exercise.
 */
public abstract class AbstractFizzBuzz implements FizzBuzz
{
	@Override
	public void doFizzBuzz()
	{
		IntStream.range(1, 101)
			.forEach(this::printFizzBuzz);
	}

	private void printFizzBuzz(int x)
	{
		System.out.println(getFizzBuzz(x));
	}

	private String getFizzBuzz(int x)
	{
		if(isFizzBuzz(x)) {
			return "FizzBuzz";
		} else if(isFizz(x)) {
			return "Fizz";
		} else if(isBuzz(x)) {
			return "Buzz";
		} else {
			return String.valueOf(x);
		}
	}

	abstract boolean isBuzz(int x);

	abstract boolean isFizz(int x);

	abstract boolean isFizzBuzz(int x);
}
