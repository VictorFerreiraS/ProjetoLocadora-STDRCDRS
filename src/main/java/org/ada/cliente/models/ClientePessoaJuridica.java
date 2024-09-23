package org.ada.cliente.models;

public class ClientePessoaJuridica extends Cliente{

    public ClientePessoaJuridica(String nome, String uuid, String documento) {
        super(nome, uuid, documento,TipoClientePessoa.JURIDICA);
    }
}
