package org.ada.agencia.models;

import org.ada.basemodel.BaseModel;
import org.ada.veiculo.models.Veiculo;

// <<<<<<< nathanimpltest
// import java.util.HashSet;
// import java.util.Objects;
// =======
// >>>>>>> master
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

// <<<<<<< nathanimpltest

//     public String getEndereco() {
//         return endereco;
//     }
// =======
// >>>>>>> master
    public Set<Veiculo> getListaDeVeiculos() {
        return listaDeVeiculos;
    }

// <<<<<<< nathanimpltest
//     @Override
//     public boolean equals(Object o) {
//         if (this == o) return true;
//         if (o == null || getClass() != o.getClass()) return false;
//         Agencia agencia = (Agencia) o;
//         return Objects.equals(nome, agencia.nome) && Objects.equals(endereco, agencia.endereco);
//     }

//     @Override
//     public int hashCode() {
//         return Objects.hash(nome, endereco);
//     }

//     public Veiculo cadastrarVeiculo(Veiculo veiculo) {
//        listaDeVeiculos.add(veiculo);
//        return veiculo;
//     }

//     @Override
//     public String toString() {
//         return "Agencia{" +
//                 "nome='" + nome + '\'' +
//                 ", endereco='" + endereco + '\'' +
//                 '}';
//     }
// =======
// >>>>>>> master
}
