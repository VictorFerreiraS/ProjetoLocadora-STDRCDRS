package org.ada.aluguel;

import org.ada.cliente.models.Cliente;
import org.ada.dataframework.CrudRepository;

public interface AluguelRepository extends CrudRepository<Aluguel, String> {

    Aluguel buscarAluguelPorCliente(Cliente cliente);

    Aluguel buscarAluguelPorNome(String nome);
}
