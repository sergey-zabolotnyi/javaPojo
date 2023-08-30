package de.telran.pojo.homework.task1;

public class Order {
    private String item;
    private double price;

    // Геттеры и сеттеры
    //@Required
    public void setItem(String item) {
        this.item = item;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public double getPrice() {
        return price;
    }
}