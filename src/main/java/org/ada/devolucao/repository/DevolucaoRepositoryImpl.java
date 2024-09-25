package org.ada.devolucao.repository;

import org.ada.cliente.models.Cliente;
import org.ada.devolucao.models.Devolucao;
import org.ada.devolucao.service.DevolucaoService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DevolucaoRepositoryImpl implements DevolucaoRepository {

    private Map<String, Devolucao> devolucaoDatabase = new HashMap<>();

    @Override
    public Devolucao inserir(Devolucao devolucao) {
        devolucaoDatabase.put(devolucao.getUuid(),devolucao);
        return devolucao;
    }

    @Override
    public Devolucao alterar(Devolucao devolucao) {
        return devolucaoDatabase.replace(devolucao.getUuid(),devolucao);
    }

    @Override
    public Devolucao deletar(Devolucao devolucao) {
        return devolucaoDatabase.remove(devolucao.getUuid());
    }

    @Override
    public Devolucao buscaPorId(String id) {
        return devolucaoDatabase.get(id);
    }

    @Override
    public Devolucao deletarPorId(String id) {
        return devolucaoDatabase.remove(id);
    }

    @Override
    public List<Devolucao> buscarTodasDevolucoesDoCliente(Cliente cliente) {
        return devolucaoDatabase.values().stream().filter(devolucao -> devolucao.getAluguel().getCliente().equals(cliente)).toList();
    }
}
