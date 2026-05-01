/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eatinggame;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


/**
 *
 * @author bebreo2027
 */
public class EatingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This is the Eating Game! You are what you eat!");
        // Create a File object representing the file
        File nameFile = new File("Foods/Names.txt");
        File scoreFile = new File("Foods/Scores.txt");
        File messageFile = new File("Foods/Messages.txt");
        Scanner readName;
        Scanner readScore;
        Scanner readMessage;
        int intLine = 0;
        Scanner input = new Scanner(System.in);
        try (Scanner nameScanner = new Scanner(nameFile)){
            try (Scanner scoreScanner = new Scanner(scoreFile)){
                try (Scanner messageScanner = new Scanner(messageFile)){
                    while (nameScanner.hasNextLine()) {
                    
                    //create scanners to read the contents of the line
                    readName = new Scanner(nameScanner.nextLine());
                    readScore = new Scanner(scoreScanner.nextLine());
                    readMessage = new Scanner(messageScanner.nextLine());
                    //make sure it reads comma separated
                    readScore.useDelimiter(",");
                    if(intLine >= 0){
                        //read the words in the correct order into the correct variables
                        Food currentFood = new Food(readName.nextLine(), readScore.nextInt(), readScore.nextInt(), readMessage.nextLine());
                        System.out.println("\nThere is a " + currentFood.getName() + " in your path.\n"
                                + "Eat it? (Input y to eat)");
                        String eatOrNot = input.nextLine();
                        if (eatOrNot.equalsIgnoreCase("Y")) {
                            strength += currentFood.getAddStren();
                            convenience += currentFood.getAddConv();
                            eatenFoods.add(currentFood.getName());
                            System.out.println(currentFood.getName() + " eaten!\n"
                                    + currentFood);
                        } else {
                            System.out.println("Did not eat the " + currentFood.getName());
                        }
                        
                    }
                        intLine++;
                    }
                } catch (Exception e) {
                    System.err.println("An error occurred while reading from the file: "
                    + e.getMessage());
                }
            } catch (Exception e) {
                System.err.println("An error occurred while reading from the file: "
                + e.getMessage());
            }
            
        } catch (Exception e) {
            System.err.println("An error occurred while reading from the file: "
            + e.getMessage());
        }
        System.out.println("The foods you've eaten:\n" + eatenFoods + "\n"
                + "Your strength score: " + strength
                        + "\nYour convenience score: " + convenience);
        
        if (strength < 2) {
            System.out.println("You're pretty weak!");
        } else if (strength < 5) {
            System.out.println("You're around as strong as Robin");

        } else if (strength < 10) {
            System.out.println("You're around as strong as Spider-Man");
        } else if (strength < 15) {
            System.out.println("You're around as strong as Naruto");
        } else if (strength < 20) {
            System.out.println("You're around as strong as Hulk");
        } else {
            System.out.println("You're around as strong as Superman!");
        }
        if (convenience < -3) {
            System.out.println("and day to day life is almost impossible!");
        } else if (convenience < 0) {
            System.out.println("and day to day life is slightly harder");

        } else if (convenience < 2) {
            System.out.println("and day to day life is manageable");

        } else if (convenience < 5){
            System.out.println("and day to day life is pretty fun!");
        } else {
            System.out.println("and day to day life is a blast!");
        }
        if (eatenFoods.isEmpty()) {
            System.out.println("You didn't eat anything!?");
        }
        if (strength > 7 && convenience > 5) {
            System.out.println("You win!");

        } else {
            System.out.println("Better luck next time!");
        }
   }
    static int convenience = 0;
    static int strength = 0;
    static ArrayList<String> eatenFoods = new ArrayList<String>();
    
    
}

class Food {
    public Food(String inName, int inStrength, int inConvenience, String inMessage) {
        name = inName;
        addConvenience = inConvenience;
        addStrength = inStrength;
        message = inMessage;
    }

    String name = "";
    int addConvenience = 0;
    int addStrength = 0;
    String message = "";
    public String toString() {
        return message;
    }

    public String getName(){
        return name;
    }
    public int getAddConv(){
        return addConvenience;
    }
    public int getAddStren(){
        return addStrength;
    }
   
}