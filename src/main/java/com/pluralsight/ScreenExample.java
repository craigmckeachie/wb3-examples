package com.pluralsight;

import java.util.Scanner;

public class ScreenExample {
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        runMainScreen();

    }

    private static void runMainScreen() {
        boolean programIsRunning = true;


        while (programIsRunning){
            System.out.print("""
                            What do you want to do?
                             F) First Screen
                             S) Second Screen
                             X) Exit
                            Enter your command: """);


            String command = input.nextLine().toLowerCase();

            switch(command){
                case "f" -> runFirstScreen();
                case "s" -> runSecondScreen();
                case "x" -> programIsRunning = false;
                default -> System.out.println("Invalid command try again.");
            }

        }
    }

    private static void runFirstScreen(){
        boolean firstScreenIsRunning = true;

        while(firstScreenIsRunning) {

            System.out.println("First Screen");
            System.out.println("-------------");
            System.out.println();
            System.out.println();

            System.out.println("R) Return to main menu");
            System.out.print("Choose an option: ");
            String choice = input.nextLine().trim().toLowerCase();

            switch(choice){
                case "r"-> firstScreenIsRunning = false;
            }
        }
    }

    private static void runSecondScreen(){
        boolean secondScreenIsRunning = true;

        while(secondScreenIsRunning) {

            System.out.println("Second Screen");
            System.out.println("-------------");
            System.out.println();
            System.out.println();

            System.out.println("R) Return to main menu");
            System.out.print("Choose an option: ");
            String choice = input.nextLine().trim().toLowerCase();

            switch(choice){
                case "r"-> secondScreenIsRunning = false;
            }
        }
    }


}
