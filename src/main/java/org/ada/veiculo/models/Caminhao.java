package org.ada.veiculo.models;

public class Caminhao extends Veiculo {
    public Caminhao(String placa, String marca, String modelo, String ano) {
        super(placa, marca, modelo, ano, TipoVeiculo.CAMINHAO);
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "uuid='" + getUuid() + '\'' +
                ", createdDate='" + getCreatedAt() + '\'' +
                "placa='" + getPlaca() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", ano='" + getAno() + '\'' +
                ", DIARIA=" + getValorDiaria() +
                '}';
    }
}
