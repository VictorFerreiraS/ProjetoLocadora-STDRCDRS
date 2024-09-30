package org.ada.agencia.service;

import org.ada.agencia.models.Agencia;

import org.ada.agencia.repository.AgenciaRepository;
import org.ada.veiculo.models.Veiculo;

import java.util.Collection;

public abstract class AgenciaService{

    protected final AgenciaRepository agenciaRepository;

    public AgenciaService(AgenciaRepository agenciaRepository) {
        this.agenciaRepository = agenciaRepository;
    }

    public Agencia criarAgencia(Agencia agencia) {
        return agenciaRepository.inserir(agencia);
    }

    public Agencia buscarAgencia(String nomeAgencia) {
        return agenciaRepository.buscarAgencia(nomeAgencia);
    }

    public String adicionarVeiculo(Agencia agencia, Veiculo veiculo){return agenciaRepository.adicionarVeiculo(agencia.getNome(), veiculo);}

    public Veiculo editarVeiculo(Agencia agencia, String placaVeiculo, Veiculo veiculo) {
        return null;
    }

    public Veiculo buscarVeiculoPorPlaca(Agencia agencia, String placaVeiculo){
        return null;
    }

    public Veiculo deletarVeiculoPorPlaca(Agencia agencia, String placaVeiculo) {
        return null;
    }

    public Agencia deletar(String id) {
        return agenciaRepository.deletar(id);
    }

    public Agencia alterar(String uuid, Agencia agencia) {
        return agenciaRepository.alterar(uuid, agencia);
    }

    public Agencia buscaPorId(String uuid){
        return agenciaRepository.buscaPorId(uuid);
    }

    public Collection<Agencia> buscarTodasAgencias(){
        return agenciaRepository.buscarTodasAgencias();
    }

}
