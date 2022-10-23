package com.calculator.entities;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CalculatorTests {
        @Test
        public void shouldSumTwoValues(){
            int a = 0;
            int b = 0;
            Sum sum = new Sum();
            double expectedResult = 0.0;
            double result = sum.totalSum(a, b);

            assertEquals(expectedResult,result);
            fail("The test is a prototype.");
        }
    }
