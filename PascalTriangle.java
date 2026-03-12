/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pascaltriangle;
import java.util.ArrayList;
/**
 *
 * @author bebreo2027
 */
public class PascalTriangle {

    public static void main(String[] args) 
    {
        System.out.println(makePascal(10));
    }
    static ArrayList<ArrayList<Integer>> makePascal(int n) 
    {
        
         ArrayList<ArrayList<Integer>> triRows = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            
            for (int j = 0; j <= i; j++) {
                // First and last elements are always 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // Calculate the value based on the two above values
                    int value = triRows.get(i - 1).get(j - 1) + triRows.get(i - 1).get(j);
                    row.add(value);
                }
            }
            triRows.add(row); // Add the newly created row to the triangle
        }

        return triRows;
    }  
}
