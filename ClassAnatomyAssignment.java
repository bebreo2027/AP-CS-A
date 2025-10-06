/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classanatomyassignment;

/**
 *
 * @author bebreo2027
 */
public class ClassAnatomyAssignment {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    class Car {
        private String carBrand = "";
        public Car(String inBrand){
        carBrand = inBrand;
    }
        public String toString(){
        String myString = "The Car Brand Is: " + carBrand;
        return myString;
}
    
    
}
}
