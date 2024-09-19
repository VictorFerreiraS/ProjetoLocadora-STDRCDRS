package org.ada.service;

import org.ada.repository.VeiculoRepository;
import org.ada.veiculo.Veiculo;

public abstract class VeiculoService {
    protected final VeiculoRepository veiculoRepository;

    public VeiculoService(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    public abstract void inserirVeiculo(Veiculo veiculo);
}
