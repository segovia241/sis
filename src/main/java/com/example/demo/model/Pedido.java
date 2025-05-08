package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "t_pedido")
@Data
public class Pedido {
    @Id
    private String idPedido;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Cliente cliente;

    private LocalDate fecha;
    private BigDecimal subTotal;
    private BigDecimal totalVenta;
}
