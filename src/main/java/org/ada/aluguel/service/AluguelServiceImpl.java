package org.ada.aluguel.service;

import org.ada.agencia.models.Agencia;
import org.ada.aluguel.models.Aluguel;
import org.ada.aluguel.repository.AluguelRepository;
import org.ada.aluguel.validations.ValidadorDeAluguel;
import org.ada.cliente.models.Cliente;
import org.ada.veiculo.models.Veiculo;

public class AluguelServiceImpl extends AluguelService {

    ValidadorDeAluguel validadorDeAluguel;

    public AluguelServiceImpl(AluguelRepository aluguelRepository, ValidadorDeAluguel validadorDeAluguel) {
        super(aluguelRepository);
        this.validadorDeAluguel = validadorDeAluguel;
    }

    @Override
    public Aluguel criarAluguel(Aluguel aluguel) {
        validadorDeAluguel.checarSeExiste(aluguel);
        validadorDeAluguel.checarSeClienteJaAluga(aluguel);
        validadorDeAluguel.checarSeVeiculoExisteNaAguencia(aluguel.getAgenciaDeRetirada(),aluguel.getVeiculo());
        aluguel.getVeiculo().setDisponivel(false);
        return super.criarAluguel(aluguel);
    }

    @Override
    public Aluguel buscarAluguel(Cliente cliente) {
        Aluguel aluguelDoCliente = aluguelRepository.buscarAluguelPorCliente(cliente);
        validadorDeAluguel.checarSeNaoExiste(aluguelDoCliente);
        return super.buscarAluguel(cliente);
    }

    @Override
    public Aluguel atualizarAluguel(Aluguel aluguel) {
        validadorDeAluguel.checarSeNaoExiste(aluguel);
        return super.atualizarAluguel(aluguel);
    }


}
