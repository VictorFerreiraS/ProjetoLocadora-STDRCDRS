package org.ada.agencia.service;

import org.ada.agencia.models.Agencia;
import org.ada.agencia.repository.AgenciaRepository;

public class AgenciaServiceImpl extends AgenciaService {
    public AgenciaServiceImpl(AgenciaRepository agenciaRepository) {
        super(agenciaRepository);
    }

    @Override
    public Agencia criarAgencia(Agencia agencia) {
        //logica
        return super.criarAgencia(agencia);
    }

    @Override
    public Agencia deletarAgencia(Agencia agencia) {
        //logica
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
