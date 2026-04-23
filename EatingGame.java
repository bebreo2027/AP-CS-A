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
        System.out.println("This is the eating game! You are what you eat!");
        // Create a File object representing the file
        File file = new File("Students/Students.txt");
        Scanner read;
        int intLine = 0;
        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNextLine()) {
                    
                    String line = scanner.nextLine();
                    //create a Scanner to read the contents of the line
                    read = new Scanner(line);
                    //make sure it reads comma separated
                    read.useDelimiter(",");
                    if(intLine >= 0){
                        //read the words in the correct order into the correct variables
                        String name = read.next();
                        int conv = read.nextInt();
                        int stren = read.nextInt();
                        String mssg = read.next();
                        
                        //print the object out to ensure we have created it
                        System.out.println(r);
                        studentList.add(r);
                    }
                        intLine++;
                    }
        } catch (Exception e) {
            System.err.println("An error occurred while reading from the file: "
            + e.getMessage());
        }
    }
    int convenience = 10;
    int strength = 0;
    String message = "";
    ArrayList<String> eatenThings = new ArrayList<>();
    private void updateScores(String inName, int inConvenience, int inStrength, String inMessage){
        convenience += inConvenience;
        strength += inStrength;
        eatenThings.add(inName);
    }

}
