/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehicle;

/**
 *
 * @author bebreo2027
 */
public class Car extends Vehicle{
    int wheels = 4;
    
    boolean spoiler = false;
    boolean stereo = false;
    double mpg = 0.0; //has an extra variable, mpg
    
    
    public Car(String inBrand, double inSpeed, int inPassengers, String inColor, double inMPG){
        super(inBrand, inSpeed, inPassengers, inColor); //uses the super constructor
        mpg = inMPG; //also include the extra variable in the Car constructor
    }
    //getters are used in the toString
    public void setSpoiler(boolean inSpoiler){
        spoiler = inSpoiler;
    }

    public boolean getSpoiler(){
        return spoiler;
    }
    public void setStereo(boolean inStereo){
        stereo = inStereo;
    }

    public boolean getStereo(){
        return stereo;
    }
    //overrides the super getSpeed method
    @Override
    public double getSpeed() {
        if (spoiler) {
            return super.getSpeed() + 20;
        } else {
            return super.getSpeed();
        }
    }
    public void setMpg(double mpg) {
        this.mpg = mpg;
    }
    public double getMPG() {
        if (spoiler) {
            return mpg - (mpg / 10);
        } else {
            return mpg;
        }
    }
    //usesd the super toString, as well as addingnthe new variable to it.
    @Override
    public String toString(){
        return "Type:\t\t\tCar\n" + super.toString() + "MPG:\t\t\t" + this.getMPG() + "\n";
    }
}
