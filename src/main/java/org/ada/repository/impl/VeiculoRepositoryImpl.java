package org.ada.repository.impl;

import org.ada.repository.VeiculoRepository;
import org.ada.veiculo.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class VeiculoRepositoryImpl implements VeiculoRepository {

    List<Veiculo> veiculosDatabase = new ArrayList<>();

    @Override
    public Veiculo buscaPorNome(String nome) {
        for (Veiculo veiculo : veiculosDatabase) {
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
    public Veiculo editar(Integer idVeiculoEditar, Veiculo veiculoNovo) {

        Veiculo veiculoEditado = buscarPorId(idVeiculoEditar);
        veiculoEditado.setPlaca(veiculoNovo.getPlaca());
        veiculoEditado.setMarca(veiculoNovo.getMarca());
        veiculoEditado.setModelo(veiculoNovo.getModelo());
        veiculoEditado.setAno(veiculoNovo.getAno());
        System.out.println("Veículo alterado");

        return veiculoEditado;
    }

    @Override
    public Veiculo buscarPorId(Integer id) {
        return veiculosDatabase.get(id);
    }

    @Override
    public void excluir(Veiculo obj) {

    }
}
