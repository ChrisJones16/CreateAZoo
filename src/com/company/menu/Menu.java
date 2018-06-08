package com.company.menu;

import com.company.people.People;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner input = new Scanner(System.in);

    //void can be any data type and doesn't return a value

    public void mainMenu() {

        try {

            System.out.println("Please choose an option. " +
                    "\n1. Manage People" +
                    "\n2. Manage Animals" +
                    "\n3. Manage inventory" +
                    "\n4. Exit Program");

            // handles user input for navigation

            switch (input.nextInt()) {
                case 1:
                    //Manage people
                    managePeople();
                    break;
                case 2:
                    //manage animals
                    manageAnimals();
                    break;
                case 3:
                    //manage inventory
                    manageInventory();
                    break;
                case 4:
                    System.out.println("Thank you for using the Zoo Program");
                    System.exit(0);
                    break;
                default:
                    //Handle wrong number
                    System.out.println("That is not a valid entry.  Please enter a number between 1 and 4.");
                    //Restart method to allow user to try again
                    mainMenu(); //recursion
                    break;
            }
        } catch (InputMismatchException ime) {
            //handle if a user puts in something that is not an int
            input.nextLine();
            System.out.println("That is not a valid entry.  Please enter a number between 1 and 4.");
            mainMenu();
        }
    }

    //Handles inventory options
    private void manageInventory() {

        try {
            //enter code here that you would like to run that MAY have an exception
        } catch (InputMismatchException ime) {
            // What you want your program to do IF this exception happens
        }

    }

    //handles Animal options
    private void manageAnimals() {

    }

    //handles visitor options
    private void manageVisitor() {

    }

    //handles Employee options
    private void manageEmployee() {

    }
}
