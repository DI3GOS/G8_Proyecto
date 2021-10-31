package com.grupo8.gras.services;

import java.util.ArrayList;

import com.grupo8.gras.models.horariosModel;
import com.grupo8.gras.repositories.horariosRepositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class horariosServices {
    
@Autowired
    private horariosRepositories horariosR;

    public ArrayList<horariosModel> obtenerHorarios(){
        return (ArrayList<horariosModel>) horariosR.findAll();
    }

    public horariosModel guardarHorarios(horariosModel horarios){
        return horariosR.save(horarios);
    }

    public void deleteById(int userId) {
        horariosR.deleteById(userId);
    }

}