package com.mycompany.horticultura;

public class Estufa {
    private double temperaturaAtual;
    private double umidadeAtual;
    private double temperaturaMin;
    private double temperaturaMax;
    private double umidadeMin;
    private double umidadeMax;

    public Estufa(double temperaturaMin, double temperaturaMax, double umidadeMin, double umidadeMax) {
        this.temperaturaMin = temperaturaMin;
        this.temperaturaMax = temperaturaMax;
        this.umidadeMin = umidadeMin;
        this.umidadeMax = umidadeMax;
        this.temperaturaAtual = temperaturaMin;
        this.umidadeAtual = umidadeMin;
    }

    public boolean ajustarTemperatura(double novaTemperatura) {
        if (novaTemperatura >= temperaturaMin && novaTemperatura <= temperaturaMax) {
            temperaturaAtual = novaTemperatura;
            return true;
        }
        return false;
    }

    public boolean ajustarUmidade(double novaUmidade) {
        if (novaUmidade >= umidadeMin && novaUmidade <= umidadeMax) {
            umidadeAtual = novaUmidade;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Temperatura atual: " + temperaturaAtual + "°C\n" +
               "Umidade atual: " + umidadeAtual + "%";
    }
}

