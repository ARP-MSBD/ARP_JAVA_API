package com.org.arp.repositories;

import com.org.arp.entities.SupplierProduct;
import com.org.arp.entities.SupplierProductId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierProductRepository extends JpaRepository<SupplierProduct, SupplierProductId> {}