package org.ada.agencia.service;

import org.ada.agencia.models.Agencia;
import org.ada.agencia.repository.AgenciaRepositoryInMemoryImpl;
import org.ada.agencia.validation.ValidarAgencia;

public class AgenciaServiceImpl extends AgenciaService {

    private final ValidarAgencia validarAgencia;

    public AgenciaServiceImpl(AgenciaRepositoryInMemoryImpl agenciaRepositoryInMemory, ValidarAgencia validarAgencia) {
        super(agenciaRepositoryInMemory);
        this.validarAgencia = validarAgencia;
    }

    @Override
    public Agencia criarAgencia(Agencia agencia) {
        validarAgencia.checarSeAgenciaExiste(agencia.getNome());
        return super.criarAgencia(agencia);
    }

    @Override
    public Agencia deletarAgencia(Agencia agencia) {
        validarAgencia.checarSeAgenciaExiste(agencia.getNome());
        return super.deletarAgencia(agencia);
    }

    @Override
    public Agencia deletarAgencia(String id) {
        //logica
        return super.deletarAgencia(id);
    }

    @Override
    public Agencia alterarAgencia(Agencia agencia) {
        //logica
        return super.alterarAgencia(agencia);
    }
}
