package com.org.arp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(ProductUserSaleId.class)
public class ProductUserSale {
    @Id
    @Column(name = "user_code")
    private String userCode;

    @Id
    @Column(name = "product_code")
    private String productCode;

    @Id
    @Column(name = "sale_code")
    private String saleCode;

    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "user_code", insertable = false, updatable = false)
    private UserAccount user;

    @ManyToOne
    @JoinColumn(name = "product_code", insertable = false, updatable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "sale_code", insertable = false, updatable = false)
    private Sale sale;
}