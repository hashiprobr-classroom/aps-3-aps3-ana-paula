package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CentralTest2 {
    public Central2 central;

    @BeforeEach
    public void setUp(){
        central = new Central2();
    }

    @Test
    public void nenhumaAvaliacaoPassageiro(){
        assertEquals(0, central.mediaPassageiro("cpfCentralTest"));
    }

    @Test
    public void nenhumaAvaliacaoMotorista(){
        assertEquals(0, central.mediaMotorista("cpfCentralTestMoto"));
    }

    @Test
    public void avaliacoesPassageiro(){
        Passageiro2 passageiro = new Passageiro2("cpfPass", "nome");
        Passageiro2 passageiro2 = new Passageiro2("cpfPass2", "nome");

        Corrida2 corrida1 = new Corrida2(passageiro);
        Corrida2 corrida2 = new Corrida2(passageiro);
        Corrida2 corrida3 = new Corrida2(passageiro);
        Corrida2 corrida4 = new Corrida2(passageiro2);

        corrida1.avaliaPassageiro(0);
        corrida2.avaliaPassageiro(4);
        corrida3.avaliaPassageiro(5);
        corrida4.avaliaPassageiro(3);

        central.adiciona(corrida1);
        central.adiciona(corrida2);
        central.adiciona(corrida3);
        central.adiciona(corrida4);

        assertEquals(4.5, central.mediaPassageiro("cpfPass"));
    }

    @Test
    public void avaliacoesMotorista(){
        Passageiro2 passageiro = new Passageiro2("cpfPass", "nome");
        Passageiro2 passageiro2 = new Passageiro2("cpfPass2", "nome");

        Motorista2 motorista = new Motorista2("cpfMoto", "nome");
        Motorista2 motorista2 = new Motorista2("cpfMoto2", "nome");

        Corrida2 corrida1 = new Corrida2(passageiro);
        Corrida2 corrida2 = new Corrida2(passageiro);
        Corrida2 corrida3 = new Corrida2(passageiro);
        Corrida2 corrida4 = new Corrida2(passageiro2);
        Corrida2 corrida5 = new Corrida2(passageiro);

        corrida1.avaliaMotorista(0);
        corrida2.avaliaMotorista(2);
        corrida3.avaliaMotorista(3);
        corrida4.avaliaMotorista(1);
        corrida5.avaliaMotorista(1);

        central.adiciona(corrida1);
        central.adiciona(corrida2);
        central.adiciona(corrida3);
        central.adiciona(corrida4);
        central.adiciona(corrida5);

        assertEquals(2.5, central.mediaMotorista("cpfMoto"));
    }
}
