package com.pucoexamen.pruebaparcial2carlos.Controller.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ClienteRQ implements Serializable {
    

    private String nombres;
    private String apellidos;
    private BigDecimal telefono;
    private String email;
}
