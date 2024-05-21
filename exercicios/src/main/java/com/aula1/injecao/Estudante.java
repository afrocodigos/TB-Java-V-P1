package main.java.com.aula1.injecao;

public class Estudante implements Prova{
    private String nome;

    public Estudante() {
    }

    public Estudante(String nome) {
        this.nome = nome;
    }

    @Override
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
