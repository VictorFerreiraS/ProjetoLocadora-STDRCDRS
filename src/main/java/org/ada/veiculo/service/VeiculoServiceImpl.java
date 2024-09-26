package org.ada.veiculo.service;

import org.ada.dataframework.filehandling.FileHandling;
import org.ada.veiculo.models.Veiculo;
import org.ada.veiculo.repository.VeiculoRepository;

public class VeiculoServiceImpl extends VeiculoService {

    private final FileHandling fileHandling;

    public VeiculoServiceImpl(VeiculoRepository veiculoRepository, FileHandling fileHandling) {
        super(veiculoRepository);
        this.fileHandling = fileHandling;
    }

    @Override
    public Veiculo salvarVeiculo(Veiculo veiculo) {
        fileHandling.createFile();
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
    public Veiculo buscarVeiculoPorPlaca(String placa) {
        //logica
        return super.buscarVeiculoPorPlaca(placa);
    }

    @Override
    public Veiculo buscaPorId(String id){
        return super.buscaPorId(id);
    }

    @Override
    public Veiculo deletarPorId(String id){
        return super.deletarPorId(id);
    }
}
