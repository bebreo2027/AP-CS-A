/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicle;

/**
 *
 * @author bebreo2027
 */
public class Tank extends Vehicle{
    double cannonballSize;
    double noisyness;
    
    
    public Tank(String inBrand, double inSpeed, int inPassengers, String inColor, double inCannon, double inNoisy){
        super(inBrand, inSpeed, inPassengers, inColor); //uses the super constructor
        cannonballSize = inCannon;
        noisyness = inNoisy;//also include the extra variables in the Tank constructor
    }


    //uses the super toString, and adds the new variable to it.
    @Override
    public String toString(){
        return "Type:\t\t\tTank\n"
                 + super.toString() + "Diameter of cannonball in feet: " + cannonballSize + "\n"
                + "Noisyness in decibels:\t" + noisyness + "\n";
    }
}