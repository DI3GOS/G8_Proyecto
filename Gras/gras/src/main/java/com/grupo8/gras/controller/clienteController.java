package com.grupo8.gras.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.grupo8.gras.models.clienteModel;
import com.grupo8.gras.services.clienteServices;


@RestController
//localhost:8080/cliente/
@RequestMapping("/cliente")
public class clienteController {
    @Autowired
    private clienteServices clienteServices;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ArrayList<clienteModel> obtenerClientes(){
        return this.clienteServices.obtenerClientes();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public clienteModel guardarClientes(@RequestBody clienteModel clasesModel){
        return this.clienteServices.guardarClientes(clasesModel);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        clienteServices.deleteById(id);
    }


}