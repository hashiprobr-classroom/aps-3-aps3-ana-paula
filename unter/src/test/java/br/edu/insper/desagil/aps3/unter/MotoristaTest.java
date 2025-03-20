package br.edu.insper.desagil.aps3.unter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MotoristaTest {
    Motorista motorista;

    @BeforeEach
    void setUp(){
        motorista = new Motorista("cpfM", "motorista");
    }

    @Test
    void constroi(){
        assertEquals("motorista", motorista.getNome());
    }

    @Test
    void mudaNome(){
        motorista.setNome("motora");
        assertEquals("motora", motorista.getNome());
    }

    @Test
    void avalia(){
        //o motorista deve avaliar o passageiro -> motorista.avalia()
        //verificar a nota -> corrida.getNotaPassageiro()
        Passageiro passageiro = new Passageiro("cpfP", "passageiro");
        Corrida corrida = new Corrida(passageiro, motorista);

        motorista.avalia(corrida, 3);

        assertEquals(3, corrida.getNotaPassageiro());
    }

    @Test
    void avaliaBaixo(){
        //o motorista deve avaliar o passageiro -> motorista.avalia()
        //verificar a nota -> corrida.getNotaPassageiro()
        Passageiro passageiro = new Passageiro("cpfP", "passageiro");
        Corrida corrida = new Corrida(passageiro, motorista);

        motorista.avalia(corrida, 0);

        assertEquals(1, corrida.getNotaPassageiro());
    }

    @Test
    void avaliaAlto(){
        //o motorista deve avaliar o passageiro -> motorista.avalia()
        //verificar a nota -> corrida.getNotaPassageiro()
        Passageiro passageiro = new Passageiro("cpfP", "passageiro");
        Corrida corrida = new Corrida(passageiro, motorista);

        motorista.avalia(corrida, 6);

        assertEquals(5, corrida.getNotaPassageiro());
    }
}
