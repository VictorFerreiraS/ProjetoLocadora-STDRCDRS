package org.ada.veiculo.repository;

import org.ada.veiculo.models.Veiculo;

import java.util.HashMap;
import java.util.Map;

public class VeiculoRepositoryInMemoryImpl implements VeiculoRepository {
    private final Map<String, Veiculo> veiculos = new HashMap<>();

    @Override
    public Veiculo inserir(Veiculo obj) {
        veiculos.put(obj.getUuid(), obj);
        return obj;
    }

    @Override
    public Veiculo alterar(Veiculo obj) {
        veiculos.put(obj.getUuid(), obj);
        return obj;
    }

    @Override
    public Veiculo deletar(Veiculo obj) {
        return veiculos.remove(obj.getUuid());
    }

    @Override
    public Veiculo buscaPorId(String id) {
        return veiculos.get(id);
    }

    @Override
    public Veiculo deletarPorId(String id) {
        return veiculos.remove(id);
    }
}
