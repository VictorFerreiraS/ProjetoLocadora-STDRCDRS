package org.ada.cliente.service;

import org.ada.cliente.models.Cliente;
import org.ada.cliente.repository.ClienteRepository;
import org.ada.cliente.validations.ValidadorDeCliente;
import org.ada.cliente.validations.exception.ClienteInvalidoException;

public class ClienteServiceImpl extends ClienteService {

    private final ValidadorDeCliente validadorDeCliente = new ValidadorDeCliente(clienteRepository);

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        super(clienteRepository);
    }

    @Override
    public Cliente criarCliente(Cliente cliente) {
//        try {
            validadorDeCliente.isClienteExistente(cliente.getDocumento());
            validadorDeCliente.documentoInvalido(cliente.getDocumento());
//        } catch (ClienteInvalidoException e) {
//            return null;
//        }
        return super.criarCliente(cliente);
    }

    @Override
    public Cliente alterarCliente(Cliente cliente) {
        validadorDeCliente.clienteInexistenteNoBD(cliente.getDocumento());
        validadorDeCliente.documentoInvalido(cliente.getDocumento());
        return super.alterarCliente(cliente);
    }

    @Override
    public Cliente removerCliente(String id) {
        validadorDeCliente.idClienteInexistenteNoBD(id);
        return super.removerCliente(id);
    }

    @Override
    public Cliente buscarCliente(String id) {
        validadorDeCliente.idClienteInexistenteNoBD(id);
        return super.buscarCliente(id);
    }

}
