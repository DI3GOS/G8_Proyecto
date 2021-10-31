package com.grupo8.gras.repositories;

import com.grupo8.gras.models.loginModel;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface loginRepositories  extends CrudRepository<loginModel,Integer>{
}

