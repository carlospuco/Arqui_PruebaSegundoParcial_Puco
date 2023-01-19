package com.pucoexamen.pruebaparcial2carlos.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pucoexamen.pruebaparcial2carlos.Model.Cuenta;

public interface CuentaRepository extends CrudRepository<Cuenta, String>{
    

    List<Cuenta> findByAll();

}
