package com.calculator.entities;

public class CalculatorTests {
    public static void main(String[] args) {
        Sum sum = new Sum();
            int x = 5;
            int y = 6;

            int result = sum.totalSum(x, y);
            if(result == 11){
                System.out.println("Correct Answer!");
            }
            else{
                System.out.println("Sory,try Again!");
            }



    }
}
