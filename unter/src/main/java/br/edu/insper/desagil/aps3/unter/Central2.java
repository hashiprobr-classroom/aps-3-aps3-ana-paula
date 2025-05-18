package br.edu.insper.desagil.aps3.unter;

import java.util.ArrayList;
import java.util.List;

public class Central2 {
    private ArrayList<Corrida2> corridas;

    public Central2() {
        this.corridas = new ArrayList<>();
    }

    public double mediaPassageiro(String cpf){
        double nota = 0;
        if (corridas.size() == 0){
            return 0;
        }
        for (Corrida2 corrida : corridas){
            if (corrida.getPassageiro().getCpf().equals(cpf)) { // verificação de corrida por cpf
                nota = corrida.getNotaPassageiro();
                if (nota>1){
                    nota += nota;
                }
            }
        }
        return nota/corridas.size();
    }

    public double mediaMotorista (String cpf){
        double nota = 0;
        if (corridas.size() == 0){
            return 0;
        }
        for (Corrida2 corrida : corridas){
            if (corrida.getMotorista().getCpf().equals(cpf)) {
                nota = corrida.getNotaMotorista();
                if (nota>1){
                    nota += nota;
                }
            }
        }
        return nota/corridas.size();
    }

    public void adiciona(Corrida2 corrida){
        corridas.add(corrida);
    }
}
