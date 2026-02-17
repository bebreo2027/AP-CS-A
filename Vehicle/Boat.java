/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicle;

/**
 *
 * @author bebreo2027
 */

public class Boat extends Vehicle{
    String name = "";
    String poweredBy = "";
    
    
    public Boat(String inBrand, double inSpeed, int inPassengers, String inColor, String inName, String inPower){
        super(inBrand, inSpeed, inPassengers, inColor); //uses the super constructor
        name = inName;
        poweredBy = inPower;//also include the extra variables in the boat constructor
    }
    //getters are used in the toString
    public void setName(String inName){
        name = inName;
    }

    public String getName(){
        return name;
    }
    
    public void setPower(String inPower){
        poweredBy = inPower;
    }

    public String getPower(){
        return poweredBy;
    }
   
    //uses the super toString, and adds the new variable to it.
    @Override
    public String toString(){
        return "Type:\t\t\tBoat\n"
                 + super.toString() + "Name:\t\t\t" + this.getName() + "\n"
                + "Powered by:\t\t" + getPower() + "\n";
    }
}
