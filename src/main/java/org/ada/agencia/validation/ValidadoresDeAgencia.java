package org.ada.agencia.validation;

import org.ada.agencia.models.Agencia;
import org.ada.agencia.repository.AgenciaRepositoryInMemoryImpl;
import org.ada.agencia.validation.exceptions.AgenciaInvalidaException;
import org.ada.veiculo.models.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class ValidadoresDeAgencia {

    protected final AgenciaRepositoryInMemoryImpl agenciaRepositoryInMemory;

    public ValidadoresDeAgencia(AgenciaRepositoryInMemoryImpl agenciaRepositoryInMemory) {
        this.agenciaRepositoryInMemory = agenciaRepositoryInMemory;
    }


    public void checarSeAgenciaExiste(String nome) {
        List<Agencia> agencias = new ArrayList<>(agenciaRepositoryInMemory.buscarTodasAgencias());
        if (agencias.stream().anyMatch(agencia -> agencia.getNome().equalsIgnoreCase(nome))) {
            throw new AgenciaInvalidaException("Nome de agencia ja existe");
        }
    }

    public void checarSeAgenciaNaoExiste(String nome) {
        List<Agencia> agencias = new ArrayList<>(agenciaRepositoryInMemory.buscarTodasAgencias());
        if (agencias.stream().noneMatch(agencia -> agencia.getNome().equalsIgnoreCase(nome))) {
            throw new AgenciaInvalidaException("Agecia não existe!");
        }
    }

}