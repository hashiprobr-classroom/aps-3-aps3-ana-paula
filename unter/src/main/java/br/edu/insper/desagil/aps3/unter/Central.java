package br.edu.insper.desagil.aps3.unter;

import java.util.ArrayList;
import java.util.List;

public class Central {
    private List<Corrida> corridas;

    public Central() {
        this.corridas = new ArrayList<>();
    }

    public void adiciona(Corrida corrida) {
        this.corridas.add(corrida);
    }

    private boolean comparaStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public double mediaPassageiro(String cpf) {
        int soma = 0;
        int quantidade = 0;

        for (Corrida corrida : corridas) {
            if (comparaStrings(corrida.getPassageiro().getCpf(), cpf)) {
                int nota = corrida.getNotaPassageiro();
                if (nota > 0) {
                    soma += nota;
                    quantidade++;
                }
            }
        }

        if (quantidade == 0) {
            return 0.0;
        }
        return (double) soma / quantidade;
    }

    public double mediaMotorista(String cpf) {
        int soma = 0;
        int quantidade = 0;

        for (Corrida corrida : corridas) {
            if (comparaStrings(corrida.getMotorista().getCpf(), cpf)) {
                int nota = corrida.getNotaMotorista();
                if (nota > 0) {
                    soma += nota;
                    quantidade++;
                }
            }
        }

        if (quantidade == 0) {
            return 0.0;
        }
        return (double) soma / quantidade;
    }
}
