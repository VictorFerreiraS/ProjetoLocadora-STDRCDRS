package org.ada.app;

import org.ada.agencia.models.Agencia;
import org.ada.agencia.repository.AgenciaRepositoryInMemoryImpl;
import org.ada.agencia.service.AgenciaServiceImpl;
import org.ada.agencia.validation.ValidadoresDeAgencia;
import org.ada.veiculo.models.TipoVeiculo;
import org.ada.veiculo.models.Veiculo;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        testesAgencia();
    }

    public static void testesAgencia() {
        Set<Veiculo> veiculos = new HashSet<>();
        Veiculo civic = new Veiculo("QNV5J23", "Honda", "civic", "1997", TipoVeiculo.CARRO);
        Agencia agenciaSJ = new Agencia("Agencia SJDR", "SJDR MG", veiculos);
        Agencia agenciaSP = new Agencia("Agencia SP", "SP SP", veiculos);

        AgenciaRepositoryInMemoryImpl agenciaRepositoryInMemory = new AgenciaRepositoryInMemoryImpl();
        ValidadoresDeAgencia validadoresDeAgencia = new ValidadoresDeAgencia(agenciaRepositoryInMemory);
        AgenciaServiceImpl agenciaServiceImpl = new AgenciaServiceImpl(agenciaRepositoryInMemory, validadoresDeAgencia);

        agenciaServiceImpl.criarAgencia(agenciaSJ);
        agenciaServiceImpl.adicionarVeiculo(agenciaSJ, civic);
        agenciaServiceImpl.criarAgencia(agenciaSP);
        agenciaServiceImpl.procurarAgencia("Agenc").forEach(agencia -> System.out.println(agencia.toString()));

        // Printing Agencia SJ details and its vehicles
//        System.out.println(agenciaSJ.toString());
//        System.out.println("Veiculos in Agencia SJDR:");
//        agenciaSJ.getListaDeVeiculos().forEach(veiculo -> {
//            System.out.println("Placa: " + veiculo.getPlaca());
//            System.out.println("Marca: " + veiculo.getMarca());
//            System.out.println("Modelo: " + veiculo.getModelo());
//            System.out.println("Ano: " + veiculo.getAno());
//            System.out.println("------------");
//        });

    }
}
