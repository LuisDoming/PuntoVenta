package com.example.Clientes.Services;

import com.example.Clientes.Entity.Client;
import com.example.Clientes.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServices {

    @Autowired
    ClientRepository clientRepository;

    public List<Client> getAll(){
        return clientRepository.findAll();
    }

    public Optional<Client> getClient(Integer id){
        return clientRepository.findById(id);
    }

    public void  saveOrUpdate(Client cliente){
        clientRepository.save(cliente);
    }

    public void detele(Integer id){
        clientRepository.deleteById(id);
    }
}
