package org.ada.aluguel;

import org.ada.cliente.models.Cliente;

import java.util.HashMap;
import java.util.Map;

public class AluguelRepositoryImpl implements AluguelRepository {

    private Map<Cliente, Aluguel> aluguelDatabase = new HashMap<>();


    @Override
    public Aluguel inserir(Aluguel aluguel) {
        return aluguelDatabase.put(aluguel.getCliente(),aluguel);
    }

    @Override
    public Aluguel alterar(Aluguel aluguel) {
        return aluguelDatabase.replace(aluguel.getCliente(),aluguel);
    }

    @Override
    public Aluguel deletar(Aluguel aluguel) {
        return aluguelDatabase.remove(aluguel.getCliente());
    }

    @Override
    public Aluguel buscaPorId(String id) {
        return null;
    }

    @Override
    public Aluguel deletarPorId(String id) {
        Aluguel aluguelParaDeletar = aluguelDatabase.values().stream().filter(aluguel -> aluguel.getUuid().equals(id)).findFirst().orElse(null);
        return aluguelDatabase.remove(aluguelParaDeletar.getCliente());
    }

    @Override
    public Aluguel buscarAluguelPorCliente(Cliente cliente) {
        return aluguelDatabase.get(cliente);
    }

    @Override
    public Aluguel buscarAluguelPorNome(String nome) {
        return aluguelDatabase.values().stream().filter(aluguel -> aluguel.getCliente().getNome().equals(nome)).findFirst().orElse(null);
    }
}
