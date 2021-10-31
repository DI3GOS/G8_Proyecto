package com.grupo8.gras.controller;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.grupo8.gras.models.instructorModel;
import com.grupo8.gras.services.instructorServices;


@RestController
//localhost:8080/instructor/
@RequestMapping("/instructor")
public class instructorController {
    @Autowired
    private instructorServices instructorService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ArrayList<instructorModel> obtenerInstructores(){
        return this.instructorService.obtenerInstructores();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public instructorModel guardarInstructor(@RequestBody instructorModel instructor){
        return this.instructorService.guardarInstructor(instructor);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        instructorService.deleteById(id);
    }


}