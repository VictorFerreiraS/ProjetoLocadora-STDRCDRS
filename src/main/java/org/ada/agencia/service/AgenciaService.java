package org.ada.agencia.service;

import org.ada.agencia.models.Agencia;

import org.ada.agencia.repository.AgenciaRepositoryInMemoryImpl;
import org.ada.veiculo.models.Veiculo;

import java.util.List;

public abstract class AgenciaService{

    protected final AgenciaRepositoryInMemoryImpl agenciaRepositoryInMemory;

    public AgenciaService(AgenciaRepositoryInMemoryImpl agenciaRepositoryInMemory) {
        this.agenciaRepositoryInMemory = agenciaRepositoryInMemory;
    }


    public Agencia criarAgencia(Agencia agencia) {
        return agenciaRepositoryInMemory.inserir(agencia);
    }

    public List<Agencia> procurarAgencia(String nomeAgencia) {
        return agenciaRepositoryInMemory.procurarAgencia(nomeAgencia);
    }

    public String adicionarVeiculo(Agencia agencia, Veiculo veiculo){return agenciaRepositoryInMemory.adicionarVeiculo(agencia.getNome(), veiculo);}

    public Agencia deletarAgencia(Agencia agencia) {
        return agenciaRepositoryInMemory.deletar(agencia);
    }

    public Agencia deletarAgencia(String id) {
        return agenciaRepositoryInMemory.deletarPorId(id);
    }
    public Agencia alterarAgencia(Agencia agencia) {
        return agenciaRepositoryInMemory.alterar(agencia);
    }

}
