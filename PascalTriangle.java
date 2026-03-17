/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pascaltriangle;
import java.util.ArrayList;
public class PascalTriangle {

    public static void main(String[] args) 
    {
        System.out.println(getPascalRow(5));
    }
    static ArrayList<Integer> getPascalRow(int m) 
    {
        ArrayList<Integer> currentRow = new ArrayList<>();
        final int n = m - 1;
        //Adds 1 at the beginning and returns an array with 1 if the parameter is 1
        currentRow.add(1);
            if (n != 0) {
                //Iterates the number of the current row, which is the same number as the number of values in each row minus the 1's
                if (n != 1) {
                    ArrayList<Integer> previousRow = getPascalRow(m - 1);
                    for (int i = 0; i < previousRow.size() - 1; i++) 
                    {
                       //Adds to the current row the previous row's values
                       currentRow.add(previousRow.get(i) + previousRow.get(i + 1));
                    }    
                }
                    //Adds 1 at the end and returns an array with [1, 1] if the parameter is 2
               currentRow.add(1);
            }
        return currentRow;
    }
}  

