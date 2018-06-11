package com.company.menu;

import com.company.people.Employee;
import com.company.people.Visitor;

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
                    createPerson(2);
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
                    createPerson(1);
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

    private void createPerson(int location) {

        //if location == 1 its a new employee; if location == 2 its a new visitor
        if (location == 1) {

            System.out.println("What is the employees age?");
            int employeeAge = input.nextInt();
            input.nextLine();
            System.out.println("What is the employee's name?");
            String employeeName = input.nextLine();
            System.out.println("What gender is the employee?");
            char employeeGender = input.nextLine().charAt(0); //use 0 bcuz 0 is the base
            System.out.println("What is the employee's race?");
            String employeeRace = input.nextLine();
            System.out.println("What is the employee's number?");
            int employeeNumber = input.nextInt();
            input.nextLine();
            System.out.println("What is the employee's job title?");
            String employeeJobTitle = input.nextLine();
            System.out.println("What is the employee's hire date?");
            String employeeHireDate = input.nextLine();

            Employee newEmployee = new Employee(employeeAge, employeeName, employeeGender, employeeRace, employeeNumber,
             employeeJobTitle, employeeHireDate);

            //TODO Add Employee to Employee List

        } else if (location == 2) {

            System.out.println("What is the visitor's age?");
            int visitorAge = input.nextInt();
            input.nextLine();
            System.out.println("What is the visitor's name?");
            String visitorName = input.nextLine();
            System.out.println("What is the vsiitor's gender?");
            char visitorGender = input.nextLine().charAt(0);
            System.out.println("What is the visitors race?");
            String visitorRace = input.nextLine();
            System.out.println("What is the visitor's group size?");
            int visitorGroupSize = input.nextInt();
            input.nextLine();
            System.out.println("Does the visitor have a membership?");
            boolean hasAMembership = input.nextBoolean();
            input.nextLine();
            System.out.println("What is the visitor's home address?");
            String visitorAddress = input.nextLine();

            Visitor newVisitor = new Visitor();

        }

    }
}

