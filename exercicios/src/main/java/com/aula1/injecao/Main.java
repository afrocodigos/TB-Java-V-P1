package main.java.com.aula1.injecao;

public class Main {
    public static void main(String[] arg){

        Estudante estudante = new Estudante("Hugo");
        Docente docente = new Docente("Analu");

        Enem enemEstudante = new Enem(estudante);
        Enem enemDocente = new Enem(docente);

        enemEstudante.iniciar();
        enemDocente.iniciar();
    }
}
