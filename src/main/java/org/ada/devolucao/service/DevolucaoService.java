package org.ada.devolucao.service;


import org.ada.aluguel.Aluguel;
import org.ada.cliente.models.Cliente;
import org.ada.devolucao.models.Devolucao;

import java.util.List;

public interface DevolucaoService {


    Devolucao realizarDevolucao(Aluguel aluguel);

    Devolucao salvarDevolucao(Devolucao devolucao);

    Devolucao atualizarDevolucao(Devolucao devolucao);

    Devolucao buscarDevolucaoPorId(String id);

    List<Devolucao> buscarDevolucaoPorCliente(Cliente cliente);
}
