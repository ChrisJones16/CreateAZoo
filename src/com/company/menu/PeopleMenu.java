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

            System.out.println("Welcome Visitor to the Online Zoo. What do you wish to do?" +
                    "\n1. New Visitor?  " +
                    "\n2. View visitors" +
                    "\n3. Remove Visitor" +
                    "\n4. Edit Visitor" +
                    "\n5. Go Back" +
                    "\n6. Exit Program");

            switch (input.nextInt()) {
                case 1:
                    //handles new visitors
                    break;
                case 2:
                    //handles viewing visitors
                    break;
                case 3:
                    //handles Removing visitors
                    break;
                case 4:
                    //handles Editing visitors
                    break;
                case 5:
                    //handles going back
                    managePeople();
                    break;
                case 6:
                    //handles exiting the program
                    System.out.println("Thank you for using the Zoo Program");
                    System.exit(0);
                    break;
                default:
                    //handles wrong input
                    System.out.println("That is not a valid entry.  Please enter a number between 1 and 6.");
                    manageVisitor();
                    break;

            }

        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("That is not a valid entry.  Please enter a number between 1 and 6.");
            manageVisitor();
        }
    }

    private void manageEmployee() {

        try {

            System.out.println("Hello fellow employee. What do you wish to do?" +
                    "\n1. New Employee?" +
                    "\n2. View all employees" +
                    "\n3. Remove an employee" +
                    "\n4. Edit an employee" +
                    "\n5. Go Back" +
                    "\n6. Exit program");

            switch (input.nextInt()) {
                case 1:
                    //handles if new employee
                    break;
                case 2:
                    //handles viewing all employees

                case 3:
                    //handles removing an employee
                    break;

                case 4:
                    //handles editing and employee
                    break;

                case 5:
                    //handles going back to People menu
                    managePeople();
                    break;
                case 6:
                    //handles exiting the program
                    System.out.println("Thank you for using the Zoo Program");
                    System.exit(0);
                    break;
                default:
                    //handles wrong input
                    System.out.println("That is not a valid entry.  Please enter a number between 1 and 6.");
                    manageEmployee();
                    break;
            }
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("That is not a valid entry.  Please enter a number between 1 and 6.");
            manageEmployee();
        }

    }
}

