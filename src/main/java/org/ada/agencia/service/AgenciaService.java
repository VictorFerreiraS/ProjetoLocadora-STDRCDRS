package org.ada.agencia.service;

import org.ada.agencia.models.Agencia;
import org.ada.agencia.repository.AgenciaRepository;
import org.ada.veiculo.models.Veiculo;

public abstract class AgenciaService{

    protected final AgenciaRepository agenciaRepository;

    public AgenciaService(AgenciaRepository agenciaRepository) {
        this.agenciaRepository = agenciaRepository;
    }

    public Agencia criarAgencia(Agencia agencia) {
        return agenciaRepository.inserir(agencia);
    }

    public Agencia deletarAgencia(Agencia agencia) {
        return agenciaRepository.deletar(agencia);
    }

    public Agencia deletarAgencia(String id) {
        return agenciaRepository.deletarPorId(id);
    }
    public Agencia alterarAgencia(Agencia agencia) {
        return agenciaRepository.alterar(agencia);
    }

}
