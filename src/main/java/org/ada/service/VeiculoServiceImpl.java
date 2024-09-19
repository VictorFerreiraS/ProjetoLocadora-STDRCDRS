package org.ada.service;

import org.ada.repository.VeiculoRepository;
import org.ada.veiculo.Veiculo;

public class VeiculoServiceImpl extends VeiculoService {

    public VeiculoServiceImpl(VeiculoRepository veiculoRepository){super(veiculoRepository);}

    @Override
    public void inserirVeiculo(Veiculo veiculo){
        veiculoRepository.inserir(veiculo);
    }
}
