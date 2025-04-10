package com.org.arp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(PurchaseSupplierProductId.class)
public class PurchaseSupplierProduct {
    @Id
    @Column(name = "supplier_code")
    private String supplierCode;

    @Id
    @Column(name = "product_code")
    private String productCode;

    @Id
    @Column(name = "purchase_code")
    private String purchaseCode;

    @ManyToOne
    @JoinColumn(name = "supplier_code", insertable = false, updatable = false)
    private Supplier supplier;

    @ManyToOne
    @JoinColumn(name = "product_code", insertable = false, updatable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "purchase_code", insertable = false, updatable = false)
    private Purchase purchase;
}