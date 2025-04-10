package com.org.arp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(SupplierProductId.class)
public class SupplierProduct {
    @Id
    @Column(name = "supplier_code")
    private String supplierCode;

    @Id
    @Column(name = "product_code")
    private String productCode;

    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "supplier_code", insertable = false, updatable = false)
    private Supplier supplier;

    @ManyToOne
    @JoinColumn(name = "product_code", insertable = false, updatable = false)
    private Product product;
}