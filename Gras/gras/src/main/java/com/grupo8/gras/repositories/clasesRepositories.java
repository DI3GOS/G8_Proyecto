package com.grupo8.gras.repositories;


import com.grupo8.gras.models.clasesModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface clasesRepositories  extends CrudRepository<clasesModel,Integer>{
}
