package com.pucoexamen.pruebaparcial2carlos.Model;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
@Document(collection = "turnos")
@CompoundIndexes({
    @CompoundIndex(name = "idxu_tunos_typeIdentificationIdentification", def = "{'identificationType': 1, 'identification': 1}", unique = true)
})
public class Turno {
    

    @Id
    private String numeroTurno;

    @Indexed
    private Date fechaHoraGeneracion;
    private Date fechaHoraInicioAtencion;
    private Date fechaHoraFinAtencion;
    private BigDecimal calificacion;
}
