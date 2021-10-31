package com.grupo8.gras.services;

import java.util.ArrayList;

import com.grupo8.gras.models.loginModel;
import com.grupo8.gras.repositories.loginRepositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginServices {
    
@Autowired
    private loginRepositories loginR;

    public ArrayList<loginModel> obtenerUsuarios(){
        return (ArrayList<loginModel>) loginR.findAll();
    }
    

}