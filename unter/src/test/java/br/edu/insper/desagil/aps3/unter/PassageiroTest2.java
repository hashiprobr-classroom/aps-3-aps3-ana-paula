package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassageiroTest2 {
    private Passageiro2 passageiro;

    @BeforeEach
    public void setUp(){
        passageiro = new Passageiro2("cpf", "nome");
    }

    @Test
    public void controi(){
        assertEquals("cpf", passageiro.getCpf());
        assertEquals("nome", passageiro.getNome());
    }

    @Test
    public void mudaNome(){
        passageiro.setNome("nomeNovo");

        assertEquals("nomeNovo", passageiro.getNome());
    }

    @Test
    public void avalia(){
        Corrida2 corrida = new Corrida2(passageiro);

        passageiro.avalia(corrida, 3);

        assertEquals(3, corrida.getNotaMotorista());
    }

    @Test
    public void avaliaBaixo(){
        Corrida2 corrida = new Corrida2(passageiro);

        passageiro.avalia(corrida, 0);

        assertEquals(1, corrida.getNotaMotorista());
    }

    @Test
    public void avaliaAlto(){
        Corrida2 corrida = new Corrida2(passageiro);

        passageiro.avalia(corrida, 6);

        assertEquals(5, corrida.getNotaMotorista());
    }
}
