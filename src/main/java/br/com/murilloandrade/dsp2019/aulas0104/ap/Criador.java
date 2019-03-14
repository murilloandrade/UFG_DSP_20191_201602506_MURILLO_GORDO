package br.com.murilloandrade.dsp2019.aulas0104.ap;

import java.io.File;
import java.io.IOException;

public class Criador {
    public static void CriarArquivo(String urlArquivo) throws IOException
    {
        File file = new File(urlArquivo);
        file.createNewFile();
    }
}
