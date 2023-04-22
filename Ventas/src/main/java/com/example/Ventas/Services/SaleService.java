package com.example.Ventas.Services;

import com.example.Ventas.Entity.Sale;
import com.example.Ventas.Repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SaleService {

    @Autowired
    SaleRepository saleRepository;

    public List<Sale> getAll(){
        return saleRepository.findAll();
    }

    public Optional<Sale> getVenta(Integer id){
        return saleRepository.findById(id);
    }

    public void  saveOrUpdate(Sale venta){
        saleRepository.save(venta);
    }

    public void detele(Integer id){
        saleRepository.deleteById(id);
    }
}
