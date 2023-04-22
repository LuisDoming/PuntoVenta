package com.example.Productos.Services;

import com.example.Productos.Entity.Product;
import com.example.Productos.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServices {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAll(){
        return productRepository.findAll();
    }

    public Optional<Product> getProduct(Integer id){
        return productRepository.findById(id);
    }

    public void  saveOrUpdate(Product producto){
        productRepository.save(producto);
    }

    public void detele(Integer id){
        productRepository.deleteById(id);
    }
}
