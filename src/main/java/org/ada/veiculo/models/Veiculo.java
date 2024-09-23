package org.ada.veiculo.models;

import org.ada.basemodel.BaseModel;

public abstract class Veiculo extends BaseModel {

    private String placa;
    private String marca;
    private String modelo;
    private String ano;
    private final Double DIARIA;

    public Veiculo(String placa, String marca, String modelo, String ano, Double DIARIA) {
        super();
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.DIARIA = DIARIA;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAno() {
        return ano;
    }

    public Double getDIARIA() {
        return DIARIA;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
