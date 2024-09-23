package org.ada.repository.impl;

import org.ada.repository.VeiculoRepository;
import org.ada.veiculo.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class VeiculoRepositoryImpl implements VeiculoRepository {

    List<Veiculo> veiculosDatabase = new ArrayList<>();

    @Override
    public Veiculo buscaPorNome(String nome) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getModelo().toLowerCase().contains(nome.toLowerCase())) {
                return veiculo;
            }
        }
        return null;
    }

    @Override
    public void inserir(Veiculo veiculo) {
        veiculosDatabase.add(veiculo);
    }

    @Override
    public Veiculo editar(Veiculo obj) {
        return null;
    }

    @Override
    public Veiculo buscarPorId(Integer id) {
        return veiculosDatabase.get(id);
    }

    @Override
    public void excluir(Veiculo obj) {

    }
}
