package com.pucoexamen.pruebaparcial2carlos.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pucoexamen.pruebaparcial2carlos.Model.Cliente;
import com.pucoexamen.pruebaparcial2carlos.Repository.ClienteRepository;



@Service
public class ClienteService {

    private final ClienteRepository userRepository;

    
    public ClienteService(ClienteRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Cliente> getAllClientes() {
        return userRepository.findAll();
    }

    public List<Cliente> findAll() {
        return null;
    }

}
