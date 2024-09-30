package org.ada.comprovante.validations;

import org.ada.comprovante.models.Comprovante;
import org.ada.comprovante.models.ComprovanteGeneratable;
import org.ada.comprovante.repository.ComprovanteRepository;
import org.ada.comprovante.validations.exceptions.ComprovanteInvalidoException;

import java.util.List;

public class ValidadorDeComprovante<T extends ComprovanteGeneratable> {

    private final ComprovanteRepository<T> comprovanteRepository;

    public ValidadorDeComprovante(ComprovanteRepository<T> comprovanteRepository) {
        this.comprovanteRepository = comprovanteRepository;
    }

    public void checarSeExiste(Comprovante<T> comprovante) {
        List<Comprovante<T>> todosComprovantes = comprovanteRepository.buscarTodosComprovantes();
        if (todosComprovantes.contains(comprovante)) {
            throw new ComprovanteInvalidoException("Comprovante já existe.");
        }
    }

    public void checarSeNaoExiste(Comprovante<T> comprovante) {
        List<Comprovante<T>> todosComprovantes = comprovanteRepository.buscarTodosComprovantes();
        if (!todosComprovantes.contains(comprovante)) {
            throw new ComprovanteInvalidoException("Comprovante não existe.");
        }
    }
}
