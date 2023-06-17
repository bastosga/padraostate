package org.example;

public class CarroEstadoManutencao extends EstadoCarro{
    private CarroEstadoManutencao() {};
    private static CarroEstadoManutencao instance = new CarroEstadoManutencao();
    public static CarroEstadoManutencao getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em Manutençao";
    }
    public boolean devolver(Carro carro) {
        carro.setEstado(CarroEstadoDisponivel.getInstance());
        return true;
    }

}
