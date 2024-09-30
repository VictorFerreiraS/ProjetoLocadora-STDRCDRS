package org.ada.agencia.repository;

import org.ada.agencia.models.Agencia;
import org.ada.dataframework.CrudRepository;
import org.ada.veiculo.models.Veiculo;
import java.util.List;

public interface AgenciaRepository extends CrudRepository<Agencia, String> {

    List<Agencia> buscarTodasAgencias();
    String adicionarVeiculo(String nomeAgencia, Veiculo veiculo);
    Agencia buscarAgencia(String nomeAgencia);
}
