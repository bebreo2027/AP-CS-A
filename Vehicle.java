/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicle;

/**
 *
 * @author bebreo2027
 */
// The Base Vehicle Class, implements the Speedometer interface
public class Vehicle implements Speedometer{
    //base (Class wide) variables
    protected String brandName = "";
    protected double speed = 0.0;
    protected int passengers = 0;
    protected String color = "White";
    
    public static void main(String[] args) {
        Car car1 = new Car("Lexus", 140, 4, "Red", 25);
        car1.setSpoiler(true);
        System.out.println(car1);
        Car car2 = new Car("Honda", 125, 5, "Gray", 30);
        car2.setStereo(true);
        System.out.println(car2);
        Boat boat1 = new Boat("Bruce's Big Blues", 20, 9, "White", "Water Wyvern", "Motor");
        System.out.println(boat1);
        Boat boat2 = new Boat("CSA Sailers", 10, 6, "Green", "Speedhunt", "Sail");
        System.out.println(boat2);
        Airplane plane1 = new Airplane("Voom", 160, 50, "White", "Water Wyvern", "Motor");
        System.out.println(plane1);
        Airplane plane2 = new Airplane("Skyyp", 180, 40, "Green", "Speedhunt", "Sail");
        System.out.println(plane2);
    }
    //Base default constructor
    public Vehicle(){
        brandName = "";
        speed = 0.0;
        passengers = 0;
        color = "";
    }
    public Vehicle(String inBrand, double inSpeed, int inPassengers, String inColor){
        brandName = inBrand;
        speed = inSpeed;
        passengers = inPassengers;
        color = inColor;
    }
    //getters and setters
    public Vehicle(String inBrand){
        brandName = inBrand;
    }
    public String getBrand(){
        return brandName;
    }
    public void setBrandName(String inBrand){
        brandName = inBrand;
    }
    public double getSpeed(){
        return speed;
    }
    public void setSpeed(double inSpeed){
        speed = inSpeed;
    }
    public int getPassengers(){
        return passengers;
    }
    public void setPassengers(int inPassengers){
        speed = inPassengers;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String inColor){
        color = inColor;
    }
    //Base toString
    public String toString(){
    return "Brand: \t\t\t" + getBrand() + "\n"
            + "Passengers: " + "\t\t" + getPassengers() + "\n"
            + "Speed in MPH" + "\t\t" + getSpeed() + "\n"
            + "Color: " + "\t\t\t" + getColor() + "\n";
    }
}
//the Speedometer interface to show the speed of any vehicle in the same way
interface Speedometer{
    public void setSpeed(double inSpeed);
    public double getSpeed();
}

