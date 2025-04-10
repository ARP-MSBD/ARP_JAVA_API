package com.org.arp.repositories;

import com.org.arp.entities.PurchaseSupplierProduct;
import com.org.arp.entities.PurchaseSupplierProductId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseSupplierProductRepository extends JpaRepository<PurchaseSupplierProduct, PurchaseSupplierProductId> {}