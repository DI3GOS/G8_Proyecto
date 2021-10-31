package com.grupo8.gras.controller;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grupo8.gras.models.clasesModel;
import com.grupo8.gras.services.clasesServices;


@RestController
//localhost:8080/clases/
@RequestMapping("/clases")
public class clasesController {
    @Autowired
    private clasesServices clasesServices;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ArrayList<clasesModel> obtenerClases(){
        return this.clasesServices.obtenerClases();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public clasesModel guardarClases(@RequestBody clasesModel clasesModel){
        return this.clasesServices.guardarClases(clasesModel);
    }
    


    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        clasesServices.deleteById(id);
    }


}
