package br.com.murilloandrade.dsp20191.aulas0508.as;

import java.io.*;

public class AlunoManager {
    public static void CriarAvaliacao(String urlArquivo) throws IOException
    {
        File file = new File(urlArquivo);
        file.createNewFile();
    }

    public static void EscreverAvaliacao(Aluno aluno, String nomeArquivo) throws IOException
    {
        FileOutputStream fos = new FileOutputStream(nomeArquivo);
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF(aluno.getNome());
        dos.writeLong(aluno.getMatricula());
        dos.writeDouble(aluno.getNota1());
        dos.writeDouble(aluno.getNota2());

        fos.close();
        dos.close();
    }

    public static void LerAvaliacao(String nomeArquivo) throws IOException
    {
        Aluno aluno = new Aluno();
        FileInputStream fis = new FileInputStream(nomeArquivo);
        DataInputStream dis = new DataInputStream(fis);


        aluno.setNome(dis.readUTF());
        aluno.setMatricula(dis.readLong());
        aluno.setNota1(dis.readDouble());
        aluno.setNota2(dis.readDouble());

        double media = (aluno.getNota1() + aluno.getNota2())/2;

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matricula: " + aluno.getMatricula());
        System.out.println("Nota 1: " + aluno.getNota1());
        System.out.println("Nota 2: " + aluno.getNota2());
        if (media>=5)
        {
            System.out.println("O aluno foi aprovado com a média " + media + ".");
        }
        else
        {
            System.out.println("O aluno foi reprovado com a média " + media + ".");
        }
    }
}
