package org.ada.repository;

import org.ada.veiculo.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class VeiculoRepositoryImpl implements VeiculoRepository{

    List<Veiculo> veiculos = new ArrayList<>();

    @Override
    public Veiculo buscaPorNome(String nome) {
        return null;
    }

    @Override
    public void inserir(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    @Override
    public Veiculo editar(Veiculo obj) {
        return null;
    }

    @Override
    public Veiculo buscarPorId(Integer id) {
        return veiculos.get(id);
    }

    @Override
    public void excluir(Veiculo obj) {

    }
}
