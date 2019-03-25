package br.com.murilloandrade.dsp20191.aulas0508.ap;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ConexaoManager {
    public static void CriarArquivo(String urlArquivo) throws IOException
    {
        File file = new File(urlArquivo);
        file.createNewFile();
    }

    public static void EscreverProperties(String nomeArquivo) throws IOException
    {
        FileWriter writer = new FileWriter(nomeArquivo);
        PrintWriter pwriter = new PrintWriter(writer);
        pwriter.println("nome=Murillo Gordo de Andrade");
        pwriter.println("usuario=murillo.andrade");
        pwriter.println("senha=dsp20191");
        pwriter.println("sgbd=H2");
        pwriter.println("tipoConexao=memory");
        pwriter.println("bancoDados=dsp20191bd");
        pwriter.println("urlBd=localhost/dsp20191bd");
        pwriter.close();
        writer.close();
    }
}
