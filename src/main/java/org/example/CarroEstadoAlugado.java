package org.example;

public class CarroEstadoAlugado  extends EstadoCarro{
    private CarroEstadoAlugado() {};
    private static CarroEstadoAlugado instance = new CarroEstadoAlugado();
    public static CarroEstadoAlugado getInstance() {
        return instance;
    }
    public String getEstado() {
        return "Alugado";
    }
    public boolean devolver(Carro carro) {
        carro.setEstado(CarroEstadoDisponivel.getInstance());
        return true;
    }

}
