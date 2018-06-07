package com.company.inventory;

public class Souvenirs extends Items {

    private String type;
    private int idNumber;


    public Souvenirs(double price, String itemName, int quantity, String dateReceived, String type, int idNumber) {
        super(price, itemName, quantity, dateReceived);
        this.type = type;
        this.idNumber = idNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}
