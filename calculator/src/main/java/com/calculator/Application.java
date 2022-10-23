package com.calculator;

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
        JOptionPane.showMessageDialog(null, "Sum: " + sum.totalSum( x, y ) );

        System.exit( 0 );
    }
}
