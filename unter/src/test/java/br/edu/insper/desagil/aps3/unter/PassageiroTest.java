package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassageiroTest {
    private Passageiro passageiro;

    @BeforeEach
    void setUp(){
        passageiro = new Passageiro("cpf", "nome");
    }

    @Test
    void constoi(){
        assertEquals("nome", passageiro.getNome());
    }

    @Test
    void mudaNome(){
        passageiro.setNome("passageiro");
        assertEquals("passageiro", passageiro.getNome());
    }

    @Test
    void avalia(){
        //o passageiro precisa avaliar a corrida -> método avalia
        //criar motorista e corrida
        //verificar a nota do motorista: getNotaMotorista()

        Motorista motorista = new Motorista("cpfmot", "motorista");
        Corrida corrida = new Corrida(passageiro, motorista);

        passageiro.avalia(corrida, 3);

        assertEquals(3, corrida.getNotaMotorista());
    }

    @Test
    void avaliaBaixo(){
        Motorista motorista = new Motorista("cpfmot", "motorista");
        Corrida corrida = new Corrida(passageiro, motorista);

        passageiro.avalia(corrida, 0);

        assertEquals(1, corrida.getNotaMotorista());
    }

    @Test
    void avaliaAlto(){
        Motorista motorista = new Motorista("cpfmot", "motorista");
        Corrida corrida = new Corrida(passageiro, motorista);

        passageiro.avalia(corrida, 6);

        assertEquals(5, corrida.getNotaMotorista());
    }
}
