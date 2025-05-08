package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "t_producto")
@Data
public class Producto {
    @Id
    private String idProd;

    private String descripcion;
    private BigDecimal costo;
    private BigDecimal precio;
    private int cantidad;
}
