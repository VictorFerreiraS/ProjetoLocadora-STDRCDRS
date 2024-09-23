package org.ada.cliente.models;

public class ClientePessoaFisica extends Cliente{
    public ClientePessoaFisica(String nome, String uuid, String documento) {
        super(nome, uuid, documento,TipoClientePessoa.FISICA);
    }
}
