/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zeeshan.arrays;

import java.io.*;
import java.nio.file.Paths;
/**
 *
 * @author ZAhmad
 */
public class FileNameExtractor {
     public static void main(String[] args) {
        // Input and Output File paths
        String outputDirectory = "D:\\DIS_PROJECT\\";

        String inputFile = "D:\\DIS_PROJECT\\Java-files.txt";
        String outputFile = outputDirectory + "Java-Extracted-File.txt";

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;

             while ((line = reader.readLine()) != null) {
                line = line.trim();

                if (!line.isEmpty()) {
                    // Remove double quotes if present
                    if (line.startsWith("\"") && line.endsWith("\"")) {
                        line = line.substring(1, line.length() - 1);
                    }

                    // Extract file name from path
                    String fileName = Paths.get(line).getFileName().toString();
                    writer.write(fileName);
                    writer.newLine();
                }
            }

            System.out.println("File names extracted successfully to: " + outputFile);

        } catch (IOException e) {
            System.err.println("Error processing files: " + e.getMessage());
        }
    }
}



