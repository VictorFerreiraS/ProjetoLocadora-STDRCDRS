package org.ada.veiculo.service;

import org.ada.veiculo.repository.VeiculoRepository;

public abstract class VeiculoService {
    protected final VeiculoRepository veiculoRepository;

    public VeiculoService(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }
}
