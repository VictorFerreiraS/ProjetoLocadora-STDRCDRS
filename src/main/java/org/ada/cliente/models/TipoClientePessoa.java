package org.ada.cliente.models;

public enum TipoClientePessoa {
    FISICA(0.05),
    JURIDICA(0.10);

    private final Double valorDesconto;
    TipoClientePessoa(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public Double getValorDesconto() {
        return valorDesconto;
    }
}
