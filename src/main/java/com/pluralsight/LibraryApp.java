package com.pluralsight;

import java.util.Scanner;

public class LibraryApp {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        runMainScreen();
    }

    // LEVEL 1: Main entry point
    private static void runMainScreen() {
        boolean isRunning = true;
        while (isRunning) {
            System.out.print("""
                \n--- LIBRARY MAIN MENU ---
                1) Catalog Management
                2) Member Services
                X) Exit Application
                Enter command: \s""");

            String choice = input.nextLine().toLowerCase().trim();
            switch (choice) {
                case "1" -> runCatalogScreen();
                case "2" -> runMemberScreen();
                case "x" -> isRunning = false;
                default -> System.out.println("Invalid input.");
            }
        }
    }

    // LEVEL 2: Catalog Domain
    private static void runCatalogScreen() {
        boolean inCatalog = true;
        while (inCatalog) {
            System.out.print("""
                \n  --- CATALOG MANAGEMENT ---
                  1) Search for Books
                  A) Add New Book
                  R) Return to Main Menu
                  Enter command: \s""");

            String choice = input.nextLine().toLowerCase().trim();
            switch (choice) {
                case "1" -> runBookSearchScreen(); // Moves to Level 3
                case "a" -> System.out.println("  [Action] Logic to add a book executed.");
                case "r" -> inCatalog = false; // Returns to Level 1
                default -> System.out.println("  Invalid input.");
            }
        }
    }

    // LEVEL 2: Member Domain
    private static void runMemberScreen() {
        boolean inMemberServices = true;
        while (inMemberServices) {
            System.out.print("""
                \n  --- MEMBER SERVICES ---
                  A) Register New Member
                  R) Return to Main Menu
                  Enter command: \s""");

            String choice = input.nextLine().toLowerCase().trim();
            switch (choice) {
                case "a" -> System.out.println("  [Action] Logic to register member executed.");
                case "r" -> inMemberServices = false; // Returns to Level 1
                default -> System.out.println("  Invalid input.");
            }
        }
    }

    // LEVEL 3: Deep task within the Catalog
    private static void runBookSearchScreen() {
        boolean inSearch = true;
        while (inSearch) {
            System.out.println("\n    --- BOOK SEARCH ---");
            System.out.print("""
                \n    Options:
                    S) Start Title Search
                    B) Back to Catalog
                    Enter command: \s""");

            String choice = input.nextLine().toLowerCase().trim();
            switch (choice) {
                case "s" -> System.out.println("    [Action] Searching library database...");
                case "b" -> inSearch = false; // Returns to Level 2
                default -> System.out.println("    Invalid input.");
            }
        }
    }
}