package org.ada.util;

import org.ada.aluguel.Aluguel;
import org.ada.devolucao.repository.DescontosPJRepository;

public class CalculadoraTaxasDescontosPJ implements CalculadoraTaxasDescontos {

    private DescontosPJRepository descontosPJRepository;

    public CalculadoraTaxasDescontosPJ(DescontosPJRepository descontosPJRepository) {
        this.descontosPJRepository = descontosPJRepository;
    }

    @Override
    public Double calcularDescontos(Aluguel aluguel) {
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
