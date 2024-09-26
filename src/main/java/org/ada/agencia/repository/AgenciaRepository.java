package org.ada.agencia.repository;

import org.ada.agencia.models.Agencia;
import org.ada.dataframework.CrudRepository;
import org.ada.veiculo.models.Veiculo;

import java.util.Collection;
import java.util.List;

import java.util.List;

public interface AgenciaRepository extends CrudRepository<Agencia, String> {

    Collection<Agencia> buscarTodasAgencias();
    String adicionarVeiculo(String nomeAgencia, Veiculo veiculo);
    List<Agencia> procurarAgencia(String nomeAgencia);
}
