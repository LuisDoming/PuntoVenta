package com.example.Ventas.Controller;

import com.example.Ventas.Entity.Sale;
import com.example.Ventas.Services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/ventas")
public class SaleController {

    @Autowired
    private final SaleService saleService;

    public SaleController(SaleService saleService) {
        this.saleService = saleService;
    }

    @GetMapping("{idVenta}")
    public Optional<Sale> getById(@PathVariable("idVenta") Integer id){
        return saleService.getVenta(id);
    }

    @PostMapping
    public void saveOrUpdate(@RequestBody Sale venta){
        saleService.saveOrUpdate(venta);
    }

    @GetMapping
    public Optional<Sale> getVenta(Integer id){
        return saleService.getVenta(id);
    }

    @DeleteMapping("{idVenta}")
    public void deleteVenta(@PathVariable("idVenta") Integer id){
        saleService.detele(id);
    }
}
