package de.telran.pojo.homework.task2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.UUID;
@Data
@AllArgsConstructor
public class Customer {
    private UUID id;
    private String name;
    private List<Product> cart;

    public double getCartAmount() {
        double total = 0;
        for (Product product : cart) {
            total += product.getPrice().doubleValue();
        }
        return total;
    }
}
