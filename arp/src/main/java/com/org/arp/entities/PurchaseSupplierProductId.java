package com.org.arp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseSupplierProductId implements Serializable {
    private String supplierCode;
    private String productCode;
    private String purchaseCode;
}