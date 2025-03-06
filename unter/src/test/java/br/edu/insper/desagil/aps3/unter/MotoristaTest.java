package br.edu.insper.desagil.aps3.unter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MotoristaTest {

    @Test
    public void constroi() {
        Motorista motorista = new Motorista("09876543211", "Carlos");
        assertEquals("09876543211", motorista.getCpf());
        assertEquals("Carlos", motorista.getNome());
    }

    @Test
    public void mudaNome() {
        Motorista motorista = new Motorista("09876543211", "Carlos");
        motorista.setNome("Ricardo");
        assertEquals("Ricardo", motorista.getNome());
    }

    @Test
    public void avalia() {
        Passageiro passageiro = new Passageiro("12345678900", "Ana");
        Motorista motorista = new Motorista("09876543211", "Carlos");
        Corrida corrida = new Corrida(passageiro, motorista);

        motorista.avalia(corrida, 3);
        assertEquals(3, corrida.getNotaPassageiro());
    }

    @Test
    public void avaliaBaixo() {
        Passageiro passageiro = new Passageiro("12345678900", "Ana");
        Motorista motorista = new Motorista("09876543211", "Carlos");
        Corrida corrida = new Corrida(passageiro, motorista);

        motorista.avalia(corrida, 0);
        assertEquals(1, corrida.getNotaPassageiro());
    }

    @Test
    public void avaliaAlto() {
        Passageiro passageiro = new Passageiro("12345678900", "Ana");
        Motorista motorista = new Motorista("09876543211", "Carlos");
        Corrida corrida = new Corrida(passageiro, motorista);

        motorista.avalia(corrida, 6);
        assertEquals(5, corrida.getNotaPassageiro());
    }
}
