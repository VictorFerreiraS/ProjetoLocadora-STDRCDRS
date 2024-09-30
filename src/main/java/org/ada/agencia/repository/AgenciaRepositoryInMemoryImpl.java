package org.ada.agencia.repository;

import org.ada.agencia.models.Agencia;
import org.ada.veiculo.models.Veiculo;

import java.util.*;

public class AgenciaRepositoryInMemoryImpl implements AgenciaRepository {

    private final Map<String, Agencia> agenciaDatabase = new HashMap<>();

    @Override
    public List<Agencia> buscarTodasAgencias() {
        return agenciaDatabase.values().stream().toList();
    }

    @Override
    public String adicionarVeiculo(String nomeAgencia, Veiculo veiculo) {
        buscarAgencia(nomeAgencia).getListaDeVeiculos().add(veiculo);
        return "veiculo adicionado com sucesso";
    }

    @Override
    public Agencia buscarAgencia(String nomeAgencia) {
        return agenciaDatabase.values().stream().filter(agencia -> agencia.getNome().equalsIgnoreCase(nomeAgencia)).findFirst().orElse(null);
    }
    
    @Override
    public Agencia inserir(Agencia agencia) {
        agenciaDatabase.put(agencia.getUuid(),agencia);
        return agencia;
    }

    @Override
    public Agencia alterar(String uuid, Agencia agencia) {
        return agenciaDatabase.replace(uuid,agencia);
    }

    @Override
    public Agencia buscaPorId(String id) {
        return agenciaDatabase.get(id);
    }

    @Override
    public Agencia deletar(String id) {
        return agenciaDatabase.remove(id);
    }
}
