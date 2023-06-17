package org.example;

public class CarroEstadoDisponivel extends  EstadoCarro{
    private CarroEstadoDisponivel() {};
    private static CarroEstadoDisponivel instance = new CarroEstadoDisponivel();
    public static CarroEstadoDisponivel getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Disponível";
    }

    public boolean alugar(Carro carro) {
        carro.setEstado(CarroEstadoAlugado.getInstance());
        return true;
    }
    public boolean emManutencao(Carro carro) {
        carro.setEstado(CarroEstadoManutencao.getInstance());
        return true;
    }

}
