package com.grupo8.gras.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.grupo8.gras.models.horariosModel;
import com.grupo8.gras.services.horariosServices;


@RestController
//localhost:8080/clases/
@RequestMapping("/horarios")
public class horariosController {
    @Autowired
    private horariosServices horariosServices;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ArrayList<horariosModel> obtenerHorarios(){
        return this.horariosServices.obtenerHorarios();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public horariosModel guardarHorarios(@RequestBody horariosModel instructor){
        return this.horariosServices.guardarHorarios(instructor);
    }

    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        horariosServices.deleteById(id);
    }


}
