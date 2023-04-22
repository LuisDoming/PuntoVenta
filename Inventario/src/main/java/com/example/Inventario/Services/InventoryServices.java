package com.example.Inventario.Services;

import com.example.Inventario.Entity.Inventory;
import com.example.Inventario.Repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryServices {

    @Autowired
    InventoryRepository inventoryRepository;

    public List<Inventory> getAll(){
        return inventoryRepository.findAll();
    }

    public Optional<Inventory> getInventario(Integer id){
        return inventoryRepository.findById(id);
    }

    public void  saveOrUpdate(Inventory inventario){
        inventoryRepository.save(inventario);
    }

    public void detele(Integer id){
        inventoryRepository.deleteById(id);
    }

}
