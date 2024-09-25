package org.ada.cliente.models;

import org.ada.aluguel.Aluguel;
import org.ada.basemodel.BaseModel;

public abstract class Cliente extends BaseModel {

    private String nome;

    private String documento;

    private TipoCliente tipoCliente;


    public Cliente() {
    }

    public Cliente(String nome, String documento, TipoCliente tipoCliente) {
        this.nome = nome;
        this.documento = documento;
        this.tipoCliente = tipoCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public abstract Double getDesconto(Aluguel aluguel);

}
