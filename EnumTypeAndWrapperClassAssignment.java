/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.enumtypeandwrapperclassassignment;

/**
 *
 * @author bebreo2027
 */
//Import scanner
import java.util.Scanner;

public class EnumTypeAndWrapperClassAssignment {
    //Make the enums for weeks and months
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday,
        Saturday, Sunday
    }

    enum Year {
        January, February, March, April, May,
        June, July, August, September, October, November, December
    }

    public static void main(String[] args) {
        //Fill variables according to the weeks, then print them
        Week day1, day2, day3, day4, day5, day6, day7;
        day1 = Week.Monday;
        day2 = Week.Tuesday;
        day3 = Week.Wednesday;
        day4 = Week.Thursday;
        day5 = Week.Friday;
        day6 = Week.Saturday;
        day7 = Week.Sunday;
        System.out.println("Days of the week:\n" + day1.name() + "\n"
                + day2.name() + "\n"
                + day3.name() + "\n"
                + day4.name() + "\n"
                + day5.name() + "\n"
                + day6.name() + "\n"
                + day7.name() + "\n");
        //Fill variables according to the months, then print them
        Year month1, month2, month3, month4, month5, month6, month7, month8, month9, month10, month11, month12;
        month1 = Year.January;
        month2 = Year.February;
        month3 = Year.March;
        month4 = Year.April;
        month5 = Year.May;
        month6 = Year.June;
        month7 = Year.July;
        month8 = Year.August;
        month9 = Year.September;
        month10 = Year.October;
        month11 = Year.November;
        month12 = Year.December;
        System.out.println("Months of the year:\n" + month1.name() + "\n"
                + month2.name() + "\n"
                + month3.name() + "\n"
                + month4.name() + "\n"
                + month5.name() + "\n"
                + month6.name() + "\n"
                + month7.name() + "\n"
                + month8.name() + "\n"
                + month9.name() + "\n"
                + month10.name() + "\n"
                + month11.name() + "\n"
                + month12.name() + "\n");
                //Get scanner ready
                Scanner scan = new Scanner(System.in);
                //Print instructions
                System.out.println("Input your CCHS username:");
                String username = scan.nextLine();
                //Convert the graduation year to an int, and print it
                int intUsername = Integer.parseInt(username.substring(username.length() - 4, username.length()));
                System.out.println("Your graduation year: " + intUsername);
                //Print 1 plus the graduation year, then the grad year in binary
                System.out.println("1 plus your graduation year: " + (intUsername + 1));
                System.out.println("In computer language, you graduate in " + Integer.toBinaryString(intUsername));
    }

}