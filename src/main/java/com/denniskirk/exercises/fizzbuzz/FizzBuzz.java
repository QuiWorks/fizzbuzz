package com.denniskirk.exercises.fizzbuzz;

import com.denniskirk.exercises.fizzbuzz.impl.FizzBuzzBasic;
import com.denniskirk.exercises.fizzbuzz.impl.FizzBuzzExtraCredit;

/**
 * Fizz Buzz is a simple coding exercise used for interviewing potential Dennis Kirk software developers
 *
 * The instructions for the {@link FizzBuzzBasic} implementation of this exercise are:
 * Write a program that prints the numbers from 1 to 100
 * For multiples of three print "Fizz"
 * For multiples of five print "Buzz"
 * For multiple of both three and five print "FizzBuzz"
 *
 * For extra credit write the {@link FizzBuzzExtraCredit} implementation by using dynamic values for the multiples of Fizz, Buzz and FizzBuzz
 */
public interface FizzBuzz {

    void run();

}