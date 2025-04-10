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
public class Sale {
    @Id
    private String code;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private BigDecimal totalValue;
    private Integer totalQuantity;
    private String saleNumber;

    @ManyToOne
    @JoinColumn(name = "sale_status_fk")
    private SaleStatus saleStatus;

    @ManyToOne
    @JoinColumn(name = "invoice_code")
    private Invoice invoice;
}