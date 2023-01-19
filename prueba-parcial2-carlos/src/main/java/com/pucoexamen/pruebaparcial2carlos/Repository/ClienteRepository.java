package com.pucoexamen.pruebaparcial2carlos.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pucoexamen.pruebaparcial2carlos.Model.Cliente;



public interface ClienteRepository extends CrudRepository<Cliente, String> {

    List<Cliente> findAll(); 
}
