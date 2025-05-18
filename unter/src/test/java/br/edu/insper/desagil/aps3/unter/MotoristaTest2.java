package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotoristaTest2 {
    private Motorista2 motorista;

    @BeforeEach
    public void setUp(){
        motorista = new Motorista2("cpf", "nome");
    }

    @Test
    public void controi(){
        assertEquals("cpf", motorista.getCpf());
        assertEquals("nome", motorista.getNome());
    }

    @Test
    public void avalia(){
        Passageiro2 passageiro = new Passageiro2("cpfP", "nomeP");
        Corrida2 corrida = new Corrida2(passageiro);

        motorista.avalia(corrida, 3);

        assertEquals(3, corrida.getNotaPassageiro());
    }

    @Test
    public void avaliaBaixo(){
        Passageiro2 passageiro = new Passageiro2("cpfP2", "nomeP");
        Corrida2 corrida = new Corrida2(passageiro);

        motorista.avalia(corrida, 0);

        assertEquals(1, corrida.getNotaPassageiro());
    }

    @Test
    public void avaliaAlto(){
        Passageiro2 passageiro = new Passageiro2("cpfP3", "nomeP");
        Corrida2 corrida = new Corrida2(passageiro);

        motorista.avalia(corrida, 6);

        assertEquals(5, corrida.getNotaPassageiro());
    }
}
