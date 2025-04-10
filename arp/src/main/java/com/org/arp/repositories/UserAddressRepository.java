package com.org.arp.repositories;

import com.org.arp.entities.UserAddress;
import com.org.arp.entities.UserAddressId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAddressRepository extends JpaRepository<UserAddress, UserAddressId> {}