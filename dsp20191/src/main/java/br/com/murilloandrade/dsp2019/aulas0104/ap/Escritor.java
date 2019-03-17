package br.com.murilloandrade.dsp2019.aulas0104.ap;

import java.io.*;

public class Escritor
{
    public static void Escrever(String texto, String nomeArquivo) throws IOException
    {
        FileWriter writer = new FileWriter(nomeArquivo);
        PrintWriter pwriter = new PrintWriter(writer);
        pwriter.println(texto);
        pwriter.close();
        writer.close();
    }
}

