package com.grupo8.gras.repositories;

import com.grupo8.gras.models.clienteModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface clienteRepositories  extends CrudRepository<clienteModel,Integer>{
}

