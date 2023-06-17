package org.example;

abstract class EstadoCarro {
    public abstract String getEstado();

    public boolean alugar(Carro carro) {
        return false;
    }

    public boolean devolver(Carro carro) {
        return false;
    }

    public boolean emManutencao(Carro carro) {
        return false;
    }
}
