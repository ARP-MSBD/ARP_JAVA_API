package com.org.arp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SalesOrder {
    @Id
    private String code;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "sale_code")
    private Sale sale;

    @ManyToOne
    @JoinColumn(name = "order_status_fk")
    private OrderStatus orderStatus;

    @ManyToOne
    @JoinColumn(name = "address_code")
    private Address address;
}