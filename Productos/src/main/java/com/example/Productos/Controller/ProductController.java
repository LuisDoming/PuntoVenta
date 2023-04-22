package com.example.Productos.Controller;

import com.example.Productos.Entity.Product;
import com.example.Productos.Services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/Products")
public class ProductController {

    @Autowired
    private final ProductServices productServices;

    public ProductController(ProductServices productServices) {
        this.productServices = productServices;
    }

    @GetMapping("{idProducto}")
    public Optional<Product> getById(@PathVariable("idProducto") Integer id){
        return productServices.getProduct(id);
    }

    @PostMapping
    public void saveOrUpdate(@RequestBody Product producto){
        productServices.saveOrUpdate(producto);
    }

    @GetMapping
    public Optional<Product> getProducto(Integer id){
        return productServices.getProduct(id);
    }

    @DeleteMapping("{idProducto}")
    public void deleteProducto(@PathVariable("idProducto") Integer id){
        productServices.detele(id);
    }
}
