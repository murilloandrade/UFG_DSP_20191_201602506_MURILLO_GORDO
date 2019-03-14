package br.com.murilloandrade.dsp2019.aulas0104.ap;

import java.io.*;

public class Escritor
{
    public static void Escrever(String texto, String nomeArquivo) throws IOException
    {
        //Grava o texto no arquivo especificado
        FileOutputStream fos = new FileOutputStream(nomeArquivo);
        fos.write(texto.getBytes());
        fos.close();
    }
}

