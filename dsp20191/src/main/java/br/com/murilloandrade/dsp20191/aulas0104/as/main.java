package br.com.murilloandrade.dsp20191.aulas0104.as;

import br.com.murilloandrade.dsp20191.aulas0104.ap.FileManager;

import java.io.IOException;

/**
 * Created by Alunoinf_2 on 13/03/2019.
 */
public class main {
    public static void main(String[] args) throws IOException {

        //Parte 1 da atividade supervisionada
        String URL = "src/main/resources/text.txt";
        FileManager.CriarArquivo(URL);
        FileManager.Escrever("Man can never be hot (never hot), perspiration ting (spray dat)\n" +
                "Lynx Effect (come on), you didn't hear me did you? (nah)\n" +
                "Use roll-on (use that), or spray\n" +
                "But either way, A-B-C-D (alphabet ting)\n" +
                "The ting goes skrrrahh, pap, pap, ka-ka-ka\n" +
                "Skidiki-pap-pap, and a pu-pu-pudrrrr-boom\n" +
                "Skya, du-du-ku-ku-dun-dun\n" +
                "Poom, poom",URL);
        FileManager.LerArquivo(URL);

        //Parte 2 da atividade supervisionada
        String URLCSV = "src/main/resources/UF.csv";
        LeitorUF.LerLista(LeitorUF.ConverterCSVParaLista(URLCSV));
    }
}
