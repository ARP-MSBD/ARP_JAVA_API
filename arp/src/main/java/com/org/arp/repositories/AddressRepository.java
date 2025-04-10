package com.org.arp.repositories;

import com.org.arp.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AddressRepository extends JpaRepository<Address, String> {}