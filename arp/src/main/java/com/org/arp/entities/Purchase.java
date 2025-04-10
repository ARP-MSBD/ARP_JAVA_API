package com.org.arp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Purchase {
    @Id
    private String code;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private BigDecimal totalValue;
    private Integer totalQuantity;
    private Integer purchaseNumber;

    @ManyToOne
    @JoinColumn(name = "purchase_status_fk")
    private PurchaseStatus purchaseStatus;

    @ManyToOne
    @JoinColumn(name = "invoice_code")
    private Invoice invoice;
}