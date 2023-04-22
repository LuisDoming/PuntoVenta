package com.example.Ventas.Repository;

import com.example.Ventas.Entity.Detail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailRepository extends JpaRepository<Detail,Integer> {
}
