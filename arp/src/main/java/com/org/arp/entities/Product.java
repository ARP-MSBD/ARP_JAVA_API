package com.org.arp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    private String code;

    private String name;
    private BigDecimal price;
    private Integer stock;

    @ManyToOne
    @JoinColumn(name = "product_type_fk")
    private ProductType productType;
}