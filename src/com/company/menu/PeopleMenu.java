package com.company.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PeopleMenu {

    private Scanner input = new Scanner(System.in);

    //handles People options
    protected void managePeople() {

        try {

            System.out.println("Are you " + "\n1. An Employee?" + "\n2. A Visitor?" + "\n3. Go Back" + "\n4. Exit Program");

            switch (input.nextInt()) {
                case 1:
                    //handle employee
                    manageEmployee();
                    break;
                case 2:
                    //handle Visitor
                    manageVisitor();
                    break;
                case 3:
                    //handle going back to main.menu()
                    Menu menu = new Menu();
                    menu.mainMenu();
                    break;
                case 4:
                    //handle exiting the program
                    System.out.println("Thank you for using the Zoo Program");
                    System.exit(0);
                    break;
                default:
                    //handle incorrect input
                    System.out.println("That is not a valid entry.  Please enter a number between 1 and 4.");
                    managePeople();
                    break;

            }
        } catch (InputMismatchException ime) {
            //handle any input that is not an int
            input.nextLine();
            System.out.println("That is not a valid entry.  Please enter a number between 1 and 4.");
            managePeople();
        }


    }

    private void manageVisitor() {

        try {

            System.out.println("Welcome Visitor to the Online Zoo. Have you visited our zoo before?" +
                    "\n1. Yes?" +
                    "\n2. No?" +
                    "\n3. Go Back" +
                    "\n4. Exit Program");

            switch (input.nextInt()) {
                case 1:
                    //handles if he says yes
                    manageIfYes();
                    break;
                case 2:
                    //handles if he says no
                    manageIfNo();

                    break;
                case 3:
                    //handles going back to main.menu()
                    Menu menu = new Menu();
                    menu.mainMenu();
                    break;
                case 4:
                    //handles exiting the program
                    System.out.println("Thank you for using the Zoo Program");
                    System.exit(0);
                    break;
                default:
                    //handles wrong input
                    System.out.println("That is not a valid entry.  Please enter a number between 1 and 4.");
                    manageVisitor();
                    break;

            }

        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("That is not a valid entry.  Please enter a number between 1 and 4.");
            manageVisitor();
        }


    }

    private void manageIfNo() {

        try {

        System.out.println("Welcome to the Online Zoo New Visitor! Would you like a membership?" +
                "\n1. yes?" +
                "\n2. no?" +
                "\n3. Go back" +
                "\n4. Exit Program");

        switch(input.nextInt()) {
            case 1:
                //handles if visitor wants a membership
                break;
            case 2:
                //handles if visitor doesn't want a membership
                break;
            case 3:
                Menu menu = new Menu();
                menu.mainMenu();
                break;
            case 4:
                System.out.println("Thank you for using the Zoo Program");
                System.exit(0);
                break;
            default:
                System.out.println("That is not a valid entry.  Please enter a number between 1 and 4.");
                manageIfNo();
                break;
            }
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("That is not a valid entry.  Please enter a number between 1 and 4.");
            manageIfNo();
        }
    }

    private void manageIfYes() {
        System.out.println("Welcome Back! Do you have a membership?");

    }

    private void manageEmployee() {

        try {

            System.out.println("Hello fellow employee. What do you wish to do?" +
                    "\n1. Sign in?" +
                    "\n2. Sign out?" +
                    "\n3. Go Back" +
                    "\n4. Exit program");

            switch (input.nextInt()) {
                case 1:
                    //handles if employee wants to sign in
                    break;
                case 2:
                    //handles if employee wants to sign out
                    break;
                case 3:
                    //handles going back to main.menu
                    Menu menu = new Menu();
                    menu.mainMenu();
                    break;
                case 4:
                    //handles exiting the program
                    System.out.println("Thank you for using the Zoo Program");
                    System.exit(0);
                    break;
                default:
                    //handles wrong input
                    System.out.println("That is not a valid entry.  Please enter a number between 1 and 4.");
                    manageEmployee();
                    break;
            }
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("That is not a valid entry.  Please enter a number between 1 and 4.");
            manageEmployee();
        }

    }
}

