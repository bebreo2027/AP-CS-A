/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicle;

/**
 *
 * @author bebreo2027
 */
public class Airplane extends Vehicle{
    String wingspan = "";
    String altitude = "";
    
    
    public Airplane(String inBrand, double inSpeed, int inPassengers, String inColor, String inSpan, String inAlt){
        super(inBrand, inSpeed, inPassengers, inColor); //uses the super constructor
        wingspan = inSpan;
        altitude = inAlt;//also include the extra variables in the Airplane constructor
    }


    //uses the super toString, and adds the new variable to it.
    @Override
    public String toString(){
        return "Type:\t\t\tAirplane\n"
                 + super.toString() + "Wingspan:\t\t" + wingspan + "\n"
                + "Altitude in miles:\t" + altitude + "\n";
    }
}

