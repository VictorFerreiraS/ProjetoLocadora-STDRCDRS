package org.ada.agencia.service;

import org.ada.agencia.models.Agencia;
import org.ada.agencia.repository.AgenciaRepository;
import org.ada.agencia.repository.AgenciaRepositoryInMemoryImpl;
import org.ada.agencia.validation.ValidadoresDeAgencia;
import org.ada.veiculo.models.Veiculo;

public class AgenciaServiceImpl extends AgenciaService {

    private final ValidadoresDeAgencia validadoresDeAgencia;

    public AgenciaServiceImpl(AgenciaRepository agenciaRepository, ValidadoresDeAgencia validadoresDeAgencia) {
        super(agenciaRepository);
        this.validadoresDeAgencia = validadoresDeAgencia;
    }

    @Override
    public String adicionarVeiculo(Agencia agencia, Veiculo veiculo){
        validadoresDeAgencia.checarSeAgenciaNaoExiste(agencia.getNome());
        return agenciaRepository.adicionarVeiculo(agencia.getNome(), veiculo);
    }

    @Override
    public Agencia criarAgencia(Agencia agencia) {
        validadoresDeAgencia.checarSeAgenciaExiste(agencia.getUuid());
        return super.criarAgencia(agencia);
    }

    @Override
    public Agencia deletar(String uuid) {
        validadoresDeAgencia.checarSeAgenciaExiste(uuid);
        return super.deletar(uuid);
    }

    @Override
    public Agencia alterar(Agencia agencia) {
        //logica
        return super.alterar(agencia);
    }
}
