package org.ada.cliente.repository;

import org.ada.cliente.models.Cliente;

import java.util.HashMap;
import java.util.List;
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
        return clienteDatabase.replace(cliente.getUuid(),cliente);
    }

    @Override
    public Cliente deletar(Cliente cliente) {
        return clienteDatabase.remove(cliente.getUuid());
    }

    @Override
    public Cliente buscaPorId(String id) {
        return clienteDatabase.get(id);
    }

    @Override
    public Cliente deletarPorId(String id) {
        return clienteDatabase.remove(id);
    }

    @Override
    public List<Cliente> buscarTodosClientes() {
        return clienteDatabase.values().stream().toList();
    }

    @Override
    public Cliente buscarPorNome(String nome) {
        return clienteDatabase.values().stream().filter(cliente -> cliente.getNome().equalsIgnoreCase(nome)).findFirst().orElse(null);
    }
}
