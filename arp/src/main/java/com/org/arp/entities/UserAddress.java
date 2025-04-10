package com.org.arp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(UserAddressId.class)
public class UserAddress {
    @Id
    @Column(name = "user_code")
    private String userCode;

    @Id
    @Column(name = "address_code")
    private String addressCode;

    @ManyToOne
    @JoinColumn(name = "user_code", insertable = false, updatable = false)
    private UserAccount user;

    @ManyToOne
    @JoinColumn(name = "address_code", insertable = false, updatable = false)
    private Address address;

    @ManyToOne
    @JoinColumn(name = "address_status_fk")
    private AddressStatus addressStatus;
}