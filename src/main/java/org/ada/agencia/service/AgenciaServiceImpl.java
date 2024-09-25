package org.ada.agencia.service;

import org.ada.agencia.models.Agencia;
import org.ada.agencia.repository.AgenciaRepositoryInMemoryImpl;
import org.ada.agencia.validation.ValidadoresDeAgencia;
import org.ada.veiculo.models.Veiculo;

public class AgenciaServiceImpl extends AgenciaService {

    private final ValidadoresDeAgencia validadoresDeAgencia;

    public AgenciaServiceImpl(AgenciaRepositoryInMemoryImpl agenciaRepositoryInMemory, ValidadoresDeAgencia validadoresDeAgencia) {
        super(agenciaRepositoryInMemory);
        this.validadoresDeAgencia = validadoresDeAgencia;
    }

    @Override
    public String adicionarVeiculo(Agencia agencia, Veiculo veiculo){
        validadoresDeAgencia.checarSeAgenciaNaoExiste(agencia.getNome());
        return agenciaRepositoryInMemory.adicionarVeiculo(agencia.getNome(), veiculo);
    };



    @Override
    public Agencia criarAgencia(Agencia agencia) {
        validadoresDeAgencia.checarSeAgenciaExiste(agencia.getNome());
        return super.criarAgencia(agencia);
    }

    @Override
    public Agencia deletarAgencia(Agencia agencia) {
        validadoresDeAgencia.checarSeAgenciaExiste(agencia.getNome());
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
