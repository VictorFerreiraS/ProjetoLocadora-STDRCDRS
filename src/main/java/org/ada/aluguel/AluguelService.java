package org.ada.aluguel;

import org.ada.agencia.models.Agencia;
import org.ada.cliente.models.Cliente;

public abstract class AluguelService {

    AluguelRepository aluguelRepository;

    public AluguelService(AluguelRepository aluguelRepository) {
        this.aluguelRepository = aluguelRepository;
    }

    Aluguel criarAluguel(Aluguel aluguel) {
        return aluguelRepository.inserir(aluguel);
    }
    Aluguel buscarAluguel(Cliente cliente) {
        return aluguelRepository.buscarAluguelPorCliente(cliente);
    }

    Aluguel atualizarAluguel(Aluguel aluguel) {
        return aluguelRepository.alterar(aluguel);
    }
}
