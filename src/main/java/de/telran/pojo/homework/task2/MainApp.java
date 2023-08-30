package de.telran.pojo.homework.task2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MainApp {
    public static void main(String[] args) {
        Product product1 = new Product(UUID.randomUUID(), "P1", "iMac", new BigDecimal("1500.0"));
        Product product2 = new Product(UUID.randomUUID(), "P2", "MacBook", new BigDecimal("1200.0"));
        Product product3 = new Product(UUID.randomUUID(), "P3", "NacBook Air", new BigDecimal("1000.0"));
        Product product4 = new Product(UUID.randomUUID(), "P4", "iPhone", new BigDecimal("700.0"));

        List<Product> cart1 = new ArrayList<>();
        cart1.add(product1);
        cart1.add(product2);

        Customer customer1 = new Customer(UUID.randomUUID(), "Andrej", cart1);

        List<Product> cart2 = new ArrayList<>();
        cart2.add(product3);
        cart2.add(product4);

        Customer customer2 = new Customer(UUID.randomUUID(), "Sergej", cart2);

        List<Product> cart3 = new ArrayList<>();
        cart3.add(product2);
        cart3.add(product4);

        Customer customer3 = new Customer(UUID.randomUUID(), "Ruslan", cart3);

        printInfo(customer1);
        printInfo(customer2);
        printInfo(customer3);
    }
    static void printInfo(Customer customer){
        System.out.println("Cart amount for " + customer.getName() + " - " + customer.getCartAmount() + " Euro.");
    }
}