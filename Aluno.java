package aulajava;

public class Aluno extends Pessoa {
    private int matricula;
    private double nota1, nota2, nota3, media;

    public void calcularMedia(){
        media=(nota1+nota2+nota3)/3;
    }
}
