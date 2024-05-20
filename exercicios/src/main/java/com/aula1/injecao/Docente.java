package main.java.com.aula1.injecao;

public class Docente {
    private String nome;

    public Docente() {
    }

    public Docente(String nome) {
        this.nome = nome;
    }

    public void fazerProva() {
        System.out.println("Docente " + nome + " criando prova.");
    }
}
