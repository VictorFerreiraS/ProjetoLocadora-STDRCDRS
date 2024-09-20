package org.ada.veiculo;

public class Moto extends Veiculo{
    public Moto(String placa, String marca, String modelo, String ano, Double DIARIA) {
        super(placa, marca, modelo, ano, 100.00);
    }

    @Override
    public String toString() {
        return "Moto{" +
                "placa='" + getPlaca() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", ano='" + getAno() + '\'' +
                ", DIARIA=" + getDIARIA() +
                '}';
    }
}
