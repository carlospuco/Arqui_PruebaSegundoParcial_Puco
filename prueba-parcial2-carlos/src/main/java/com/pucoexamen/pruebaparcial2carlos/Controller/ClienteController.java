package com.pucoexamen.pruebaparcial2carlos.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pucoexamen.pruebaparcial2carlos.Model.Cliente;
import com.pucoexamen.pruebaparcial2carlos.Service.ClienteService;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
	public Object findAllClienteEntity() {
		List<Cliente> clienteEntity = this.clienteService.findAll();
		return ResponseEntity.ok(clienteEntity);
	}


}
