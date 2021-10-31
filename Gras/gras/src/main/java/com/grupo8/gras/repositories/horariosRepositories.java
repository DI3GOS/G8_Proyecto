package com.grupo8.gras.repositories;

import com.grupo8.gras.models.horariosModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface horariosRepositories  extends CrudRepository<horariosModel,Integer>{
}

