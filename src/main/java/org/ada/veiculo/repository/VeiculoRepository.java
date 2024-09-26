package org.ada.veiculo.repository;

import org.ada.dataframework.CrudRepository;
import org.ada.veiculo.models.Veiculo;

public interface VeiculoRepository extends CrudRepository<Veiculo, String> {

    Veiculo buscarVeiculoPorPlaca(String placa);

}
