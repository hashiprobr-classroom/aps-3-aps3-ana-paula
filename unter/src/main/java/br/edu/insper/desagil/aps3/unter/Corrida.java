package br.edu.insper.desagil.aps3.unter;

import javax.swing.*;

public class Corrida {
    private Passageiro passageiro;
    private Motorista motorista;
    private Integer nota_p;
    private Integer nota_m;

    public Corrida(Passageiro passageiro, Motorista motorista, Integer nota_p, Integer nota_m) {
        this.passageiro = passageiro;
        this.motorista = motorista = null;
        this.nota_p = nota_p = 0;
        this.nota_m = nota_m = 0;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Integer getNota_p() {
        return nota_p;
    }

    public Integer getNota_m() {
        return nota_m;
    }

    private Integer nota(Integer nota){
        if (nota_m<1){
            return 1;
        }
        else if (nota_p<1){
            return  1;
        }
        else if (nota_m>5){
            return  5;
        }
        else if (nota_p>5){
            return  5;
        }
        else if (nota_m<1 && nota_m>5){
            return  nota_m;
        }
        else{
            return nota_p;
        }
    }

    private void notaPassageiro(Integer nota_p){
        nota_p = nota(nota_p);
    }

    private void notaMotorista(Integer nota_m){
        nota_m = nota(nota_m);
    }
}
