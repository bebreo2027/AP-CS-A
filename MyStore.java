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
        while ((myItem.repeater = true) && (myItem.totalPrice < MAX_BUDGET)){
            myItem.addItem(scan.nextLine());
        }
    }
}

//make the Item class
class Item {
    //make variables representing the item's name and price respectively
    private String strName;
    private double dblPrice;
    //make a variable for the total price
    private double totalPrice;
    //make a boolean variable that stops the driver's loop if any non-acceptable item is inputted
    boolean repeater = true;
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
    //make a method that takes in user input and adds to the price
   public void addItem(String inItem){
       setStrName(inItem);
            //if user input is not an acceptable item, set repeater to false. if not, add prices accordingly
            if (strName.equalsIgnoreCase("t-shirt")) {
                dblPrice = 29.99;
                totalPrice += dblPrice;
            } else if (strName.equalsIgnoreCase("shoes")) {
                dblPrice = 125.99;
                totalPrice += dblPrice;
            } else if (strName.equalsIgnoreCase("jeans")) {
                 dblPrice = 60.99;
                 totalPrice += dblPrice;
            } else if (strName.equalsIgnoreCase("jacket")) {   
                dblPrice = 250.0;
                totalPrice += dblPrice;
            } else if (strName.equalsIgnoreCase("hat")) { 
                dblPrice = 25.99;
                totalPrice += dblPrice;
            } else if (strName.equalsIgnoreCase("shorts")) {
                dblPrice = 75.99;
                totalPrice += dblPrice;
            } else if (strName.equalsIgnoreCase("blouse")) {
                dblPrice = 88.99;
                totalPrice += dblPrice;
            } else {
               repeater = false;
            }
            if (repeater = true) {
                toString();
            }
   }

    //use toString to print out the name and price
        public String toString(){
        String result = "";
        result = "Item: " + strName + "\n" + "Price: " + dblPrice;
        return result;
    }
}
