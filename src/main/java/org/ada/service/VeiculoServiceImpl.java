package org.ada.service;

import org.ada.repository.VeiculoRepository;
import org.ada.veiculo.Veiculo;

public class VeiculoServiceImpl extends VeiculoService {

    public VeiculoServiceImpl(VeiculoRepository veiculoRepository){super(veiculoRepository);}

    @Override
    public void inserirVeiculo(Veiculo veiculo){
        veiculoRepository.inserir(veiculo);
    }

    @Override
    public Veiculo editarVeiculo(Integer idVeiculoEditar, Veiculo veiculoNovo){
        return veiculoRepository.editar(idVeiculoEditar, veiculoNovo);
    }

}
