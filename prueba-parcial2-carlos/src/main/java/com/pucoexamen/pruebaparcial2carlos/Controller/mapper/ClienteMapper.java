package com.pucoexamen.pruebaparcial2carlos.Controller.mapper;

import com.pucoexamen.pruebaparcial2carlos.Controller.dto.ClienteRQ;
import com.pucoexamen.pruebaparcial2carlos.Controller.dto.ClienteRS;
import com.pucoexamen.pruebaparcial2carlos.Model.Cliente;

public class ClienteMapper {

    public static ClienteRQ toClienteRQ(ClienteRQ rq) {
        return ClienteRQ.builder()
                .nombres(rq.getNombres())
                .apellidos(rq.getApellidos())
                .telefono(rq.getTelefono())
                .email(rq.getEmail()).build();
            }
    

    public static ClienteRS toClienteRS(Cliente rs) {
        return ClienteRS.builder()
        .nombres(rs.getNombres())
        .apellidos(rs.getApellidos())
        .telefono(rs.getTelefono())
        .email(rs.getEmail()).build();
    }

}

