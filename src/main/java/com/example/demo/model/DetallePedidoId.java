package com.example.demo.model;

import lombok.*;

import java.io.Serializable;

@Data
public class DetallePedidoId implements Serializable {
    private String idPedido;
    private String idProd;
}
