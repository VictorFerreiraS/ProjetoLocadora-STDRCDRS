package org.ada.repository.impl;

import org.ada.cliente.Cliente;
import org.ada.repository.ClienteRepository;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepositoryImpl implements ClienteRepository {
    List<Cliente> clientesDatabase = new ArrayList<>();
    @Override
    public void inserir(Cliente cliente) {
        /*
        Inserir lógica para o CRUD se necessario
         */
        clientesDatabase.add(cliente);
    }

    @Override
    public Cliente editar(Cliente obj) {
        return null;
    }

    @Override
    public Cliente buscarPorId(Integer id) {
        return null;
    }

    @Override
    public void excluir(Cliente obj) {

    }
}
