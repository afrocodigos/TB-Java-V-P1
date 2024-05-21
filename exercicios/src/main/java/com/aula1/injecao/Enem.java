package main.java.com.aula1.injecao;

public class Enem {

    private final Prova prova;

    public Enem(Prova prova){
        this.prova = prova;
    }

    void iniciar(){
        this.prova.fazerProva();
    }
}
