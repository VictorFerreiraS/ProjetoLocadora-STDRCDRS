package org.ada.veiculo.service;

import org.ada.veiculo.models.Veiculo;
import org.ada.veiculo.repository.VeiculoRepository;

import java.util.List;

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
    public Veiculo buscarVeiculo(String placa) {
        return veiculoRepository.buscarVeiculoPorPlaca(placa);
    }

    public List<Veiculo> buscarTodosVeiculos() {
        return veiculoRepository.buscarTodosVeiculos();
    }
}
