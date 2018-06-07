package com.company.inventory;

public class Food extends Items {

    private String category;
    private String expirationDate;
    private boolean isRefrigerated;


    public Food(double price, String itemName, int quantity, String dateReceived, String category, String expirationDate, boolean isRefrigerated) {
        super(price, itemName, quantity, dateReceived);
        this.category = category;
        this.expirationDate = expirationDate;
        this.isRefrigerated = isRefrigerated;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isRefrigerated() {
        return isRefrigerated;
    }

    public void setRefrigerated(boolean refrigerated) {
        isRefrigerated = refrigerated;
    }
}
