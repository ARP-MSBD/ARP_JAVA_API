package com.org.arp.repositories;

import com.org.arp.entities.ProductUserSale;
import com.org.arp.entities.ProductUserSaleId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductUserSaleRepository extends JpaRepository<ProductUserSale, ProductUserSaleId> {}