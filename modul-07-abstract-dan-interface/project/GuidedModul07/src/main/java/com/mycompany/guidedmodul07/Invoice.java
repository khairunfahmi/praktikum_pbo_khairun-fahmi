package com.mycompany.guidedmodul07;

public class Invoice implements Payable {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // four-argument constructor
    public Invoice(String part, String description, int count, double price) {
        this.partNumber = part;
        this.partDescription = description;
        setQuantity(count);
        setPricePerItem(price);
    }

    public void setPartNumber(String part) {
        this.partNumber = part;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String description) {
        this.partDescription = description;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setQuantity(int count) {
        this.quantity = (count < 0) ? 0 : count;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPricePerItem(double price) {
        this.pricePerItem = (price < 0.0) ? 0.0 : price;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    @Override
    public String toString() {
        return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f",
                "invoice", "part number", getPartNumber(), getPartDescription(),
                "quantity", getQuantity(), "price per item", getPricePerItem());
    }

    @Override
    public double getPaymentAmount() {
        return getQuantity() * getPricePerItem();
    }
}