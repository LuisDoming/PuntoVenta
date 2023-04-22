package com.example.Productos.Services;

import com.example.Productos.Entity.UnidadMedida;
import com.example.Productos.Repository.UnidadMedidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UnidadMedidaServices {

    @Autowired
    UnidadMedidaRepository unidadMedidaRepository;

    public List<UnidadMedida> getAll(){
        return unidadMedidaRepository.findAll();
    }

    public Optional<UnidadMedida> getUnidad(Integer id){
        return unidadMedidaRepository.findById(id);
    }

    public void  saveOrUpdate(UnidadMedida unidadMedida){
        unidadMedidaRepository.save(unidadMedida);
    }

    public void detele(Integer id){
        unidadMedidaRepository.deleteById(id);
    }
}
