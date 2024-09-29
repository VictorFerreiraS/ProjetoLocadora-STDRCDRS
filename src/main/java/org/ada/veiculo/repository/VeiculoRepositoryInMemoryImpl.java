package org.ada.veiculo.repository;

import org.ada.veiculo.models.Veiculo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VeiculoRepositoryInMemoryImpl implements VeiculoRepository {
    private final Map<String, Veiculo> veiculosDatabase = new HashMap<>();

    @Override
    public Veiculo inserir(Veiculo obj) {
        veiculosDatabase.put(obj.getUuid(), obj);
        return obj;
    }

    @Override
    public Veiculo alterar(Veiculo obj) {
        veiculosDatabase.put(obj.getUuid(), obj);
        return obj;
    }

    @Override
    public Veiculo deletar(Veiculo obj) {
        return veiculosDatabase.remove(obj.getUuid());
    }

    @Override
    public Veiculo buscaPorId(String id) {
        return veiculosDatabase.get(id);
    }

    @Override
    public Veiculo deletarPorId(String id) {
        return veiculosDatabase.remove(id);
    }

    @Override
    public Veiculo buscarVeiculoPorPlaca(String placa) {
        return veiculosDatabase.values().stream().filter(veiculo -> veiculo.getPlaca().equalsIgnoreCase(placa)).findFirst().orElse(null);
    }

    @Override
    public List<Veiculo> buscarTodosVeiculos() {
        return veiculosDatabase.values().stream().toList();
    }
}
