package main.java.com.aula1.injecao;

public class Docente  implements Prova{
    private String nome;

    public Docente() {
    }

    public Docente(String nome) {
        this.nome = nome;
    }

    @Override
    public void fazerProva() {
        System.out.println("Docente " + nome + " criando prova.");
    }
}
