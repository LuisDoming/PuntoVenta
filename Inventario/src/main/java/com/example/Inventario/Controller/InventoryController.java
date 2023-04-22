package com.example.Inventario.Controller;

import com.example.Inventario.Entity.Inventory;
import com.example.Inventario.Services.InventoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/clients")
public class InventoryController {

    @Autowired
    private final InventoryServices inventoryServices;

    public InventoryController(InventoryServices inventoryServices) {
        this.inventoryServices = inventoryServices;
    }

    @GetMapping("{idInventario}")
    public Optional<Inventory> getById(@PathVariable("idInventario") Integer id){
        return inventoryServices.getInventario(id);
    }

    @PostMapping
    public void saveOrUpdate(@RequestBody Inventory inventario){
        inventoryServices.saveOrUpdate(inventario);
    }

    @GetMapping
    public Optional<Inventory> getInventario(Integer id){
        return inventoryServices.getInventario(id);
    }

    @DeleteMapping("{idInventario}")
    public void deleteInventario(@PathVariable("idInventario") Integer id){
        inventoryServices.detele(id);
    }
}
