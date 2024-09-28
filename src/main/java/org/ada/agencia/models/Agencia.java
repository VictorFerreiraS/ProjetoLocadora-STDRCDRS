package org.ada.agencia.models;

import org.ada.basemodel.BaseModel;
import org.ada.veiculo.models.Veiculo;
import java.util.Objects;
import java.util.Set;

public class Agencia extends BaseModel {

    private String nome;
    private String endereco;
    private Set<Veiculo> listaDeVeiculos;


    public Agencia(String nome, String endereco, Set<Veiculo> listaDeVeiculos) {
        this.nome = nome;
        this.endereco = endereco;
        this.listaDeVeiculos = listaDeVeiculos;
    }

    public String getNome() {
        return nome;
    }

     public String getEndereco() {
         return endereco;
     }

    public Set<Veiculo> getListaDeVeiculos() {
        return listaDeVeiculos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agencia agencia = (Agencia) o;
        return Objects.equals(nome, agencia.nome) && Objects.equals(endereco, agencia.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, endereco);
    }
}
