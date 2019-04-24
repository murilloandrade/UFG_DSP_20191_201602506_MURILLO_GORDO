package br.com.murilloandrade.dsp20191.aulas2124.ead;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.atomic.DoubleAccumulator;

public class Serializador {

    public static void gravarArquivoBinario(ArrayList<Aluno> lista, String urlArq) {
        File arq = new File(urlArq);
        try {
            arq.delete();
            arq.createNewFile();

            ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arq));
            objOutput.writeObject(lista);
            objOutput.close();

        } catch(IOException erro) {
            System.out.printf("Erro: %s", erro.getMessage());
        }
    }

    public static ArrayList<Aluno> lerArquivoBinario(String urlArq) {
        ArrayList<Aluno> lista = new ArrayList();
        try {
            File arq = new File(urlArq);
            if (arq.exists()) {
                ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
                lista = (ArrayList<Aluno>)objInput.readObject();
                objInput.close();
            }
        } catch(IOException erro1) {
            System.out.printf("Erro: %s", erro1.getMessage());
        } catch(ClassNotFoundException erro2) {
            System.out.printf("Erro: %s", erro2.getMessage());
        }
        return(lista);
    }

    public static void printarAlunoSerializado(ArrayList<Aluno> lista)
    {
        for (int i = 0; i < lista.size(); i++) {
            String nome = lista.get(i).getNome();
            String matricula = Long.toString(lista.get(i).getMatricula());
            String disciplina = lista.get(i).getDisciplina();
            String frequencia = Double.toString(lista.get(i).getFrequencia());
            String nota1 = Double.toString(lista.get(i).getNota1());
            String nota2 = Double.toString(lista.get(i).getNota2());
            String resultado = lista.get(i).avaliarAluno(lista.get(i).getNota1(),lista.get(i).getNota2(),lista.get(i).getFrequencia());
            System.out.println("Nome: " + nome);
            System.out.println("Matricula: " + matricula);
            System.out.println("Disciplina: " + disciplina);
            System.out.println("Frequencia: " + frequencia);
            System.out.println("Nota 1: " + nota1);
            System.out.println("Nota 2: " + nota2);
            System.out.println("Resultado: " + resultado);
        }
    }
}