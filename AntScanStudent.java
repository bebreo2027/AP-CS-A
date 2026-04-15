/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package antscanstudent;

/**
 *
 * @author bebreo2027
 */
import java.io.BufferedWriter;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AntScanStudent {
    //public class ReadFileWithScanner {
    public static void main(String[] args) {
        // Create a File object representing the file
        File file = new File("Students/Students.txt");
        int intLine = 0;
        Scanner read;
        String n = "", e = "";
        int g = 0;
        Scanner s = new Scanner(System.in);
        boolean isLooping = false;
        do {
            try (Scanner scanner = new Scanner(file)) {
                //make an arrayList to store student objects
                ArrayList<Student> studentList = new ArrayList<Student>();
                // Read the file line by line
                while (scanner.hasNextLine()) {
                    
                    String line = scanner.nextLine();
                    //create a Scanner to read the contents of the line
                    read = new Scanner(line);
                    //make sure it reads comma separated
                    read.useDelimiter(",");
                    if(intLine >= 0){
                        //read the words in the correct order into the correct variables
                        n = read.next();
                        g = read.nextInt();
                        e = read.next();
                        Student r = new Student(n, g, e);
                        //print the object out to ensure we have created it
                        System.out.println(r);
                        studentList.add(r);
                    }
                        intLine++;
                    }
                    System.out.println("Input \"a\" to add contact details comma seperated,\n"
                    +          "\"e\" to order by email address,\n"
                            + "\"y\" to order by graduation year,\n"
                            + "or \"n\" to order by name");
                    //the switch statement that does the printed text above
                    String decision = s.nextLine();
                    switch(decision) {
                    case "a":
                        isLooping = true;
                        String contentToWrite = s.nextLine();
                        // Write to file
                        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Students/Students.txt",
                        true))) {
                            //writer.write(contentToWrite);
                            writer.append("\n" + contentToWrite);
                            System.out.println("Successfully wrote to the file.");
                        } catch (IOException i) {
                            System.err.println("An error occurred while writing to the file: " +
                            i.getMessage());
                        }
                      break;
                    case "e":
                        ArrayList<String> emailList = new ArrayList<String>();
                        for (int j = 0; j < studentList.size(); j++) {
                            emailList.add(studentList.get(j).getEmail());
                        }
                        emailList.sort(null);
                        for (int k = 0; k < studentList.size(); k++) {
                            System.out.println(emailList.get(k));
                        }
                      break;
                    case "y":
                        ArrayList<Integer> gradList = new ArrayList<Integer>();
                        for (int l = 0; l < studentList.size(); l++) {
                            gradList.add(studentList.get(l).getGradYear());
                        }
                        gradList.sort(null);
                        for (int m = 0; m < studentList.size(); m++) {
                            System.out.println(gradList.get(m));
                        }
                      break;
                    case "n":
                        ArrayList<String> nameList = new ArrayList<String>();
                        for (int j = 0; j < studentList.size(); j++) {
                            nameList.add(studentList.get(j).getEmail());
                        }
                        nameList.sort(null);
                        for (int o = 0; o < studentList.size(); o++) {
                            System.out.println(nameList.get(o));
                        }
                      break;
                    default:
                  }
                } catch (FileNotFoundException f) {
                    // Handle the case where the file is not found
                    System.out.println("An error occurred.");
                    f.printStackTrace();
                }
        } while (isLooping);
    }         
}


class Student{
    private String name = "";
    private String email = "";
    private int grad = 0;
    private String function = "";
    public Student(String n, int g, String e){
    name = n;
    grad = g;
    email = e;
    }
        
    //toString to output what we got
    public String toString(){
        String result = "";
        result = "Name: " + name +"\n" +
        "Graduation year: " + grad + "\n" +
        "Email: " + email + "\n";
        return result;
    }
    public String getEmail(){
        return email;
    }
    public String getName(){
        return name;
    }
    public int getGradYear(){
        return grad;
    }
}