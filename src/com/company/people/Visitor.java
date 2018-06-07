package com.company.people;

public class Visitor extends People {

    private int groupSize;
    private String allergies;
    private boolean hasMembership;
    private String homeAddress;


    public Visitor(int age, String name, char gender, String race, int groupSize, boolean hasMembership, String homeAddress) {
        super(age, name, gender, race);
        this.groupSize = groupSize;
        this.hasMembership = hasMembership;
        this.homeAddress = homeAddress;
    }

    public int getGroupSize() {
        return groupSize;
    }

    public void setGroupSize(int groupSize) {
        this.groupSize = groupSize;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public boolean isHasMembership() {
        return hasMembership;
    }

    public void setHasMembership(boolean hasMembership) {
        this.hasMembership = hasMembership;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
}
