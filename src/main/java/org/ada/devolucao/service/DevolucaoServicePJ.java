package org.ada.devolucao.service;

import org.ada.aluguel.Aluguel;
import org.ada.devolucao.repository.DescontosPJRepository;
import org.ada.devolucao.repository.DevolucaoRepository;

public class DevolucaoServicePJ extends DevolucaoServiceImplBase {

    private DescontosPJRepository descontosPJRepository;

    public DevolucaoServicePJ(DevolucaoRepository devolucaoRepository, DescontosPJRepository descontosPJRepository) {
        super(devolucaoRepository);
        this.descontosPJRepository = descontosPJRepository;
    }


    @Override
    public Double calcularTaxaDesconto(Aluguel aluguel) {
        if (aluguel.getTempoLocacaoEmDias() >= descontosPJRepository.getDiasNecessarios()) {
            return descontosPJRepository.getDesconto();
        }
        return 0.0;
    }

    @Override
    public Double calcularTaxaDeslocamento(Aluguel aluguel) {
        if (aluguel.isMesmoLocalDeDevolucao()) return 0.0;
        return descontosPJRepository.getTaxaDeslocamento();
    }
}
