package com.pucoexamen.pruebaparcial2carlos.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pucoexamen.pruebaparcial2carlos.Model.Ejecutivo;

public interface EjecutivoRepository  extends CrudRepository<Ejecutivo, String>{
    List<Ejecutivo> findAll();
}
