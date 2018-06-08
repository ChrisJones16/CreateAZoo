package com.company.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PeopleMenu {

    private Scanner input = new Scanner(System.in);

    //handles People options
    private void managePeople() {

        try {

            System.out.println("Are you " + "\n1. A Visitor" + "\n2. An Employee" + "\n Go Back" + "\n Exit Program");

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
                    mainMenu();
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
}
