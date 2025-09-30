package aulajava;

public class Pessoa {

    protected String nome;
    protected int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void aniversario() {
        idade++;
    }
}
