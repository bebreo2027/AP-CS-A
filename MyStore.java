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
        //make a loop to print instructions, recieve input, and run addItem
        while (myItem.getRepeater() == true){
            System.out.println("""
                               Enter items. Acceptable items are:
                               T-Shirt
                               Shoes
                               Jeans
                               Jacket
                               Hat
                               Shorts
                               Blouse""");
            myItem.setStrName(scan.nextLine());
            System.out.println(myItem.addItem());
            if (myItem.getTotalPrice() > MAX_BUDGET) {
                myItem.setRepeater(false);
                System.out.println("You've gone over budget!");
            }
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
    private boolean repeater = true;
    //make a variable counting the number of items
    private int itemCount;
    //make getters and setters for strName, dblPrice, repeater, and totalPrice
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
    public void setTotalPrice (double inTotalPrice) {
            totalPrice = totalPrice;
    }
    public double getTotalPrice () {
            return totalPrice;
    } 
    public void setRepeater (boolean inRepeater) {
            repeater = inRepeater;
    }
    public boolean getRepeater () {
            return repeater;
    } 
    //make a method that takes in user input and adds to the price
   public String addItem(){
            //if user input is not an acceptable item, set repeater to false. if not, add prices accordingly
            if (strName.equalsIgnoreCase("t-shirt")) {
                dblPrice = 29.99;
                
            } else if (strName.equalsIgnoreCase("shoes")) {
                dblPrice = 125.99;

            } else if (strName.equalsIgnoreCase("jeans")) {
                 dblPrice = 60.99;

            } else if (strName.equalsIgnoreCase("jacket")) {   
                dblPrice = 250.0;

            } else if (strName.equalsIgnoreCase("hat")) { 
                dblPrice = 25.99;

            } else if (strName.equalsIgnoreCase("shorts")) {
                dblPrice = 75.99;

            } else if (strName.equalsIgnoreCase("blouse")) {
                dblPrice = 88.99;

            } else {
               repeater = false;
               return "Unacceptable input";
            }
                totalPrice += dblPrice;
                itemCount++;
                return toString();
           
   }

    //use toString to print out the name and price
        public String toString(){
        String result = "";
        result = "Item: " + strName + "\n"
               + "Price: " + dblPrice + "\n"
               + "Total price of purchases: " + totalPrice + "\n"
                +"Number of items bought: " + itemCount + "\n";
        return result;
    }
}
