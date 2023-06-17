package org.example;

public class Carro {
    private EstadoCarro estado;
    private String modelo;
    private String placa;

    public Carro(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
        this.estado = CarroEstadoDisponivel.getInstance();
    }

    public void setEstado(EstadoCarro estado) {
        this.estado = estado;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public boolean alugar() {
        return estado.alugar(this);
    }

    public boolean devolver() {
        return estado.devolver(this);
    }

    public boolean emManutencao() {
        return estado.emManutencao(this);
    }
    public String getNomeEstado() {
        return estado.getEstado();
    }
    public EstadoCarro getEstado() {
        return estado;
    }
}