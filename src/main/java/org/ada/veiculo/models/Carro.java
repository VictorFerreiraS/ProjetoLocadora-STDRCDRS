package org.ada.veiculo.models;

public class Carro extends Veiculo {
    public Carro(String placa, String marca, String modelo, String ano) {
        super(placa, marca, modelo, ano, TipoVeiculo.CARRO);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "uuid='" + getUuid() + '\'' +
                ", createdDate='" + getCreatedAt() + '\'' +
                ", placa='" + getPlaca() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", ano='" + getAno() + '\'' +
                ", DIARIA=" + getValorDiaria() +
                '}';
    }
}
