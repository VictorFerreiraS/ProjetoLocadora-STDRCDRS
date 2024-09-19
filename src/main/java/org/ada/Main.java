package org.ada;

import org.ada.repository.VeiculoRepository;
import org.ada.repository.impl.VeiculoRepositoryImpl;
import org.ada.service.VeiculoService;
import org.ada.service.impl.VeiculoServiceImpl;
import org.ada.veiculo.Carro;
import org.ada.veiculo.Veiculo;

public class Main {
    public static void main(String[] args) {

        VeiculoRepository veiculoRepository = new VeiculoRepositoryImpl();

        VeiculoService veiculoService = new VeiculoServiceImpl(veiculoRepository);

        Veiculo carro = new Carro("KCT9999", "POOMaldita", "SOLIDvagabundo", "2024");

        veiculoService.inserirVeiculo(carro);

        Veiculo carroEncontrado = veiculoRepository.buscarPorId(0);

        System.out.println(carroEncontrado);


    }
}