package com.calculator.entities;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {
    @Test
    public void shouldSumTwoValues(){
            int a = 4;
            int b = 6;
            Sum sum = new Sum();
            double expectedResult = 10;
            double result = sum.totalSum(a, b);

            assertEquals(expectedResult,result,0);
        }
    @Test
    public void shouldSubtractTwoValues() {
        int n1 = 5;
        int n2 = 3;
        Subtract subtract = new Subtract();
        double expResult = 2;
        double result = subtract.totalSubtraction(n1,n2);

        assertEquals(expResult, result, 0);
    }
    @Test
    public void shouldMultiplyTwoValues() {
        int n1 = 2;
        int n2 = 3;
        Multiply multiply = new Multiply();
        double expResult = 6;
        double result = multiply.totalMultiplier(n1,n2);

        assertEquals(expResult, result, 0);
    }
    @Test
    public void shouldMultplicateTwoNegativesValues(){
        int n1 = -2;
        int n2 = -5;
        Multiply multiply = new Multiply();
        double expResult = 10;
        double result = multiply.totalMultiplier(n1,n2);

        assertEquals(expResult,result,0);
    }
    @Test
    public void shouldDivideTwoValues() {
        int n1 = 5;
        int n2 = 2;
        Division division = new Division();
        double expResult = 2.5;
        double result = division.totalDivision(n1,n2);

        assertEquals(expResult, result,0);
    }
}
