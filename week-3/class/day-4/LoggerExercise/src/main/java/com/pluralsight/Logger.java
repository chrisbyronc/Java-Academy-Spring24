package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Logger {
    public static void main(String[] args) {

        logAction("launch");

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Enter a search term (X to exit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("X")) {
                logAction("exit");
                System.exit(0);
            } else {
                logAction("search : " + input);
            }
        }
    }

    public static void logAction(String action) {
        //D.R.Y
        
        try {
            FileWriter fw = new FileWriter("log.txt", true);
            BufferedWriter logger = new BufferedWriter(fw);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");//2024-04-25 10:25:08
            String timestamp = LocalDateTime.now().format(formatter);

            logger.write(timestamp + " " + action);
            logger.newLine(); //adds new line
            logger.close();

        } catch(IOException e){
            e.printStackTrace();
        }

    }
}
