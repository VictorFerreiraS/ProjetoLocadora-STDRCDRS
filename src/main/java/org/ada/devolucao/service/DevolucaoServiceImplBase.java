package org.ada.devolucao.service;


import org.ada.aluguel.Aluguel;
import org.ada.cliente.models.Cliente;
import org.ada.devolucao.models.Devolucao;
import org.ada.devolucao.repository.DevolucaoRepository;

import java.util.List;

public abstract class DevolucaoServiceImplBase implements DevolucaoService {

    private DevolucaoRepository devolucaoRepository;

    public DevolucaoServiceImplBase(DevolucaoRepository devolucaoRepository) {
        this.devolucaoRepository = devolucaoRepository;
    }


    @Override
    public Devolucao realizarDevolucao(Aluguel aluguel) {

        Double desconto = this.calcularTaxaDesconto(aluguel);

        Double taxaDeslocamento = this.calcularTaxaDeslocamento(aluguel);

        return new Devolucao(aluguel,desconto,taxaDeslocamento);
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
    public abstract Double calcularTaxaDesconto(Aluguel aluguel);

    public abstract Double calcularTaxaDeslocamento(Aluguel aluguel);
}
