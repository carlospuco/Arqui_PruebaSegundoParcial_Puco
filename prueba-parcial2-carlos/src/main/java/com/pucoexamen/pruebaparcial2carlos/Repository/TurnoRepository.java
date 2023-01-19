package com.pucoexamen.pruebaparcial2carlos.Repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pucoexamen.pruebaparcial2carlos.Model.Turno;

public interface TurnoRepository extends CrudRepository<Turno, String>{
    

    List<Turno> findByCedulaCliente(String cedulaCliente);
    List<Turno> findByNombreCliente(String nombreCliente);
    List<Turno> generateNextTurno (String  numeroCuenta);
    List<Turno> findByCalificacion (BigDecimal calificaion);
}
