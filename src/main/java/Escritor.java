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

