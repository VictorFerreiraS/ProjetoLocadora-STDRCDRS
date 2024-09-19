package org.ada.service;

import org.ada.repository.ClienteRepository;

public abstract class ClienteService {
    protected final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
}
