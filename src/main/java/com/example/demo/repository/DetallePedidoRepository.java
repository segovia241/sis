package com.example.demo.repository;

import com.example.demo.model.DetallePedido;
import com.example.demo.model.DetallePedidoId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetallePedidoRepository extends JpaRepository<DetallePedido, DetallePedidoId> {}
