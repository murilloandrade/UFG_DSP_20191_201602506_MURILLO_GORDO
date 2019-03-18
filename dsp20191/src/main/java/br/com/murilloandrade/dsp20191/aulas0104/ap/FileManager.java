package br.com.murilloandrade.dsp20191.aulas0104.ap;

import java.io.*;

public class FileManager {
    public static void CriarArquivo(String urlArquivo) throws IOException
    {
        File file = new File(urlArquivo);
        file.createNewFile();
    }

    public static void Escrever(String texto, String nomeArquivo) throws IOException
    {
        FileWriter writer = new FileWriter(nomeArquivo);
        PrintWriter pwriter = new PrintWriter(writer);
        pwriter.println(texto);
        pwriter.close();
        writer.close();
    }

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
