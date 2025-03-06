package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;

public class CentralTest {
    Central central;
    Passageiro passageiro;
    Motorista motorista;

    @BeforeEach
    void setUp(){
        central = new Central();
        passageiro = new Passageiro("12345678900", "Reinaldo");
        motorista = new Motorista("01234567890", "Carlos");
    }
}
