package com.company.animals;

public class Rabbit extends Animal {

    private double earLength;
    private String furColor;
    private String favoriteFood;


    public Rabbit(String name, String location, char gender, double weight, double earLength, String furColor) {
        super(name, location, gender, weight);
        this.earLength = earLength;
        this.furColor = furColor;
    }


    public double getEarLength() {
        return earLength;
    }

    public void setEarLength(double earLength) {
        this.earLength = earLength;
    }

    public String getFurColor() {
        return furColor;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
}
