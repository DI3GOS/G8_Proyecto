package com.grupo8.gras.models;


import javax.persistence.*;

@Entity
@Table(name = "login")
public class loginModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id_login;
    private String nombre_usuario;
    private String password_usuario;
    private String rol_usuario;


    public Integer getId_login() {
        return id_login;
    }
    public void setId_login(int id_login) {
        this.id_login = id_login;
    }
    public String getNombre_usuario() {
        return nombre_usuario;
    }
    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }
    public String getPassword_usuario() {
        return password_usuario;
    }
    public void setPassword_usuario(String password_usuario) {
        this.password_usuario = password_usuario;
    }
    public String getRol_usuario() {
        return rol_usuario;
    }
    public void setRol_usuario(String rol_usuario) {
        this.rol_usuario = rol_usuario;
    }

    
}