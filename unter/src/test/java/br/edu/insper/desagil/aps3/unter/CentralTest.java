package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CentralTest {
    Central central;

    @BeforeEach
    void setUp(){
        central = new Central();
    }

    @Test
    void nenhumaAvaliacaoPassageiro(){
        assertEquals(0, central.mediaPassageiro("123456789-00"));
    }

    @Test
    void nenhumaAvaliaxaoMotorista(){
        assertEquals(0, central.mediaMotorista("009876543-21"));
    }

    @Test
    void avaliacoesPassageiro(){
        //adiciona 4 corridas: central.adiciona()
        Passageiro passageiro = new Passageiro("P", "Carlos");
        Passageiro passageiro2 = new Passageiro("P2", "passageiro");
        Motorista motorista = new Motorista("M", "motorista");

        Corrida corrida1 = new Corrida(passageiro, motorista);
        Corrida corrida2 = new Corrida(passageiro, motorista);
        Corrida corrida3 = new Corrida(passageiro, motorista);
        Corrida corrida4 = new Corrida(passageiro2, motorista);

        motorista.avalia(corrida1, 0);
        motorista.avalia(corrida2, 4);
        motorista.avalia(corrida3, 5);
        motorista.avalia(corrida4, 3);

        central.adiciona(corrida1);
        central.adiciona(corrida2);
        central.adiciona(corrida3);
        central.adiciona(corrida4);

        assertEquals(4.5, central.mediaPassageiro("P"));
    }

    @Test
    void avaliacoesMotorista(){
        Passageiro passageiro = new Passageiro("P", "Carlos");
        Motorista motorista = new Motorista("M", "motorista");
        Motorista motorista2 = new Motorista("M2", "motorista2");

        Corrida corrida1 = new Corrida(passageiro, motorista);
        Corrida corrida2 = new Corrida(passageiro, motorista);
        Corrida corrida3 = new Corrida(passageiro, motorista);
        Corrida corrida4 = new Corrida(passageiro, motorista2);
        Corrida corrida5 = new Corrida(passageiro, null);

        passageiro.avalia(corrida1, 0);
        passageiro.avalia(corrida2, 2);
        passageiro.avalia(corrida3, 3);
        passageiro.avalia(corrida4, 1);
        passageiro.avalia(corrida5, 1);

        central.adiciona(corrida1);
        central.adiciona(corrida2);
        central.adiciona(corrida3);
        central.adiciona(corrida4);
        central.adiciona(corrida5);

        assertEquals(2.5, central.mediaMotorista("M"));
    }
}
