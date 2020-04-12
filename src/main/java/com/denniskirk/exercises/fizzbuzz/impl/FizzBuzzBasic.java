package com.denniskirk.exercises.fizzbuzz.impl;

/**
 * The basic implementation of the FizzBuzz exercise.
 *
 * This implementation should:
 * Print the numbers from 1 to 100
 * For multiples of three print "Fizz"
 * For multiples of five print "Buzz"
 * For multiple of both three and five print "FizzBuzz"
 */
public class FizzBuzzBasic extends AbstractFizzBuzz
{
	@Override
	boolean isBuzz(int x) {
		return x % 5 == 0;
	}

	@Override
	boolean isFizz(int x) {
		return x % 3 == 0;
	}

	@Override
	boolean isFizzBuzz(int x) {
		return isFizz(x) && isBuzz(x);
	}
}
