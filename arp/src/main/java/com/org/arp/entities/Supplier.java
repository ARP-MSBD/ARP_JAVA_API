package com.org.arp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Supplier {
    @Id
    private String code;

    private String name;
    private String phone;
    private String taxId;
    private String email;

    @ManyToOne
    @JoinColumn(name = "supplier_status_fk")
    private SupplierStatus supplierStatus;
}
