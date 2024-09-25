package org.ada.veiculo.service;

import org.ada.veiculo.models.Veiculo;
import org.ada.veiculo.repository.VeiculoRepository;

public class VeiculoServiceImpl extends VeiculoService {
    public VeiculoServiceImpl(VeiculoRepository veiculoRepository) {
        super(veiculoRepository);
    }

    @Override
    public Veiculo salvarVeiculo(Veiculo veiculo) {
        //logica
        return super.salvarVeiculo(veiculo);
    }

    @Override
    public Veiculo alterarVeiculo(Veiculo veiculo) {
        //logica
        return super.alterarVeiculo(veiculo);
    }

    @Override
    public Veiculo deletarVeiculo(Veiculo veiculo) {
        //logica
        return super.deletarVeiculo(veiculo);
    }

    @Override
    public Veiculo buscarVeiculo(String placa) {
        //logica
        return super.buscarVeiculo(placa);
    }
}
