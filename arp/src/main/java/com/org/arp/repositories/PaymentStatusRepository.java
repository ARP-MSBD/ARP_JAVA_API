package com.org.arp.repositories;

import com.org.arp.entities.PaymentStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentStatusRepository extends JpaRepository<PaymentStatus, Integer> {}