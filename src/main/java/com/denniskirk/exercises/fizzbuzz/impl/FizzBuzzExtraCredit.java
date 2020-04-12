package com.denniskirk.exercises.fizzbuzz.impl;

/**
 * The extra credit implementation of the FizzBuzz exercise.
 *
 * This implementation should:
 * Prints the numbers from 1 to 100
 * For multiples of a dynamic value print "Fizz"
 * For multiples of a different dynamic value print "Buzz"
 * For multiple of both dynamic values print "FizzBuzz"
 */
public class FizzBuzzExtraCredit extends AbstractFizzBuzz
{

	private final int fizz;
	private final int buzz;

	/**
	 * Use this constructor to set the dynamic values for {@param fizz} and {@param buzz}.
	 * @param fizz An integer whose multiples will be replaced with the word "Fizz".
	 * @param buzz A different integer whose multiples will be replaced with the word "Buzz".
	 */
	public FizzBuzzExtraCredit(int fizz, int buzz) {
		this.fizz = fizz;
		this.buzz = buzz;
	}

	@Override
	boolean isBuzz(int x) {
		return x % buzz == 0;
	}

	@Override
	boolean isFizz(int x) {
		return x % fizz == 0;
	}

	@Override
	boolean isFizzBuzz(int x) {
		return isFizz(x) && isBuzz(x);
	}
}
