package com.company.people;

import java.util.List;

public class Employee extends People {

    //private so its can't be accessed
    private int employeeNumber;
    private String jobTitle;
    private String hireDate;
    private int hours;

    private List<Employee>employeeList;


    public Employee(int age, String name, char gender, String race, int employeeNumber, String jobTitle, String hireDate) {
        super(age, name, gender, race);
        this.employeeNumber = employeeNumber;
        this.jobTitle = jobTitle;
        this.hireDate = hireDate;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getHireDate() {
        return hireDate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
