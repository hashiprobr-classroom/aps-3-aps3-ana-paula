package br.edu.insper.desagil.aps3.unter;

public class Corrida2 {
    private Passageiro2 passageiro;
    private Motorista2 motorista;
    private int notaPassageiro; // dada pelo motorista e recebida pelo passageiro
    private int notaMotorista; //dada pelo passageiro e recebida pelo motorista

    public Corrida2(Passageiro2 passageiro) {
        this.passageiro = passageiro;
        this.motorista = null;
        this.notaPassageiro = 0;
        this.notaMotorista = 0;
    }

    public Passageiro2 getPassageiro() {
        return passageiro;
    }

    public Motorista2 getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista2 motorista) {
        this.motorista = motorista;
    }

    public int getNotaPassageiro() {
        return notaPassageiro;
    }

    public int getNotaMotorista() {
        return notaMotorista;
    }

    private int avalia(int nota){
        if (nota<1){
            return 1;
        } else if (nota>5){
            return 5;
        } else{
            return nota;
        }
    }

    public void avaliaPassageiro (int nota){
        notaPassageiro = avalia(nota);
    }

    public void avaliaMotorista (int nota){
        notaMotorista = avalia(nota);
    }
}
