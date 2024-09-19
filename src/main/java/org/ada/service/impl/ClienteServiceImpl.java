package org.ada.service.impl;

import org.ada.cliente.Cliente;
import org.ada.repository.ClienteRepository;
import org.ada.service.ClienteService;

public class ClienteServiceImpl extends ClienteService {

    /*
    implemente a logica de validação e etc para passar para o repository q irá salvar
     */
    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        super(clienteRepository);
    }

    public void inserirCliente(Cliente cliente) {
        /*
        logica de validacao
         */
        clienteRepository.inserir(cliente);
    }

}
