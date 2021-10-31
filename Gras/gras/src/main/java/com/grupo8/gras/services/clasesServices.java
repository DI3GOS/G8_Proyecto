package com.grupo8.gras.services;

import java.util.ArrayList;

import com.grupo8.gras.models.clasesModel;
import com.grupo8.gras.repositories.clasesRepositories;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class clasesServices {
    
@Autowired
    private clasesRepositories clasesR;

    public ArrayList<clasesModel> obtenerClases(){
        return (ArrayList<clasesModel>) clasesR.findAll();
    }

    public clasesModel guardarClases(clasesModel clases){
        return clasesR.save(clases);
    }

    public void deleteById(int userId) {
        clasesR.deleteById(userId);
    }
  
}