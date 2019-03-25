package br.com.murilloandrade.dsp20191.aulas0508.as;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        String URL = "src/main/resources/avaliacao.dat";
        Aluno aluno = new Aluno("Murillo Gordo",201602506,6.5,9.85);
        AlunoManager.CriarAvaliacao(URL);
        AlunoManager.EscreverAvaliacao(aluno, URL);
        AlunoManager.LerAvaliacao(URL);
    }
}
