package org.ada.devolucao.service;


import org.ada.aluguel.models.Aluguel;
import org.ada.cliente.models.Cliente;
import org.ada.devolucao.models.Devolucao;
import org.ada.devolucao.repository.DevolucaoRepository;

import java.util.List;

public class DevolucaoServiceImpl implements DevolucaoService {

    private DevolucaoRepository devolucaoRepository;

    public DevolucaoServiceImpl(DevolucaoRepository devolucaoRepository) {
        this.devolucaoRepository = devolucaoRepository;
    }


    @Override
    public Devolucao realizarDevolucao(Aluguel aluguel, DevolucaoCreateService devolucaoCreateService) {
        return devolucaoCreateService.devolver(aluguel);
    }


    @Override
    public Devolucao salvarDevolucao(Devolucao devolucao) {
        //logica
        return devolucaoRepository.inserir(devolucao);
    }
    @Override
    public Devolucao atualizarDevolucao(Devolucao devolucao) {
        //logica
        return devolucaoRepository.alterar(devolucao);
    }

    @Override
    public Devolucao buscarDevolucaoPorId(String id) {
        //logica
        return devolucaoRepository.buscaPorId(id);
    }

    @Override
    public List<Devolucao> buscarDevolucaoPorCliente(Cliente cliente) {
        //logica
        return devolucaoRepository.buscarTodasDevolucoesDoCliente(cliente);
    }

}
