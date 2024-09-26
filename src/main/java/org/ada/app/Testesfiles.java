package org.ada.app;

import org.ada.dataframework.filehandling.FileCreation;
import org.ada.dataframework.filehandling.FileHandling;
import org.ada.veiculo.models.TipoVeiculo;
import org.ada.veiculo.models.Veiculo;
import org.ada.veiculo.repository.VeiculoRepository;
import org.ada.veiculo.repository.VeiculoRepositoryInMemoryImpl;
import org.ada.veiculo.service.VeiculoService;
import org.ada.veiculo.service.VeiculoServiceImpl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Testesfiles {
    public static void main(String[] args) {

        FileHandling fileHandling = new FileCreation();
        VeiculoRepository veiculoRepository = new VeiculoRepositoryInMemoryImpl();
        VeiculoService veiculoService = new VeiculoServiceImpl(veiculoRepository, fileHandling);
        veiculoService.salvarVeiculo(new Veiculo("ABC1234", "VW", "caminhaoVw", "2020", TipoVeiculo.CAMINHAO));
        veiculoService.salvarVeiculo(new Veiculo("ABC1235", "FIAT", "uno", "2020", TipoVeiculo.CARRO));
        veiculoService.salvarVeiculo(new Veiculo("ABC1236", "FORD", "l200", "2020", TipoVeiculo.CARRO));
        veiculoService.salvarVeiculo(new Veiculo("ABC1237", "BMW", "algumacoisa", "2020", TipoVeiculo.CARRO));
        veiculoService.salvarVeiculo(new Veiculo("ABC1238", "HONDA", "motinha", "2020", TipoVeiculo.MOTO));

//        veiculoService.alterarVeiculo(new Veiculo("ABC1246", "VOLKSWAGEN", "POLO", "2020", TipoVeiculo.CARRO));

//        veiculoService.deletarVeiculo(new Veiculo("ABC1238", "HONDA", "motinha", "2020", TipoVeiculo.MOTO));

//        Veiculo veiculoEncontradoPorId = veiculoService.buscaPorId("8b6337f1-2684-4c19-a58e-cfc366700090");
//        System.out.println(veiculoEncontradoPorId);

//        veiculoService.deletarPorId("e3005d13-d5d4-4e66-91c4-497fe763cf6a");

        System.out.println(veiculoService.buscarVeiculoPorPlaca("ABC1234"));


    }
}
