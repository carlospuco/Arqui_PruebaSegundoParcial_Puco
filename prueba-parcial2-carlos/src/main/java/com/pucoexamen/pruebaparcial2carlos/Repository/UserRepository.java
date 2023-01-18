package com.pucoexamen.pruebaparcial2carlos.Repository;

import org.springframework.data.repository.CrudRepository;

import com.pucoexamen.pruebaparcial2carlos.Model.User;



public interface UserRepository extends CrudRepository<User, String> {

}
