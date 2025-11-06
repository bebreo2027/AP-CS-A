/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shoppinglist;
//import scanner and arrayList


import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author bebreo2027
 */
public class ShoppingList {

    public static void main(String[] args) {
        //set up scanner and array list
        Scanner scan = new Scanner (System.in);
        ArrayList<String> list = new ArrayList<String>();
        //set up variable storing user input
        String inputtedItem = "";
        //make a while loop that prints out instructions, takes in user input, and either adds or takes away something from the shopping list
        while (!(inputtedItem.equals("q"))) {            
            System.out.println("This program helps you make a shopping list!\n"
                    +          "Type in an item to add!\n"
                    +          "Or, if you want to remove an item, type r\n"
                    +          "To quit, type q");
            inputtedItem = scan.nextLine();
            //q quits the program
            if (inputtedItem.equals("q")) {
            } else {
                //r is how to remove items
                if (inputtedItem.equals("r")) {
                    System.out.println("What is the number of the item you want to remove?");
                    list.remove((Integer.parseInt(scan.nextLine().trim()) - 1));
                //if not inputted r, an item is added
                } else {
                    list.add(inputtedItem);
                }
                System.out.println("\nYour shopping list: ");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println((i + 1) + ". " + list.get(i));
                }
                System.out.println("");
            }
        }
    }
}
