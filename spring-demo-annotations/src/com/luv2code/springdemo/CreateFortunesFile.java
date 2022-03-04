package com.luv2code.springdemo;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateFortunesFile {
    private static Formatter output;
    private static final Scanner scanner = new Scanner(System.in);

    public static void openFile() {
        try {
            output = new Formatter("fortunes.txt");
        } catch (SecurityException e) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1);
        } catch (FileNotFoundException e) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }

    public static void addRecords() {
        System.out.printf("%s%s%n* ",
                "Enter fortunes",
                "Enter end-of-file indicator to end input.");

        while (scanner.hasNext()) {
            try{
                output.format("%s %n", scanner.nextLine());
            } catch (FormatterClosedException e) {
                System.err.println("Error writing to file. Terminating.");
                break;
            } catch (NoSuchElementException e) {
                System.err.println("Invalid input. Please try again.");
                scanner.nextLine();
            }
            System.out.print("* ");
        }
    }

    public static void closeFile() {
        if (output != null) output.close();
    }

    public static void main(String[] args) {
        try {
            openFile();
            addRecords();
            closeFile();
        } finally {
            scanner.close();
        }
    }


}
