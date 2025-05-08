package com.example.demo.service;

import com.example.demo.model.Cliente;
import com.example.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired private ClienteRepository repo;
    public List<Cliente> listar() { return repo.findAll(); }
    public Cliente guardar(Cliente c) { return repo.save(c); }
}
