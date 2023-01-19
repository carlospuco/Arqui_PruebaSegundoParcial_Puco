package com.pucoexamen.pruebaparcial2carlos.Model;

import java.util.Date;

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
    private Number telefono;
    private String email;
    
    /*
     * private List<ClientRelationship> relationship;
     * private List<ClientReference> reference;
     * private List<ClientPhone> phone;
     * private List<ClientAddress> address;
     */
    @Version
    private Number version;
}
