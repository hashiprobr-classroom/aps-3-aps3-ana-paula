package br.edu.insper.desagil.aps3.unter;

public class Passageiro2 extends Usuario2 {
    public Passageiro2(String cpf, String nome) {
        super(cpf, nome);
    }

    @Override
    public void avalia(Corrida2 corrida, int nota) { // atribui a nota ao motorista d
        corrida.avaliaMotorista(nota);
    }
}
