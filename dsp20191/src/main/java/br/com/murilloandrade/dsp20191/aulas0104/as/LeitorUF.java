package br.com.murilloandrade.dsp20191.aulas0104.as;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.io.*;

public class LeitorUF {
    public static List<UnidadeFederacao> ConverterCSVParaLista(String nomeArquivo) throws IOException
    {
        List<UnidadeFederacao> ufs = new ArrayList<UnidadeFederacao>();
        String line;
        FileReader fileReader = new FileReader(nomeArquivo);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while((line = bufferedReader.readLine()) != null)
        {
            UnidadeFederacao uf = new UnidadeFederacao();
            uf.dadosUF = line;
            ufs.add(uf);
        }
        fileReader.close();
        bufferedReader.close();

        return ufs;
    }

    public static void LerLista(List<UnidadeFederacao> ufs)
    {
        for(int i=0; i< ufs.size(); i++){
            System.out.println(ufs.get(i).dadosUF);
        }
    }
}
