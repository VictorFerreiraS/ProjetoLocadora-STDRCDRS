package org.ada.devolucao.validations;

import org.ada.devolucao.repository.DevolucaoRepository;

public class ValidadorDeDevolucao {

    private final DevolucaoRepository devolucaoRepository;

    public ValidadorDeDevolucao(DevolucaoRepository devolucaoRepository) {
        this.devolucaoRepository = devolucaoRepository;
    }
}
