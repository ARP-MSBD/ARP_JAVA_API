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
public class UserAccount {
    @Id
    private String code;

    private String firstName;
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "document_type_fk")
    private DocumentType documentType;

    @ManyToOne
    @JoinColumn(name = "user_type_fk")
    private UserType userType;

    private String passwordHash;
    private String email;
    private String phoneNumber;
    private Boolean blocked;

    @ManyToOne
    @JoinColumn(name = "job_fk")
    private JobType job;

    @ManyToOne
    @JoinColumn(name = "address_fk")
    private Address address;
}