package org.ada.comprovante.models;

import java.time.LocalDateTime;
import java.util.UUID;

public record Comprovante<T>(
        String comprovanteId,
        LocalDateTime dataEmissao,
        T dados
) {
    public Comprovante(T dados) {
        this(UUID.randomUUID().toString(), LocalDateTime.now(), dados);
    }
}

