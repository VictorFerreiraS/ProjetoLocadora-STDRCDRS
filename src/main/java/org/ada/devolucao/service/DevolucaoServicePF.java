package org.ada.devolucao.service;

import org.ada.aluguel.Aluguel;
import org.ada.devolucao.repository.DescontosPFRepository;
import org.ada.devolucao.repository.DevolucaoRepository;
import org.ada.util.CalculadoraTaxasDescontos;

public class DevolucaoServicePF extends DevolucaoServiceImplBase {

    private DescontosPFRepository descontosPFRepository;

    public DevolucaoServicePF(DevolucaoRepository devolucaoRepository, DescontosPFRepository descontosPFRepository) {
        super(devolucaoRepository);
        this.descontosPFRepository = descontosPFRepository;
    }


    @Override
    public Double calcularTaxaDesconto(Aluguel aluguel) {
        if (aluguel.getTempoLocacaoEmDias() >= descontosPFRepository.getDiasNecessarios()) {
            return descontosPFRepository.getDesconto();
        }
        return 0.0;
    }

    @Override
    public Double calcularTaxaDeslocamento(Aluguel aluguel) {
        if (aluguel.isMesmoLocalDeDevolucao()) return 0.0;
        return descontosPFRepository.getTaxaDeslocamento();
    }
}
