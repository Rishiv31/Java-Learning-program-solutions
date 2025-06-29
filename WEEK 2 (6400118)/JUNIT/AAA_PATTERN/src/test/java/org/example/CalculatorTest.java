package org.example;

import org.example.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("Setup done.");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Teardown done.");
    }

    @Test
    void testAddition() {
        int a = 10;
        int b = 20;
        int result = calculator.add(a, b);
        assertEquals(30, result);
    }

    @Test
    void testMultiplication() {
        int a = 5;
        int b = 4;
        int result = calculator.multiply(a, b);
        assertEquals(20, result);
    }
}
