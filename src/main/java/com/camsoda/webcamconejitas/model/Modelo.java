package com.camsoda.webcamconejitas.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Modelo")

public class Modelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_Modelo")
    private Integer idModelo;

    @Column (name = "nombre_artista", nullable = false, length = 100)
    private String nombreArtista;

    @Column (name = "nombre", nullable = false, length = 100 )
    private String nombre;

    @Column (name = "apellido", nullable = false, length = 15)
    private String apellido;

    @Column (name = "correo", nullable = false, length = 100)
    private String correo;

    @Column (name = "telefono", nullable = false, length = 100)
    private String telefono;

    @Column(name = "fecha_registro", nullable = false, length = 100)
    private String fechaRegistro;

}