package org.ada.cliente.service;

import org.ada.cliente.models.Cliente;
import org.ada.cliente.repository.ClienteRepository;
import org.ada.util.ValidadorCliente;

public class ClienteServiceImpl extends ClienteService {


    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        super(clienteRepository);
    }
    @Override
    public Cliente criarCliente(Cliente cliente) {
        //logica
        return super.criarCliente(cliente);
    }

    @Override
    public Cliente alterarCliente(Cliente cliente) {
        //logica
        return super.alterarCliente(cliente);
    }

    @Override
    public Cliente removerCliente(Cliente cliente) {
        //logica
        return super.removerCliente(cliente);
    }

    @Override
    public Cliente removerCliente(String id) {
        //logica
        return super.removerCliente(id);
    }

    @Override
    public Cliente buscarCliente(String id) {
        //logica
        return super.buscarCliente(id);
    }

}
