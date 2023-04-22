package com.example.Ventas.Repository;

import com.example.Ventas.Entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface SaleRepository extends JpaRepository<Sale, Integer> {
}
