package com.example.Ventas.Services;

import com.example.Ventas.Entity.Detail;
import com.example.Ventas.Repository.DetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetailService {

    @Autowired
    DetailRepository detailRepository;

    public List<Detail> getAll(){
        return detailRepository.findAll();
    }

    public Optional<Detail> getDetalle(Integer id){
        return detailRepository.findById(id);
    }

    public void  saveOrUpdate(Detail detalle){
        detailRepository.save(detalle);
    }

    public void detele(Integer id){
        detailRepository.deleteById(id);
    }
}
