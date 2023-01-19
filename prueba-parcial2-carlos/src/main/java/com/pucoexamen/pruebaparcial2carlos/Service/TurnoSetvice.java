package com.pucoexamen.pruebaparcial2carlos.Service;

import java.util.Optional;

import com.pucoexamen.pruebaparcial2carlos.Model.Turno;
import com.pucoexamen.pruebaparcial2carlos.Repository.TurnoRepository;

public class TurnoSetvice {
    
    private final TurnoRepository turnoRepository;

    public TurnoSetvice(TurnoRepository turnoRepository) {
        this.turnoRepository = turnoRepository;
    }
    


    public Turno obtenerPorTipoYIdentificacion(String cedulaCliente, String nombreCliente) {
        return this.turnoRepository.findByCedulaClienteNombreandClienteCedula(cedulaCliente, nombreCliente);
    }


    public void crearTurno(Turno turnoService) {
        try {
            this.turnoRepository.save(turnoService);
        } catch (Exception e) {
            new RuntimeException("Problemas al crear turno:" + e);
        }

    }

}
