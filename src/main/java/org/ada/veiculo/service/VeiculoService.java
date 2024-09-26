package org.ada.veiculo.service;

import org.ada.veiculo.models.Veiculo;
import org.ada.veiculo.repository.VeiculoRepository;

public abstract class VeiculoService {
    protected final VeiculoRepository veiculoRepository;

    public VeiculoService(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    public Veiculo salvarVeiculo(Veiculo veiculo) {
        return veiculoRepository.inserir(veiculo);
    }

    public Veiculo alterarVeiculo(Veiculo veiculo) {
        return veiculoRepository.alterar(veiculo);
    }

    public Veiculo deletarVeiculo(Veiculo veiculo) {
        return veiculoRepository.deletar(veiculo);
    }
    public Veiculo buscarVeiculoPorPlaca(String placa) {
        return veiculoRepository.buscarVeiculoPorPlaca(placa);
    }

    public Veiculo buscaPorId(String id){return veiculoRepository.buscaPorId(id);}

    public Veiculo deletarPorId(String id){return veiculoRepository.deletarPorId(id);}
}
