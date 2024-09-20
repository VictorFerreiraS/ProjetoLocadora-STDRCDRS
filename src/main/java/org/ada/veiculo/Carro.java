package org.ada.veiculo;

public class Carro extends Veiculo {
    public Carro(String placa, String marca, String modelo, String ano) {
        super(placa, marca, modelo, ano, 150.00);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + getPlaca() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", ano='" + getAno() + '\'' +
                ", DIARIA=" + getDIARIA() +
                '}';
    }
}
