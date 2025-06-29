package org.example;

import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @org.junit.jupiter.api.Test
    @DisplayName("addition of two numbers")
    void add() {
        assertEquals(4,Calculator.add(2,2));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("multiplication of two numbers")
    void multiply() {
        assertAll(()->assertEquals(4,Calculator.multiply(2,2)),
                ()->assertEquals(-4,Calculator.multiply(2,-2)),
                        ()->assertEquals(4.0,Calculator.multiply(-2,-2)),
                                ()->assertEquals(0.0,Calculator.multiply(1,0)));
    }
}