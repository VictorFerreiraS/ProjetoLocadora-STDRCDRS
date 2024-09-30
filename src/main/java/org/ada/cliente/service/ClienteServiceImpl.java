package org.ada.cliente.service;

import org.ada.cliente.models.Cliente;
import org.ada.cliente.repository.ClienteRepository;
import org.ada.cliente.validations.ValidadorDeCliente;

public class ClienteServiceImpl extends ClienteService {

    private final ValidadorDeCliente validadorDeCliente = new ValidadorDeCliente(clienteRepository);

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        super(clienteRepository);
    }

    @Override
    public Cliente inserir(Cliente cliente) {
//        try {
            validadorDeCliente.isClienteExistente(cliente.getDocumento());
            validadorDeCliente.documentoInvalido(cliente.getDocumento());
//        } catch (ClienteInvalidoException e) {
//            return null;
//        }
        return super.inserir(cliente);
    }

    @Override
    public Cliente alterar(String uuid, Cliente cliente){
        validadorDeCliente.clienteInexistenteNoBD(cliente.getDocumento());
        validadorDeCliente.documentoInvalido(cliente.getDocumento());
        return super.alterar(uuid, cliente);
    }

    @Override
    public Cliente deletar(String id) {
        validadorDeCliente.idClienteInexistenteNoBD(id);
        return super.deletar(id);
    }

    @Override
    public Cliente buscaPorId(String id) {
        validadorDeCliente.idClienteInexistenteNoBD(id);
        return super.buscaPorId(id);
    }

}
