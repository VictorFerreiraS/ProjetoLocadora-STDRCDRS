package org.ada.util;

import org.ada.aluguel.Aluguel;
import org.ada.devolucao.repository.DescontosPFRepository;

public class CalculadoraTaxasDescontosPF implements CalculadoraTaxasDescontos{

    private DescontosPFRepository descontosPFRepository;

    public CalculadoraTaxasDescontosPF(DescontosPFRepository descontosPFRepository) {
        this.descontosPFRepository = descontosPFRepository;
    }


    @Override
    public Double calcularDescontos(Aluguel aluguel) {
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
