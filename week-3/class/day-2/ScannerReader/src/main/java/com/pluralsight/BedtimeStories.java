package com.pluralsight;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {

    public static void main(String[] args) {

        do {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter the name of a story: goldilocks.txt,  hansel_and_gretel.txt, or mary_had_a_little_lamb.txt");
            System.out.println("Or type exit to close program");
            String filename = keyboard.nextLine();

            switch (filename) {
                case "goldilocks.txt":
                case "hansel_and_gretel.txt":
                case "mary_had_a_little_lamb.txt":
                    storyReader(filename);
                    break;
                case "exit":
                    keyboard.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect file name entered");
            }
            
        } while(true);
    }

    public static void storyReader(String filename) {
        try {
            // create a FileInputStream object pointing to
            // a specific file
            FileInputStream fis = new FileInputStream("src/main/resources/" + filename);
            // create a Scanner to reference the file to be read
            Scanner scanner = new Scanner(fis);
            String input;
            int lineCount = 1;

            // read until there is no more data
            while (scanner.hasNextLine()) {
                input = scanner.nextLine();
                System.out.println(lineCount + ". " + input);
                lineCount++;
            }
            // close the scanner and release the resources
            scanner.close();
        } catch (IOException e) {
            // display stack trace if there was an error
            e.printStackTrace();
        }
    }
}
