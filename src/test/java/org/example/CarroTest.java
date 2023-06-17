import org.example.Carro;
import org.example.CarroEstadoAlugado;
import org.example.CarroEstadoDisponivel;
import org.example.CarroEstadoManutencao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CarroTest {
    Carro carro;
    @BeforeEach
    public void setUp() {
        carro = new Carro("Gol","FRG0101");
    }
    @Test
    public void naoDeveDevolverCarroDisponivel() {
        carro.setEstado(CarroEstadoDisponivel.getInstance());
        assertFalse(carro.devolver());
    }

    @Test
    public void deveAlugarCarroDisponivel() {
        carro.setEstado(CarroEstadoDisponivel.getInstance());
        assertTrue(carro.alugar());
        assertEquals(CarroEstadoAlugado.getInstance(), carro.getEstado());
    }
    @Test
    public void deveEnviarParaManutencaoCarroDisponivel() {
        carro.setEstado(CarroEstadoDisponivel.getInstance());
        assertTrue(carro.emManutencao());
        assertEquals(CarroEstadoManutencao.getInstance(), carro.getEstado());
    }

    @Test
    public void naoDeveEnviarParaManutencaoCarroAlugado() {
        carro.setEstado(CarroEstadoAlugado.getInstance());
        assertFalse(carro.emManutencao());
    }
    @Test
    public void naoDeveAlugarCarroAlugado() {
        carro.setEstado(CarroEstadoAlugado.getInstance());
        assertFalse(carro.alugar());
    }
    @Test
    public void deveDevolverCarroAlugado() {
        carro.setEstado(CarroEstadoAlugado.getInstance());
        assertTrue(carro.devolver());
        assertEquals(CarroEstadoDisponivel.getInstance(), carro.getEstado());
    }

    @Test

    public void naoDeveEnviarParaManutencaoCarroeEmManutencao() {
        carro.setEstado(CarroEstadoManutencao.getInstance());
        assertFalse(carro.emManutencao());
    }
    @Test
    public void naoDeveAlugarCarroEmManutencao() {
        carro.setEstado(CarroEstadoManutencao.getInstance());
        assertFalse(carro.alugar());
    }
    @Test
    public void deveDevolverCarroEmManutencao() {
        carro.setEstado(CarroEstadoManutencao.getInstance());
        assertTrue(carro.devolver());
        assertEquals(CarroEstadoDisponivel.getInstance(), carro.getEstado());
    }


}
