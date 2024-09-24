package org.ada.agencia.models;

import org.ada.basemodel.BaseModel;
import org.ada.veiculo.models.Veiculo;

import java.util.HashSet;
import java.util.Set;

public class Agencia extends BaseModel {

    private String nome;
    private String endereco;
    private Set<Veiculo> listaDeVeiculos = new HashSet<>();
}
