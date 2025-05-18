package br.edu.insper.desagil.aps3.unter;

public abstract class Usuario2 {
    private String cpf;
    private String nome;

    public Usuario2(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void avalia(Corrida2 corrida, int nota); // implementação desse método -> subclasses
}
