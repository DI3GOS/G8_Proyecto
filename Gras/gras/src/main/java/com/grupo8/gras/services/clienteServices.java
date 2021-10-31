package com.grupo8.gras.services;

import java.util.ArrayList;

import com.grupo8.gras.models.clienteModel;
import com.grupo8.gras.repositories.clienteRepositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class clienteServices {
    
@Autowired
    private clienteRepositories clienteR;

    public ArrayList<clienteModel> obtenerClientes(){
        return (ArrayList<clienteModel>) clienteR.findAll();
    }

    public clienteModel guardarClientes(clienteModel clientes){
        return clienteR.save(clientes);
    }

    public void deleteById(int userId) {
        clienteR.deleteById(userId);
    }
}