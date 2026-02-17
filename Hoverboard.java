/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicle;

/**
 *
 * @author bebreo2027
 */
public class Hoverboard extends Vehicle{
    double hoverHeight;
    double driftTime;
    double lightIntensity;
    
    public Hoverboard(String inBrand, double inSpeed, int inPassengers, String inColor, double inHover, double inDrift, double inLight){
        super(inBrand, inSpeed, inPassengers, inColor); //uses the super constructor
        hoverHeight = inHover;
        driftTime = inDrift;//also include the extra variables in the Hoverboard constructor
        lightIntensity = inLight;
    }


    //uses the super toString, and adds the new variable to it.
    @Override
    public String toString(){
        return "Type:\t\t\tHoverboard\n"
                 + super.toString() + "Height that the hoverboard can float in feet: " + hoverHeight + "\n"
                + "How many seconds it takes to turn a 90 degree angle at maximum speed: " + driftTime + "\n"
                + "Light intensity in lux: " + lightIntensity + "\n";
    }
}
