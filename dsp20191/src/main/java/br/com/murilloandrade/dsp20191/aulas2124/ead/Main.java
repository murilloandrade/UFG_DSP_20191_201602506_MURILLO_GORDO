package br.com.murilloandrade.dsp20191.aulas2124.ead;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Aluno> aluno = new ArrayList<>();

        aluno.add(new Aluno("Murillo Gordo de Andrade",
                            201602506,
                            "Desenvolvimento de software para persistência",
                            0.95,
                            9.9,
                            10));

        Serializador.gravarArquivoBinario(aluno, "src/main/resources/aluno.dat");

        ArrayList<Aluno> alunoSerializado = Serializador.lerArquivoBinario("src/main/resources/aluno.dat");

        Serializador.printarAlunoSerializado(alunoSerializado);
    }
}
