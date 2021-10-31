package com.grupo8.gras.controller;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grupo8.gras.models.loginModel;
import com.grupo8.gras.services.loginServices;

@RestController

//localhost:8080/login/
@RequestMapping("/login")
public class loginController {
    @Autowired
    private loginServices dService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ArrayList<loginModel> obtenerUsuarios(){
        return this.dService.obtenerUsuarios();
    }

 

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String buscarUsuarioYPassword(@RequestBody loginModel usuario){
        //Obtengo todos los usuarios
        ArrayList<loginModel> users = dService.obtenerUsuarios();
        //Hago un forEach de arraylist que es **users**
        //En una variable temporal **userTemp** traigo la información de cada usermodel
        for (loginModel userTemp : users) {
            if (userTemp.getNombre_usuario().equals(usuario.getNombre_usuario())) {
                if (userTemp.getPassword_usuario().equals(usuario.getPassword_usuario())) {
                    return userTemp.getRol_usuario();
                }
            }
        }
        return "El Nombre de Usuario o el Password son incorrectos.";
    }  


   

    

}
