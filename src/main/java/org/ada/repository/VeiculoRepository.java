package org.ada.repository;

import org.ada.veiculo.Veiculo;

public interface VeiculoRepository extends CRUD<Veiculo, Integer> {
    Veiculo buscaPorNome(String nome);
}
