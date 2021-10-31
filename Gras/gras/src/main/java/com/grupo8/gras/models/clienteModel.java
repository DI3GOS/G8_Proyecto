package com.grupo8.gras.models;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class clienteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Integer id_cliente;
    private String nombre_cliente;
    private String apellido_cliente;
    private Integer edad_cliente;
    private String direccion_cliente;
    private Integer telefono_cliente;
    private String email_cliente;


    public Integer getId_cliente() {
        return id_cliente;
    }
    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }
    public String getNombre_cliente() {
        return nombre_cliente;
    }
    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }
    public String getApellido_cliente() {
        return apellido_cliente;
    }
    public void setApellido_cliente(String apellido_cliente) {
        this.apellido_cliente = apellido_cliente;
    }
    public Integer getEdad_cliente() {
        return edad_cliente;
    }
    public void setEdad_cliente(Integer edad_cliente) {
        this.edad_cliente = edad_cliente;
    }
    public String getDireccion_cliente() {
        return direccion_cliente;
    }
    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }
    public Integer getTelefono_cliente() {
        return telefono_cliente;
    }
    public void setTelefono_cliente(Integer telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }
    public String getEmail_cliente() {
        return email_cliente;
    }
    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }

    


    
}
    