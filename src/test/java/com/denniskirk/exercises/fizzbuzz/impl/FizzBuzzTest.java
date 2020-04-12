package com.denniskirk.exercises.fizzbuzz.impl;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import com.denniskirk.exercises.fizzbuzz.FizzBuzz;

abstract class FizzBuzzTest
{

	void run() throws IOException
	{
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		getTestClass().doFizzBuzz();
		assertEquals(getCorrectOutput(), outContent.toString());
		outContent.flush();
		System.setOut(System.out);
	}

	abstract String getCorrectOutput();

	abstract FizzBuzz getTestClass();
}
