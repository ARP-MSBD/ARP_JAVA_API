package com.org.arp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductUserSaleId implements Serializable {
    private String userCode;
    private String productCode;
    private String saleCode;
}
