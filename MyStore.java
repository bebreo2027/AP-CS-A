/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mystore;
//import scanner
import java.util.Scanner;
/**
 *
 * @author bebreo2027
 */
public class MyStore {

    public static void main(String[] args) {
        //Get scanner ready
        Scanner scan = new Scanner(System.in);
        //make a constant for the 250 dollar max budget
        final double MAX_BUDGET = 250.0;
        //Make an object from the Item class
        Item myItem = new Item();
        //print instructions
        System.out.println("Enter items. Acceptable items are:\n"
                +           "T-Shirt\n"
                +           "Shoes\n"
                +           "Jeans\n"
                +           "Jacket\n"
                +           "Hat\n"
                +           "Shorts\n"
                +           "Blouse");
        System.out.println(myItem);
    }
}

//make the Item class
class Item {
    //make variables representing the item's name and price respectively
    private String strName;
    private double dblPrice;
    //make getters and setters for strName and dblPrice
    public void setStrName (String inStrName) {
            strName = inStrName;
    }
    public String getStrName () {
            return strName;
    }
    public void setDblPrice (double inDblPrice) {
            dblPrice = inDblPrice;
    }
    public double getDblPrice () {
            return dblPrice;
    } 
    //use toString to print out the name and price
        public String toString(){
        String result = "";
        result = "Item: " + strName + "\n" + "Price: " + dblPrice;
        return result;
    }
}
