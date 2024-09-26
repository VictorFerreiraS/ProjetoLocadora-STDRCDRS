package org.ada.aluguel;

import org.ada.agencia.models.Agencia;
import org.ada.cliente.models.Cliente;
import org.ada.veiculo.models.Veiculo;

public class AluguelServiceImpl extends AluguelService {

    public AluguelServiceImpl(AluguelRepository aluguelRepository) {
        super(aluguelRepository);
    }

    @Override
    public Aluguel criarAluguel(Aluguel aluguel) {
        if (!isVeiculoDisponivel(aluguel.getVeiculo())) {
            throw new RuntimeException("indisponivel"); //melhorar
        }
        if (isAluguelExistente(aluguel.getCliente())) {
            throw new RuntimeException("cliente alugando");  //melhorar
        }
        if (!agenciaPossuiVeciulo(aluguel.getAgenciaDeRetirada(),aluguel.getVeiculo())) {
            throw new RuntimeException("agencia nao possui veiculo"); //melhorar
        }
        aluguel.getVeiculo().setDisponivel(false);
        return super.criarAluguel(aluguel);
    }

    @Override
    public Aluguel buscarAluguel(Cliente cliente) {
        if (!isAluguelExistente(cliente)) throw new RuntimeException();
        return super.buscarAluguel(cliente);
    }

    @Override
    public Aluguel atualizarAluguel(Aluguel aluguel) {
        if (!isAluguelExistente(aluguel.getCliente())) throw new RuntimeException();
        return super.atualizarAluguel(aluguel);
    }

    private boolean isVeiculoDisponivel(Veiculo veiculo) {
        return veiculo.isDisponivel();
    }


    private boolean agenciaPossuiVeciulo(Agencia agencia, Veiculo veiculo) {
        if (agencia.getListaDeVeiculos().contains(veiculo)) return true;
        return false;
    }

    private boolean isAluguelExistente(Cliente cliente) {
        return aluguelRepository.buscarAluguelPorCliente(cliente) != null;
    }


}
