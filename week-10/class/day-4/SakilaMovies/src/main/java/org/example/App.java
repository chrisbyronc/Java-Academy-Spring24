package org.example;

import java.util.List;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        if (args.length != 2) {
            System.out.println(
                    "Application needs two arguments to run: " +
                            "java com.hca.jdbc.UsingDriverManager <username> " +
                            "<password>");
            System.exit(1);
        }

        // Get the username and password
        String username = args[0];
        String password = args[1];

        SakilaDataManager sdm = new SakilaDataManager(username, password);

        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Please enter a last name you want to search: ");

        String userLastNameChoice = keyboardInput.nextLine();

        List<Actor> foundActors = sdm.getActorByLastName(userLastNameChoice);


        System.out.println(foundActors);
    }
}
