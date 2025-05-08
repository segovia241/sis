package com.example.demo.service;

import com.example.demo.model.Producto;
import com.example.demo.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    @Autowired private ProductoRepository repo;
    public List<Producto> listar() { return repo.findAll(); }
    public Producto guardar(Producto p) { return repo.save(p); }
}
