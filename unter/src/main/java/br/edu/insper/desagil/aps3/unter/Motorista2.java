package br.edu.insper.desagil.aps3.unter;

public class Motorista2 extends Usuario2{
    public Motorista2(String cpf, String nome) {
        super(cpf, nome);
    }

    @Override
    public void avalia(Corrida2 corrida, int nota) {
        corrida.avaliaPassageiro(nota);
    }
}
