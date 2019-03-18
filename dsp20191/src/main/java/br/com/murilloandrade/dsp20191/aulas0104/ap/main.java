package br.com.murilloandrade.dsp20191.aulas0104.ap;

import java.io.IOException;

/**
 * Created by Alunoinf_2 on 13/03/2019.
 */
public class main {
    public static void main(String[] args) throws IOException {
        String URL = "src/main/resources/text.txt";
        FileManager.CriarArquivo(URL);
        FileManager.Escrever("Your P :(",URL);
        FileManager.LerArquivo(URL);
    }
}
