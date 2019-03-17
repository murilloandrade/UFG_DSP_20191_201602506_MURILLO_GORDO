package br.com.murilloandrade.dsp2019.aulas0104.ap;

import java.io.*;

public class Leitor {
    //Le os conteudos do arquivo especificado
    public static void LerArquivo(String nomeArquivo) throws IOException
    {
        String line;
        FileReader fileReader = new FileReader(nomeArquivo);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while((line = bufferedReader.readLine()) != null)
        {
            System.out.println(line);
        }
        fileReader.close();
        bufferedReader.close();
    }
}
