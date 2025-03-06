package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassageiroTest {
    private Passageiro passageiro;
    private Corrida corrida;
    private Motorista motorista;

    @BeforeEach
    void setUp(){
        passageiro = new Passageiro("38955468210", "José");
    }

    @Test
    void constroi(){
        assertEquals("38955468210", passageiro.getCpf());
        assertEquals("José", passageiro.getNome());
    }

    @Test
    void mudaNome(){
        passageiro.setNome("Reinaldo");
        assertEquals("Reinaldo", passageiro.getNome());
    }

    @Test
    void avalia(){
        motorista = new Motorista("12345678900", "Carlos");
        corrida = new Corrida(passageiro, motorista);

        passageiro.avalia(corrida, 3);

        assertEquals(3, corrida.getNotaMotorista());
    }

    @Test
    void avaliaBaixo(){
        motorista = new Motorista("12345678900", "Carlos");
        corrida = new Corrida(passageiro, motorista);

        passageiro.avalia(corrida, 0);

        assertEquals(1, corrida.getNotaMotorista());
    }

    @Test
    void avaliaAlto(){
        motorista = new Motorista("12345678900", "Carlos");
        corrida = new Corrida(passageiro, motorista);

        passageiro.avalia(corrida, 6);

        assertEquals(5, corrida.getNotaMotorista());
    }

}
