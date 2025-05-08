package com.example.demo.service;

import com.example.demo.model.Pedido;
import com.example.demo.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository repo;

    public List<Pedido> listar() {
        return repo.findAll();
    }

    public Pedido guardar(Pedido p) {
        return repo.save(p);
    }

    public Pedido obtenerPorId(String id) {
        return repo.findById(id).orElse(null);
    }

    public void eliminar(String id) {
        repo.deleteById(id);
    }
}
