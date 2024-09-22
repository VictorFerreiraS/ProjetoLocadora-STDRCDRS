package org.ada.cliente.repository;

import org.ada.cliente.models.Cliente;

import java.util.HashMap;
import java.util.Map;

public class ClienteRepositoryInMemoryImpl implements ClienteRepository{

    private final Map<String, Cliente> clienteDatabase = new HashMap<>();
    @Override
    public Cliente inserir(Cliente cliente) {
        clienteDatabase.put(cliente.getUuid(),cliente);
        return cliente;
    }

    @Override
    public Cliente alterar(Cliente cliente) {
        clienteDatabase.put(cliente.getUuid(),cliente);
        return cliente;
    }

    @Override
    public Cliente deletar(Cliente cliente) {
        clienteDatabase.remove(cliente.getUuid());
        return cliente;
    }

    @Override
    public Cliente buscaPorId(String id) {
        return clienteDatabase.values().stream().filter(cliente -> cliente.getUuid().equals(id)).findFirst().orElse(null);
    }

    @Override
    public Cliente deletarPorId(String id) {
        Cliente tempCliente = buscaPorId(id);
        clienteDatabase.remove(id);
        return tempCliente;
    }

}
