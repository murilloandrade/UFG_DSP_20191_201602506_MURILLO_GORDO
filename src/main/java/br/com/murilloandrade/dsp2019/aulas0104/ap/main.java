package br.com.murilloandrade.dsp2019.aulas0104.ap;

import java.io.IOException;

/**
 * Created by Alunoinf_2 on 13/03/2019.
 */
public class main {
    public static void main(String[] args) throws IOException {
        String URL = "src/br.com.murilloandrade.dsp2019.aulas0104.ap.main/resources/text.txt";
        Criador.CriarArquivo(URL);
        Escritor.Escrever(":( Your P",URL);
        System.out.println(Leitor.LerArquivo(URL));
    }
}
