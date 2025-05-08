package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_usuario")
@Data
public class Usuario {
    @Id
    private String idUsuario;
    private String passwd;
}
