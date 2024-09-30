package org.ada.agencia.service;

import org.ada.agencia.models.Agencia;
import org.ada.agencia.repository.AgenciaRepository;
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
    public Agencia buscarAgencia(String nomeAgencia) {
        return agenciaRepository.buscarAgencia(nomeAgencia);
    }

    @Override
    public Veiculo buscarVeiculoPorPlaca(Agencia agencia, String placaVeiculo) {
        for (Veiculo veiculo : agencia.getListaDeVeiculos()) {
            if (veiculo.getPlaca().equalsIgnoreCase(placaVeiculo)) {
                return veiculo;
            }
        }
        throw new IllegalArgumentException("Veiculo não exste");
    }


    @Override
    public Veiculo deletarVeiculoPorPlaca(Agencia agencia, String placaVeiculo) {
        Veiculo veiculo = buscarVeiculoPorPlaca(agencia, placaVeiculo);
        if (veiculo != null) {
            agencia.getListaDeVeiculos().remove(veiculo);
        }
        return veiculo;
    }


    @Override
    public Veiculo editarVeiculo(Agencia agencia, String placaVeiculo, Veiculo veiculoSubstituto) {
        deletarVeiculoPorPlaca(agencia, placaVeiculo);
        agencia.getListaDeVeiculos().add(veiculoSubstituto);
        return buscarVeiculoPorPlaca(agencia, veiculoSubstituto.getPlaca());
    }

    @Override
    public Agencia criarAgencia(Agencia agencia) {
        validadoresDeAgencia.checarSeAgenciaExiste(agencia.getUuid());
        return super.criarAgencia(agencia);
    }

    @Override
    public Agencia deletar(String uuid) {
        return super.deletar(uuid);
    }

    @Override
    public Agencia alterar(String uuid, Agencia agencia) {
        //logica
        return super.alterar(uuid, agencia);
    }
}
