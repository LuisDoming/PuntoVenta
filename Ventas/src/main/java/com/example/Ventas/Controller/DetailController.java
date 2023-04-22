package com.example.Ventas.Controller;

import com.example.Ventas.Entity.Detail;
import com.example.Ventas.Services.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/ventas")
public class DetailController {

    @Autowired
    private final DetailService detailService;

    public DetailController(DetailService detailService) {
        this.detailService = detailService;
    }

    @GetMapping("{idDetalle}")
    public Optional<Detail> getById(@PathVariable("idDetalle") Integer id){
        return detailService.getDetalle(id);
    }

    @PostMapping
    public void saveOrUpdate(@RequestBody Detail detalle){
        detailService.saveOrUpdate(detalle);
    }

    @GetMapping
    public Optional<Detail> getDetalle(Integer id){
        return detailService.getDetalle(id);
    }

    @DeleteMapping("{idDetalle}")
    public void deleteDetalle(@PathVariable("idDetalle") Integer id){
        detailService.detele(id);
    }
}
