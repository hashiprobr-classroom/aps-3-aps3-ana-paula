package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CentralTest {
    private Central central;
    private Passageiro passageiro;
    private Passageiro passageiro2;
    private Motorista motorista;
    private Motorista motorista2;
    private Corrida corrida;

    @BeforeEach
    void setUp(){
        central = new Central();
        passageiro = new Passageiro("12345678900", "Reinaldo");
        motorista = new Motorista("01234567890", "Carlos");
    }

    @Test
    void nenhumnaAvaliacaoPassageiro(){
        assertEquals(0, central.mediaPassageiro("12345678900"));
    }

    @Test
    void nenhumaAvaliacaoMotorista(){
        assertEquals(0, central.mediaMotorista("01234567890"));
    }

    @Test
    void avaliacoesPassageiro(){
        passageiro2 = new Passageiro("12345678901", "Reinaldo José");

        Corrida corrida1 = new Corrida(passageiro, motorista);
        motorista.avalia(corrida1, 0);

        Corrida corrida2 = new Corrida(passageiro, motorista);
        motorista.avalia(corrida2, 4);

        Corrida corrida3 = new Corrida(passageiro, motorista);
        motorista.avalia(corrida3, 5);

        Corrida corrida4 = new Corrida(passageiro2, motorista);
        motorista.avalia(corrida4, 3);

        assertEquals(4.5, central.mediaPassageiro("12345678900"));
    }

    @Test
    void avaliacoesMotorista(){
        motorista2 = new Motorista("00123456789", "Carlos José");

        Corrida corrida1 = new Corrida(passageiro, motorista);
        motorista.avalia(corrida1, 0);

        Corrida corrida2 = new Corrida(passageiro, motorista);
        motorista.avalia(corrida2, 2);

        Corrida corrida3 = new Corrida(passageiro, motorista);
        motorista.avalia(corrida3, 3);

        Corrida corrida4 = new Corrida(passageiro, motorista2);
        motorista.avalia(corrida4, 1);

        Corrida corrida5 = new Corrida(passageiro, null);
        motorista.avalia(corrida5, 1);

        assertEquals(2.5, central.mediaMotorista("01234567890"));
    }
}
