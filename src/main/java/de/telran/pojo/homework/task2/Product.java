package de.telran.pojo.homework.task2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;
@Data
@AllArgsConstructor
public class Product {
    private UUID id;
    private String code;
    private String label;
    private BigDecimal price;
}
