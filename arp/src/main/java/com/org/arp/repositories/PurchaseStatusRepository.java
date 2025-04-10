package com.org.arp.repositories;

import com.org.arp.entities.PurchaseStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseStatusRepository extends JpaRepository<PurchaseStatus, Integer> {}