package org.ada.app;

import org.ada.veiculo.models.Caminhao;
import org.ada.veiculo.models.Carro;
import org.ada.veiculo.models.Moto;
import org.ada.veiculo.models.Veiculo;
import org.ada.veiculo.repository.VeiculoRepository;
import org.ada.veiculo.repository.VeiculoRepositoryInMemoryImpl;

public class Main {
    public static void main(String[] args) {
        testesVeiculos();
    }

    public static void testesVeiculos() {
        Carro carro = new Carro("NEZ3547", "Fibravan", "Buggy Vip 1.6 8V Total Flex", "2007");

        VeiculoRepository veiculoRepository = new VeiculoRepositoryInMemoryImpl();
        veiculoRepository.inserir(carro);

        Veiculo foundVehicle = veiculoRepository.buscaPorId(carro.getUuid());
        System.out.println(foundVehicle);

        Moto moto = new Moto("NEZ3547", "Royal Enfield", "Scram 411", "2011");
        veiculoRepository.inserir(moto);

        foundVehicle = veiculoRepository.buscaPorId(moto.getUuid());
        System.out.println(foundVehicle);

        moto.setModelo("Meteor 350");
        veiculoRepository.alterar(moto);
        System.out.println(veiculoRepository.buscaPorId(moto.getUuid()));

        veiculoRepository.deletarPorId(moto.getUuid());

        Caminhao caminhao = new Caminhao("NEZ3547", "Volvo", "FH 540", "2020");
        System.out.println(veiculoRepository.deletar(caminhao));

    }
}
