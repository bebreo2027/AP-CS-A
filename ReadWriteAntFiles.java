/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package readwriteantfiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteAntFiles {
    public static void main(String[] args) {
        String filePath = "Contacts/example.txt";
        String contentToWrite = "Yuji Itadori, yitadori@jujutsutech.com, 2021, yitadori2021\n"
                +               "Yuta Okkotsu, yokkotsu@jujutsutech.com, 2020, yokkotsu2020\n"
                +               "Aoi Todo, atodo@jujutsutech.com, 2019, atodo2019";
        // Write to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,
        true))) {
            //writer.write(contentToWrite);
            writer.append(contentToWrite + "\n");
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " +
            e.getMessage());
        }
        // Read from file
        try (BufferedReader reader = new BufferedReader(new
        FileReader(filePath))) {
            String line;
            System.out.println("\nReading from the file:");
            while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        } catch (IOException e) {
            System.err.println("An error occurred while reading from the file: "
            + e.getMessage());
        }
        System.out.println("Add more: ");
        Scanner s = new Scanner(System.in);
        contentToWrite = s.nextLine();
        // Write to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,
        true))) {
            //writer.write(contentToWrite);
            writer.append(contentToWrite + "\n");
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " +
            e.getMessage());
        }
        // Read from file
        try (BufferedReader reader = new BufferedReader(new
        FileReader(filePath))) {
            String line;
            System.out.println("\nReading from the file:");
            while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        } catch (IOException e) {
            System.err.println("An error occurred while reading from the file: "
            + e.getMessage());
        }
    }
}