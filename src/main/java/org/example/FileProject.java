package org.example;
//Problem Statement
//You are given a CSV file named grades.csv with the following format:
//StudentID,StudentName,Grade
//
//Example grades.csv:
//Code snippet
//101,Alice,88
//        102,Bob,92
//        103,Charlie,75
//
//Your task is to write a Java program that:
//        1. Reads the grades.csv file.
//        2. Parses each line to extract the student ID, name, and grade.
//3. Performs data validation:
//        ○ The Student ID must be a positive integer.
//        ○ The Grade must be a valid integer between 0 and 100.
//        4. Handles potential errors gracefully:
//        ○ FileNotFoundException if grades.csv does not exist.
//        ○ NumberFormatException if the Student ID or Grade is not a valid number.
//        ○ A custom InvalidGradeException if a grade is outside the 0-100 range.
//5. Calculates the average grade of all valid student records.
//6. Prints a summary report to the console, including the total number of records processed,
//the number of invalid records, and the average grade.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
class reader {
    public static void read() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("grades.csv"));
        String line;

        while ((line = br.readLine()) != null) {
            // Split line by comma
            String[] values = line.split(",");

            // Print values
            for (String value : values) {
                System.out.print(value + "  ");
            }
            System.out.println();
        }

        br.close();

    }
}
public class FileProject{
    public static void main(String[] args) throws IOException {
        reader.read();

    }
}




class InvalidGradeException extends Exception{
    public InvalidGradeException(String message){
        super(message);
    }
}
class StudentRecord{
    int studentID;
    String studentName;
    int grade;
    public StudentRecord
}