/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.irc;
//import scanner
import java.util.Scanner;
/**
 *
 * @author bebreo2027
 */
public class IRC {

    public static void main(String[] args) {
        //Get scanner ready
        Scanner scan = new Scanner(System.in);
        //Make the interest rate calculator object
        InterestRateCalculator myCalc = new InterestRateCalculator();
        //print instructions for the amount of dollars that will be compounded montly
        System.out.println("""
                           This is an interest rate calculator with an interest rate of 10%, compounded monthly!
                           Input an amount of US dollars:""");
        //Set interestAmount as the next scanned input
        myCalc.getInAmount(scan.nextInt());
        //instructions for the number of months
        System.out.println("Input the amount of months borrowed:");
        //Set monthAmount as the next scanned input
        myCalc.getMonthAmount(scan.nextInt());
        System.out.println("""
                           Interest rate over that amount of months:
                           $""" + roundAvoid(myCalc.calcPayments(), 2));
    }
    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}

//make the interest rate calculator class
class InterestRateCalculator {
    //Make the private ints for the interest and month amount
    private int interestAmount = 0;
    private int monthsAmount = 0;
    //make the rate value
    public final double RATE = 0.1;
    //prepare a mutator for the interest amount
    public void getInAmount (int inAmount) {
            interestAmount = inAmount;
    }
    //prepare a mutator for the months
    public void getMonthAmount (int inMonth) {
            monthsAmount = inMonth;
    }
    //make a method calculating payments
    public double calcPayments () {
    return interestAmount * Math.pow((1 + RATE), monthsAmount);
    }


    }


