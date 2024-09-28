package org.ada.veiculo.validations;

import org.ada.veiculo.models.Veiculo;
import org.ada.veiculo.repository.VeiculoRepository;
import org.ada.veiculo.validations.exceptions.VeiculoInvalidoException;

public class ValidadorDeVeiculo {

    private final VeiculoRepository veiculoRepository;

    public ValidadorDeVeiculo(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    public void checarSeExiste(Veiculo veiculo) {

    }

    public void checarSeNaoExiste(Veiculo veiculo) {

    }

    public void checarPlaca(String placa) {
        if (placa.equals("") || placa == null) {
            throw new VeiculoInvalidoException("Placa invalida");
        }
    }
}
