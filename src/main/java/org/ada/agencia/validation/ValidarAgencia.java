package org.ada.agencia.validation;

import org.ada.agencia.models.Agencia;
import org.ada.agencia.repository.AgenciaRepositoryInMemoryImpl;
import org.ada.agencia.validation.exceptions.AgenciaInvalidaException;

import java.util.ArrayList;
import java.util.List;

public class ValidarAgencia {

    protected final AgenciaRepositoryInMemoryImpl agenciaRepositoryInMemory;

    public ValidarAgencia(AgenciaRepositoryInMemoryImpl agenciaRepositoryInMemory) {
        this.agenciaRepositoryInMemory = agenciaRepositoryInMemory;
    }



    public void checarSeAgenciaExiste(String nome) {
        List<Agencia> agencias = new ArrayList<>(agenciaRepositoryInMemory.buscarTodasAgencias());
        if (agencias.stream().anyMatch(agencia -> agencia.getNome().equalsIgnoreCase(nome))) {
            throw new AgenciaInvalidaException("Nome de agencia ja existe");
        }


    }
}
