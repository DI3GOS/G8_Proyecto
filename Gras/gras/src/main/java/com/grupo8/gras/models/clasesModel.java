package com.grupo8.gras.models;

import javax.persistence.*;

@Entity
@Table(name = "clases")
public class clasesModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id_clase;
    private String nombre_clase;
    private String descripcion;

    
    public Integer getId_clase() {
        return id_clase;
    }
    public void setId_clase(Integer id_clase) {
        this.id_clase = id_clase;
    }
    public String getNombre_clase() {
        return nombre_clase;
    }
    public void setNombre_clase(String nombre_clase) {
        this.nombre_clase = nombre_clase;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}