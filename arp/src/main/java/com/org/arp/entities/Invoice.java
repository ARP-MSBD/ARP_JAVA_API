package com.org.arp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {
    @Id
    private String code;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String invoiceFileUrl;
}