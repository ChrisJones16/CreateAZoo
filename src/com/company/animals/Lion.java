package com.company.animals;

public class Lion extends Animal {

    private double noseSize;
    private double ManeLength;
    private boolean isTrained;


    public Lion(String name, String location, char gender, double weight, double maneLength, boolean isTrained) {
        super(name, location, gender, weight);
        ManeLength = maneLength;
        this.isTrained = isTrained;
    }


    public double getNoseSize() {
        return noseSize;
    }

    public void setNoseSize(double noseSize) {
        this.noseSize = noseSize;
    }

    public double getManeLength() {
        return ManeLength;
    }

    public void setManeLength(double maneLength) {
        ManeLength = maneLength;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }
}
