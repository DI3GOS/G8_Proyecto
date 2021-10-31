package com.grupo8.gras.services;

import java.util.ArrayList;

import com.grupo8.gras.models.instructorModel;
import com.grupo8.gras.repositories.instructorRepositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class instructorServices {
    
@Autowired
    private instructorRepositories instructorR;

    public ArrayList<instructorModel> obtenerInstructores(){
        return (ArrayList<instructorModel>) instructorR.findAll();
    }

    public instructorModel guardarInstructor(instructorModel instructor){
        return instructorR.save(instructor);
    }

    public void deleteById(int userId) {
        instructorR.deleteById(userId);
    }
}