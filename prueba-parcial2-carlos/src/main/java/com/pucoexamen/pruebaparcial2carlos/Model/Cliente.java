package com.pucoexamen.pruebaparcial2carlos.Model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.el.lang.ELArithmetic.BigDecimalDelegate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "cliente")
@CompoundIndexes({
        @CompoundIndex(name = "idxu_clients_typeIdentificationIdentification", def = "{'identificationType': 1, 'identification': 1}", unique = true)
})
public class Cliente {
    @Id
    private String cedula;

    @Indexed
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;
    private String direccionPrincipal;
    private BigDecimal telefono;
    private String email;
    
    /*
     * private List<ClientRelationship> relationship;
     * private List<ClientReference> reference;
     * private List<ClientPhone> phone;
     * private List<ClientAddress> address;
     */

     private List<Turno> turno;
    @Version
    private Number version;
}
