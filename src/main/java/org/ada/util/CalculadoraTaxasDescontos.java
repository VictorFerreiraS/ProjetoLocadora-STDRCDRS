package org.ada.util;

import org.ada.aluguel.Aluguel;

public interface CalculadoraTaxasDescontos {

    Double calcularDescontos(Aluguel aluguel);

    Double calcularTaxaDeslocamento(Aluguel aluguel);
}
