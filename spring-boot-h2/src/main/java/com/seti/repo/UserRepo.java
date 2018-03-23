package com.seti.repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.seti.model.User;


@Repository
public interface  UserRepo extends  CrudRepository<User, Long>   {

}
