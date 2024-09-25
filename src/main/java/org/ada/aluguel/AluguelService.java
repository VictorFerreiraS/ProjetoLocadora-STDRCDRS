package org.ada.aluguel;

import org.ada.agencia.models.Agencia;
import org.ada.cliente.models.Cliente;

public abstract class AluguelService {

    protected final AluguelRepository aluguelRepository;

    public AluguelService(AluguelRepository aluguelRepository) {
        this.aluguelRepository = aluguelRepository;
    }

    public Aluguel criarAluguel(Aluguel aluguel) {
        return aluguelRepository.inserir(aluguel);
    }
    public Aluguel buscarAluguel(Cliente cliente) {
        return aluguelRepository.buscarAluguelPorCliente(cliente);
    }

    public Aluguel atualizarAluguel(Aluguel aluguel) {
        return aluguelRepository.alterar(aluguel);
    }
}
