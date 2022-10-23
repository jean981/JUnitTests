package com.calculator;

import com.calculator.entities.Division;
import com.calculator.entities.Multiply;
import com.calculator.entities.Subtract;
import com.calculator.entities.Sum;

import javax.swing.*;

public class Application {
    public static void main(String[] args) {

        int x, y;
        String sX, sY;

        sX = JOptionPane.showInputDialog( null, "Type the first value: ",
            "First Value", JOptionPane.QUESTION_MESSAGE );
        x = Integer.parseInt( sX );
        sY = JOptionPane.showInputDialog( null, "Type the second value: ",
            "Second Value", JOptionPane.QUESTION_MESSAGE );
        y = Integer.parseInt( sY );

        Sum  sum = new Sum();
        Subtract sub = new Subtract();
        Multiply mult = new Multiply();
        Division div = new Division();

        JOptionPane.showMessageDialog(null, "Sum: " + sum.totalSum( x, y ) );
        JOptionPane.showMessageDialog(null, "Subtraction: " + sub.totalSubtraction( x, y ) );
        JOptionPane.showMessageDialog(null, "Multiply: " + mult.totalMultiplier( x, y ) );
        JOptionPane.showMessageDialog(null, "Division: " + div.totalDivision( x, y ) );


        System.exit( 0 );
    }
}
