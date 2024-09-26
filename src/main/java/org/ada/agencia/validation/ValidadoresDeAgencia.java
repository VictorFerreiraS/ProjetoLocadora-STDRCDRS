package org.ada.agencia.validation;

import org.ada.agencia.models.Agencia;
import org.ada.agencia.repository.AgenciaRepository;
import org.ada.agencia.repository.AgenciaRepositoryInMemoryImpl;
import org.ada.agencia.validation.exceptions.AgenciaInvalidaException;
import org.ada.veiculo.models.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class ValidadoresDeAgencia {

    protected final AgenciaRepository agenciaRepository;

    public ValidadoresDeAgencia(AgenciaRepository agenciaRepository) {
        this.agenciaRepository = agenciaRepository;
    }


    public void checarSeAgenciaExiste(String nome) {
        List<Agencia> agencias = new ArrayList<>(agenciaRepository.buscarTodasAgencias());
        if (agencias.stream().anyMatch(agencia -> agencia.getNome().equalsIgnoreCase(nome))) {
            throw new AgenciaInvalidaException("Nome de agencia ja existe");
        }
    }

    public void checarSeAgenciaNaoExiste(String nome) {
        List<Agencia> agencias = new ArrayList<>(agenciaRepository.buscarTodasAgencias());
        if (agencias.stream().noneMatch(agencia -> agencia.getNome().equalsIgnoreCase(nome))) {
            throw new AgenciaInvalidaException("Agencia não existe!");
        }
    }

}