package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter a game score: ");
        String input = keyboard.nextLine();
            // Home:Visitor|21:9
        String[] half = input.split(Pattern.quote("|"));
        String teams = half[0];
        String scores = half[1];
            //half[0] Home:Visitor
            //half[1] 21:9

        String[] split_teams = teams.split(Pattern.quote(":"));
            //split_teams[0] Home
            //split_teams[1] Visitor
        String team1 = split_teams[0];
        String team2 = split_teams[1];

        String[] split_scores = scores.split(Pattern.quote(":"));
        //split_scores[0] 21
        //split_scores[1] 9

        int teamScore1 = Integer.parseInt(split_scores[0]);
        int teamScore2 = Integer.parseInt(split_scores[1]);

        if(teamScore1 > teamScore2) {
            System.out.println("Winner: " + team1);
        } else if(teamScore2 > teamScore1) {
            System.out.println("Winner: " + team2);
        } else {
            System.out.println("Winner: Draw");
        }

    }
}
