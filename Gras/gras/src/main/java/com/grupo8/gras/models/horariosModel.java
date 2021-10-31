package com.grupo8.gras.models;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "horarios")
public class horariosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Integer id_horario;
    private Date fecha_fin;
    private Date fecha_inicio;

    private Integer id_cliente;
    private Integer id_clase;
    private Integer id_instructor;

    public Integer getId_horario() {
        return id_horario;
    }

    public void setId_horario(Integer id_horario) {
        this.id_horario = id_horario;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Integer getId_clase() {
        return id_clase;
    }

    public void setId_clase(Integer id_clase) {
        this.id_clase = id_clase;
    }

    public Integer getId_instructor() {
        return id_instructor;
    }

    public void setId_instructor(Integer id_instructor) {
        this.id_instructor = id_instructor;
    }

}
