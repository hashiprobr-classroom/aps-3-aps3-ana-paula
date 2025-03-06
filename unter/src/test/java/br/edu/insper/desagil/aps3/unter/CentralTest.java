package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CentralTest {
    private Central central;
    private Passageiro passageiro;
    private Motorista motorista;
    private List<Corrida> corridas;

    @BeforeEach
    void setUp(){
        central = new Central();
        passageiro = new Passageiro("12345678000", "Ana Paula");
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
        Passageiro passageiro2 = new Passageiro("12345678901", "Reinaldo José");
        corridas = new ArrayList<>();

        Corrida corrida1 = new Corrida(passageiro, motorista);
        motorista.avalia(corrida1, 0);
        central.adiciona(corrida1);

        Corrida corrida2 = new Corrida(passageiro, motorista);
        motorista.avalia(corrida2, 4);
        central.adiciona(corrida2);

        Corrida corrida3 = new Corrida(passageiro, motorista);
        motorista.avalia(corrida3, 5);
        central.adiciona(corrida3);

        Corrida corrida4 = new Corrida(passageiro2, motorista);
        motorista.avalia(corrida4, 3);
        central.adiciona(corrida4);

        assertEquals(4.5, central.mediaPassageiro("12345678000"));
    }

    @Test
    void avaliacoesMotorista(){
        Motorista motorista2 = new Motorista("00123456789", "Carlos José");
        corridas = new ArrayList<>();

        Corrida corrida1 = new Corrida(passageiro, motorista);
        passageiro.avalia(corrida1, 0);
        central.adiciona(corrida1);

        Corrida corrida2 = new Corrida(passageiro, motorista);
        passageiro.avalia(corrida2, 2);
        central.adiciona(corrida2);

        Corrida corrida3 = new Corrida(passageiro, motorista);
        passageiro.avalia(corrida3, 3);
        central.adiciona(corrida3);

        Corrida corrida4 = new Corrida(passageiro, motorista2);
        passageiro.avalia(corrida4, 1);
        central.adiciona(corrida4);

        Corrida corrida5 = new Corrida(passageiro, null);
        passageiro.avalia(corrida5, 1);
        central.adiciona(corrida5);

        assertEquals(2.5, central.mediaMotorista("12345678000"));
    }
}
