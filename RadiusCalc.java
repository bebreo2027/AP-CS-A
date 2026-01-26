/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.radiuscalc;
import java.util.Scanner;

public class RadiusCalc {

    /**
     * @param args the command line arguments
     */
    //carry out calculations or circular items
    //such as a circle, a sphere, a cone, a column
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("This program calculates round item numbers such as \n" +
                "1 - Area of a circle (pi r^2)\n" +
                "2 - Volume of a sphere (4/3 pi r^3)\n" +
                "3 - Volume of a cone (pi r^2 h/3)\n" +
                "4 - Volume of a column (pi r^2 h)");
        System.out.println("Type the number for which one you want to calculate");
        int i = s.nextInt();
        //switch the if statement to a switch because I like that it looks cleaner
        switch (i) {
            case 1:
                cCalc();
                break;
            case 2:
                sCalc();
                break;
            case 3:
                cCalc2();
                break;
            case 4:
                cCalc3();
                break;
            default:
                break;
        }
    }
    //reordered the static functions so i can fix them more easily
    public static void cCalc(){
        //Initialized scanner
        Scanner s = new Scanner(System.in);
        System.out.println("enter the radius of your circle");
        int r = s.nextInt();
        double result = Math.PI * Math.pow(r, 2);
        System.out.println(result);
    }
    public static void sCalc(){
        //Initialized scanner
        Scanner s = new Scanner(System.in);
        System.out.println("enter the radius of your circle");
        int r = s.nextInt();
        //make the Math.pow(r,3) be calculated first so the operation works correctly
        double result = Math.pow(r, 3) * 4 / 3 * Math.PI;
        //changed parameter from r to result
        System.out.println(result);
    }
    public static void cCalc2(){
        //Initialized scanner
        Scanner s = new Scanner(System.in);
        System.out.println("enter the radius of your cone, then height of your cone");
        int r = s.nextInt();
        int h = s.nextInt();
        //divided volume by 3 to get the accurate cone volume
        double result = Math.PI * Math.pow(r, 2) * h /3;
        //changed parameter from r to result
        System.out.println(result);
    }
    public static void cCalc3(){
        //Initialized scanner
        Scanner s = new Scanner(System.in);
        //rename the printed statement to say column, not cone
        System.out.println("enter the radius of your column, then height of your column");
        int r = s.nextInt();
        //Added the h variable representing height
        int h = s.nextInt();
        double result = Math.PI * Math.pow(r, 2) * h;
        System.out.println(result);
    }
    
}