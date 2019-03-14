import java.io.*;

public class Leitor {
    //Le os conteudos do arquivo especificado
    public static String LerArquivo(String nomeArquivo) throws IOException
    {
        String line;
        String texto = "";
        FileReader fileReader = new FileReader(nomeArquivo);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while((line = bufferedReader.readLine()) != null)
        {
            texto = texto + line;
        }
        return texto;
    }
}
