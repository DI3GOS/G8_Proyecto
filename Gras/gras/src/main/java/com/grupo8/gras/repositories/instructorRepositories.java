package com.grupo8.gras.repositories;


import com.grupo8.gras.models.instructorModel;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface instructorRepositories  extends CrudRepository<instructorModel,Integer>{
}


