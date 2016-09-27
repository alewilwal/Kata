package com.hbdriod.kata;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect_if_empty() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.add(""));
    }
    @Test
    public void addition_isCorrect_if_solo() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add("5"));
    }
    @Test
    public void addition_isCorrect_if_mutiple() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add("1,2"));
    }
}