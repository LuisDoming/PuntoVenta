package com.example.Productos.Controller;

import com.example.Productos.Entity.UnidadMedida;
import com.example.Productos.Services.UnidadMedidaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/Products")
public class UnidadMedidaController {

    @Autowired
    private final UnidadMedidaServices unidadMedidaServices;

    public UnidadMedidaController(UnidadMedidaServices unidadMedidaServices) {
        this.unidadMedidaServices = unidadMedidaServices;
    }

    @GetMapping("{idUnidadMedida}")
    public Optional<UnidadMedida> getById(@PathVariable("idUnidadMedida") Integer id){
        return unidadMedidaServices.getUnidad(id);
    }

    @PostMapping
    public void saveOrUpdate(@RequestBody UnidadMedida unidad){
        unidadMedidaServices.saveOrUpdate(unidad);
    }

    @GetMapping
    public Optional<UnidadMedida> getUnidad(Integer id){
        return unidadMedidaServices.getUnidad(id);
    }

    @DeleteMapping("{idUnidadMedida}")
    public void deleteUnidad(@PathVariable("idUnidadMedida") Integer id){
        unidadMedidaServices.detele(id);
    }
}
