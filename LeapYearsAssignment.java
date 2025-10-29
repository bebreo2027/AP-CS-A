/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leapyearsassignment;
//import scanner
import java.util.Scanner;
/**
 *
 * @author bebreo2027
 */
public class LeapYearsAssignment {

    public static void main(String[] args) {
        //Get scanner ready
        Scanner scan = new Scanner(System.in);
        //print instructions
        System.out.println("Input a year to check if it is a leap year");
        //scan for and make a variable to check the year
        int yearChecked = scan.nextInt();
        //make a boolean variable deciding whether or not it is a leap year, make it false by default
        boolean isLeapyear = false;
        //check if the year is less than 1582
        while (yearChecked <= 1582) {
            System.out.println("Years less than 1582 are not accepted, try again");
            yearChecked = scan.nextInt();
        }
        //check if yearChecked is divisible by 4 but not 100, unless it is divisible by 400
        if (yearChecked % 4 == 0) {
            if (yearChecked % 100 == 0) {
                if (yearChecked % 400 == 0) {
                    isLeapyear = true;
                }
            } else {
                isLeapyear = true;
            }
        }
        //print whether yearChecked is as leap year or not using isLeapYear
        if (isLeapyear == true) {
            System.out.print(yearChecked + " is a leap year");
        } else {
            System.out.print(yearChecked + " is not a leap year");
        }
    }
}
