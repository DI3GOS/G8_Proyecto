package com.grupo8.gras.models;


import javax.persistence.*;

@Entity
@Table(name = "instructores")
public class instructorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Integer id_instructor;
    private String nombre_instructor;
    private String apellido_instructor;
    private Integer edad_instructor;
    private String direccion_instructor;
    private Integer telefono_instructor;
    private String email_instructor;


    public Integer getId_instructor() {
        return id_instructor;
    }
    public void setId_instructor(Integer id_instructor) {
        this.id_instructor = id_instructor;
    }
    public String getNombre_instructor() {
        return nombre_instructor;
    }
    public void setNombre_instructor(String nombre_instructor) {
        this.nombre_instructor = nombre_instructor;
    }
    public String getApellido_instructor() {
        return apellido_instructor;
    }
    public void setApellido_instructor(String apellido_instructor) {
        this.apellido_instructor = apellido_instructor;
    }
    public Integer getEdad_instructor() {
        return edad_instructor;
    }
    public void setEdad_instructor(Integer edad_instructor) {
        this.edad_instructor = edad_instructor;
    }
    public String getDireccion_instructor() {
        return direccion_instructor;
    }
    public void setDireccion_instructor(String direccion_instructor) {
        this.direccion_instructor = direccion_instructor;
    }
    public Integer getTelefono_instructor() {
        return telefono_instructor;
    }
    public void setTelefono_instructor(Integer telefono_instructor) {
        this.telefono_instructor = telefono_instructor;
    }
    public String getEmail_instructor() {
        return email_instructor;
    }
    public void setEmail_instructor(String email_instructor) {
        this.email_instructor = email_instructor;
    }

    
}
    