package org.ada.veiculo;

public class Carro extends Veiculo{

    private String placa;
    private String marca;
    private String modelo;
    private String ano;
    private Double DIARIA = 150.00;

    public Carro(String placa, String marca, String modelo, String ano) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano='" + ano + '\'' +
                ", DIARIA=" + DIARIA +
                '}';
    }
}
