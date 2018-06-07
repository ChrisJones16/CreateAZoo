package com.company.people;

public class Employees extends People {

    private int employeeNumber;
    private String jobTitle;
    private String hireDate;
    private int hours;


    public Employees(int age, String name, char gender, String race, int employeeNumber, String jobTitle, String hireDate) {
        super(age, name, gender, race);
        this.employeeNumber = employeeNumber;
        this.jobTitle = jobTitle;
        this.hireDate = hireDate;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
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

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
