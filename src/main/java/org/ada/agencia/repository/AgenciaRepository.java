package org.ada.agencia.repository;

import org.ada.agencia.models.Agencia;
import org.ada.dataframework.CrudRepository;

import java.util.List;

public interface AgenciaRepository extends CrudRepository<Agencia, String> {
    Agencia buscaPorNome(String nome);

    List<Agencia> buscaPorParte(String parteNome);
}
