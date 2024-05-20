package main.java.com.aula1.injecao;

public class Estudante {
    private String nome;

    public Estudante() {
    }

    public Estudante(String nome) {
        this.nome = nome;
    }

    public void fazerProva() {

        System.out.println("Estudante " + nome + " fazendo prova.");
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
