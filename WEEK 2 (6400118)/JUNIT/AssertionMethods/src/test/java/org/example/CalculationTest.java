package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {

    @org.junit.jupiter.api.Test
    @DisplayName("addition of two numbers & Assert Equals")
    void add() {
        Assertions.assertEquals(4,Calculation.add(2,2));
    }
    @Test
    @DisplayName("assert NOTNULL")
    public void notnull(){
        String value = null;
        String value_2 = "rishi";
        Assertions.assertNotNull(value_2,()->"value is null");
    }
    @Test
    @DisplayName("assert NULL")
    public void value_null(){
        String value = null;
        Assertions.assertNull(value);
    }
    @Test
    @DisplayName("assert True")
    public void Find_True(){
        Boolean Truevalue = true;
        Boolean Falsevalue = false;
        Assertions.assertTrue(Truevalue,()->"value is not true it is false");
    }
    @Test
    @DisplayName("assert False")
    public void Find_False(){
        Boolean Truevalue = true;
        Boolean Falsevalue = false;
        Assertions.assertFalse(Falsevalue,()->"value is not False it is True");
    }
}