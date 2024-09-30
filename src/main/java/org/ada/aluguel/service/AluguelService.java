package org.ada.aluguel.service;

import org.ada.aluguel.models.Aluguel;
import org.ada.aluguel.repository.AluguelRepository;
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

    public Aluguel alterarAluguel(String uuid, Aluguel aluguel) {
        return aluguelRepository.alterar(uuid, aluguel);
    }
}
