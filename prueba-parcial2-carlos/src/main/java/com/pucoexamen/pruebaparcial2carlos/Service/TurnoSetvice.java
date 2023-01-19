package com.pucoexamen.pruebaparcial2carlos.Service;

import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

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


    @Transactional
	public void updateTurno(Turno turno) {
		Turno turnoEntity = this.turnoRepository.findAll().iterator().next();
		turnoEntity.setFechaHoraFinAtencion(turno.getFechaHoraFinAtencion());
		turnoEntity.setFechaHoraGeneracion(turno.getFechaHoraGeneracion());
        turnoEntity.setFechaHoraFinAtencion(turno.getFechaHoraInicioAtencion());
        turnoEntity.setCalificacion(turno.getCalificacion());
		this.turnoRepository.save(turnoEntity);

	}

}
