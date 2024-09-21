package org.ada.agencia.repository;

import org.ada.agencia.models.Agencia;
import org.ada.dataframework.CrudRepository;

public interface AgenciaRepository extends CrudRepository<Agencia, Long> {
    Agencia buscaPorNome(String nome);
}
