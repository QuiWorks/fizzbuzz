package com.denniskirk.exercises.fizzbuzz.impl;

import com.denniskirk.exercises.fizzbuzz.FizzBuzz;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

abstract class FizzBuzzTest {

    void run() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        getTestClass().run();
        assertEquals(getCorrectOutput(), outContent.toString());
        outContent.flush();
        System.setOut(System.out);
    }

    abstract String getCorrectOutput();

    abstract FizzBuzz getTestClass();
}
