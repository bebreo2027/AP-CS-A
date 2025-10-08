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
        //Make objects for, and print out the brand, power, speed and price of:
        //The VW Bug
        Car bugCar = new Car("VW Bug", 20_000, 160.0, 30_000);
        System.out.println (bugCar.toString() + "\n"
                + bugCar.getPower() + " in horsepower" + "\n"
                + bugCar.getSpeed() + " in MPH" + "\n"
                + bugCar.getPrice() + " in dollars" + "\n");
        //Toyota Prius
        Car priusCar = new Car("Toyota Prius", 40_000, 110.0, 20_000);
        System.out.println (priusCar.toString() + "\n"
                + priusCar.getPower() + " in horsepower"  + "\n"
                + priusCar.getSpeed() + " in MPH" + "\n"
                + priusCar.getPrice() + " in dollars" + "\n");
        //BMW i8
        Car bmwCar = new Car("BMW i8", 50_000, 130.0, 18_000);
        System.out.println (bmwCar.toString() + "\n"
                + bmwCar.getPower() + " in horsepower"  + "\n"
                + bmwCar.getSpeed() + " in MPH" + "\n"
                + bmwCar.getPrice() + " in dollars" + "\n");
        //Tesla Model 3
        Car teslaCar = new Car("Tesla Model 3", 55_000, 170.0, 40_000);
        System.out.println (teslaCar.toString() + "\n"
                + teslaCar.getPower() + " in horsepower"  + "\n"
                + teslaCar.getSpeed() + " in MPH" + "\n"
                + teslaCar.getPrice() + " in dollars");
    }
    
    
}

class Car {
        //Initialize variables for:
        //car brand,
        //engine power in horsepower,
        //max speed in MPH,
        //and price in $
        private String carBrand = "";
        private int enginePower = 0;
        private double maxSpeed = 0.0;
        private double price = 0.0;
        //Prepare a constructor to produce the base car
        public Car(String inBrand, int inPower, double inSpeed, double inPrice){
        carBrand = inBrand;
        enginePower = inPower;
        maxSpeed = inSpeed;
        price = inPrice;
    }
       
        //The constructor to get the value of carBrand
        public String toString(){
        String myString = "The Car Brand Is: " + carBrand;
        return myString;
        }
        //The constructor to get the value of the engine power
        public String getPower() {
        String myString = "The Engine Power Is: " + String.valueOf(enginePower);
        return myString;
        }
        //The constructor to get the value of the speed
        public String getSpeed() {
        String myString = "The Max Speed Is: " + String.valueOf(maxSpeed);
        return myString;
        }
        //The constructor to get the value of the price
        public String getPrice() {
        String myString = "The Price Is: " + String.valueOf(price);
        return myString;
        }
        }
        
    