package com.pucoexamen.pruebaparcial2carlos.Model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "cuentas")
@CompoundIndexes({
    @CompoundIndex(name = "idxu_cuentas_typeIdentificationIdentification", def = "{'identificationType': 1, 'identification': 1}", unique = true)
})
public class Cuenta {
    
    @Id
    private String numeroCuenta;

    @Indexed
    private String tipoCuenta;
    private BigDecimal saldoPromedio;

}
