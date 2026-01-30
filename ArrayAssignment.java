/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrayassignment;
import java.util.Random;
/**
 *
 * @author bebreo2027
 */
public class ArrayAssignment {

    public static void main(String[] args) {
        String[] list = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        // Print the array values
        System.out.print("Days of the week: " + printArray(list));
        //Resize list using the remove method
        list = remove(list, 5);
        list = remove(list, 5);
        System.out.print("\n\nWeekdays: " + printArray(list));
        //Print shuffled days of the week
        System.out.print("\n\nShuffled weekdays: " + printArray(ShuffleArray(list)));
    }
    //Make a method that removes items in arrays by returning a copy of the array 1 smaller
    private static String[] remove(String[] arr, int in) {
        //If the array is null or the index is too high, the original array is returned
        if (arr == null || in < 0 || in >= arr.length) {
            return arr;
        }
        
      	String[] arr2 = new String[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {
                //If the current i is the index, skip that copy
                if (i == in) continue;
			//k increases every time but the index
          	arr2[k++] = arr[i];
        }

        return arr2;
    }
    private static String[] ShuffleArray (String[] inArray){
        Random rand = new Random();
        //go through array
        for (int i = 0; i < inArray.length; i++) {
            //set random target index
            int randomIndexToSwap = rand.nextInt(inArray.length);
            //set a temp variable to the value at that index
            String temp = inArray[randomIndexToSwap];
            //set the target array element to the current element value
            inArray[randomIndexToSwap] = inArray[i];
            //set the current element to the temp variable value
            inArray[i] = temp;
        }
        return inArray;
    }
    private static String printArray (String[] inArray){
        //make the String that will store the array items, comma separated
        //It has the first item in the list
        String returnString = "\n" + inArray[0];
        //go through array
        for (int i = 1; i < inArray.length; i++) {
            returnString = returnString + "\n" + inArray[i];
        }
        return returnString;
    }
}
