/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.starsassignment;

/**
 *
 * @author bebreo2027
 */
public class StarsAssignment {
//-----------------------------------------------------------------
// Prints a triangle shape using asterisk (star) characters.
//-----------------------------------------------------------------
    public static void main(String[] args) {
        final int MAX_ROWS = 10;
        System.out.println("a.");
        //for each row
        for (int row = MAX_ROWS; row >= 1; row--) {
            //print out the appropriate number of stars for that row
            //progressively becomes smaller per row
            for (int star = 1; star <= row; star++){
                System.out.print("*");
            }
            //newline for a new row
            System.out.println();
        }
        System.out.println("b.");
        //for each row
        for (int row = MAX_ROWS; row >= 1; row--) {
            //print out the appropriate number of spaces for that row
            //progressively becomes smaller per row
            for (int space = 1; space <= row; space++){
                System.out.print(" ");
            }
            //then print out the left over amount of stars to complete row length
            for (int star = 1; star <= (MAX_ROWS - row); star++) {
                System.out.print("*");    
            }
            //newline for a new row
            System.out.println();
            
        }
        System.out.println("c.");
        //for each row
        for (int row = 0; row <= MAX_ROWS; row++) {
            //print out the appropriate number of spaces for that row
            //progressively becomes larger per row
            for (int space = 0; space < row; space++){
                System.out.print(" ");
            }
            //then print out the left over amount of stars to complete row length
            for (int star = 1; star <= (MAX_ROWS - row); star++) {
                System.out.print("*");    
            }
            //newline for a new row
            System.out.println();
        }
        System.out.println("d.");
        //for each row
        for (int row = 1; row <= MAX_ROWS; row++) {
            //print out the appropriate number of left spaces for the diamond
            //5 minus the current row number
            for (int space = 0; space < 5 - row; space++){
                System.out.print(" ");
            }
            //if the row is past five, make the number of spaces gradually increase
            if (row > 5) {
                for (int space = 0; space < row - 6; space++){
                System.out.print(" ");
                }
            }
            if (row <= 5) {
                //print out the number of stars up to the middle, the same number as number of rows
                for (int star = 1; star <= row; star++) {
                    System.out.print("*"); 

                }
                //print out the stars past the middle point
                    for (int rightStar = 1; rightStar <= row - 1; rightStar++) {
                            System.out.print("*"); 
                        }
            } else {
                //if the row is past 5, stars up to the middle are 11 minus the row
                for (int star = 1; star <= 11 - row; star++) {
                    System.out.print("*"); 

                }
                //print out the stars past the middle point
                //10 minus the row
                    for (int rightStar = 1; rightStar <= MAX_ROWS - row; rightStar++) {
                            System.out.print("*"); 
                        }
            }
            //newline for a new row
            System.out.println();
        }
    }
}
