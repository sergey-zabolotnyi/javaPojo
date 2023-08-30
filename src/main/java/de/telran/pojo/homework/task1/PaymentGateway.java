package de.telran.pojo.homework.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PaymentGateway {
    @Autowired
    @Qualifier("orderBean")
    private Order order;

    public void processPayment() {
        System.out.println("Processing payment for item: " + order.getItem() +
                " with price: " + order.getPrice());
    }
}
