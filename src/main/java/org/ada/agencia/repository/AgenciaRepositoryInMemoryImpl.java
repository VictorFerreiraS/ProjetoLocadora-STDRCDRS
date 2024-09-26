package org.ada.agencia.repository;

import org.ada.agencia.models.Agencia;
import org.ada.veiculo.models.Veiculo;

import java.util.*;
import java.util.stream.Collectors;

public class AgenciaRepositoryInMemoryImpl implements AgenciaRepository {

    private final Map<String, Agencia> agenciaDatabase = new HashMap<>();

    @Override
    public List<Agencia> procurarAgencia(String nomeAgencia) {
        return agenciaDatabase.entrySet().stream()
                .filter(entry -> entry.getKey().toLowerCase().contains(nomeAgencia.toLowerCase()))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }

    public Collection<Agencia> buscarTodasAgencias() {
        return agenciaDatabase.values();
    }

    @Override
    public String adicionarVeiculo(String nomeAgencia, Veiculo veiculo) {
        agenciaDatabase.get(nomeAgencia).getListaDeVeiculos().add(veiculo);
        return "veiculo adicionado com sucesso";
    }
    
    @Override
    public Agencia inserir(Agencia agencia) {
        agenciaDatabase.put(agencia.getNome(),agencia);
        return agencia;
    }

    @Override
    public Agencia alterar(Agencia agencia) {
        agenciaDatabase.put(agencia.getUuid(),agencia);
        return agencia;
    }

    @Override
    public Agencia deletar(Agencia agencia) {
        agenciaDatabase.remove(agencia.getUuid());
        return agencia;
    }

    @Override
    public Agencia buscaPorId(String id) {
        return agenciaDatabase.get(id);
    }

    @Override
    public Agencia deletarPorId(String id) {
        Agencia tempAgencia = buscaPorId(id);
        agenciaDatabase.remove(id);
        return tempAgencia;
    }
}
