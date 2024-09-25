package org.ada.agencia.repository;

import org.ada.agencia.models.Agencia;
import org.ada.veiculo.models.Veiculo;

import java.util.*;

public class AgenciaRepositoryInMemoryImpl implements AgenciaRepository {

    private final Map<String, Agencia> agenciaDatabase = new HashMap<>();

    public Collection<Agencia> buscarTodasAgencias() {
        return agenciaDatabase.values();
    }

    @Override
    public Agencia buscaPorNome(String nome) {
        return agenciaDatabase.values().stream().filter(agencia -> agencia.getNome().equals(nome)).findFirst().orElse(null);
    }

    @Override
    public List<Agencia> procurarAgencia(String nomeAgencia) {
        List<Agencia> result = new ArrayList<>();
        for (Map.Entry<String, Agencia> entry : agenciaDatabase.entrySet()) {
            if (entry.getKey().toLowerCase().contains(nomeAgencia.toLowerCase())) {
                result.add(entry.getValue());
            }
        }

        return result;
    };


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
