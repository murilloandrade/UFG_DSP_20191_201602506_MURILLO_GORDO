package br.com.murilloandrade.dsp20191.aulas0508.ap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestaConexao {

    public static void LerEGravarProperties(Usuario usuario, Conexao conexao, String nomeArquivo) throws IOException {
        final String OS = System.getProperty("os.name").toLowerCase();
        String[] array;
        String line;
        FileReader fileReader = new FileReader(nomeArquivo);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        if((line = bufferedReader.readLine()) != null)
        {
            array = line.split("=");
            usuario.setNome(array[1]);
        }

        if((line = bufferedReader.readLine()) != null)
        {
            array = line.split("=");
            usuario.setLogin(array[1]);
        }

        if((line = bufferedReader.readLine()) != null)
        {
            array = line.split("=");
            usuario.setSenha(array[1]);
        }

        if((line = bufferedReader.readLine()) != null)
        {
            array = line.split("=");
            conexao.setSgbd(array[1]);
        }

        if((line = bufferedReader.readLine()) != null) {
            array = line.split("=");
            conexao.setTipoConexao(array[1]);
        }

        if((line = bufferedReader.readLine()) != null)
        {
            array = line.split("=");
            conexao.setBancoDados(array[1]);
        }

        if((line = bufferedReader.readLine()) != null)
        {
            array = line.split("=");
            conexao.setUrlBd(array[1]);
        }

        conexao.setSistemaOperacional(OS);
        fileReader.close();
        bufferedReader.close();
    }

    public static void PrintarProperties(Usuario usuario, Conexao conexao)
    {
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Usario: " + usuario.getLogin());
        System.out.println("Senha: " + usuario.getSenha());
        System.out.println("SGBD: " + conexao.getSgbd());
        System.out.println("TipoConexao: " + conexao.getTipoConexao());
        System.out.println("BancoDados: " + conexao.getBancoDados());
        System.out.println("UrlBD: " + conexao.getUrlBd());
        System.out.println("SistemaOperacional: " + conexao.getSistemaOperacional());
    }

    public static void main(String[] args) throws IOException {
        String URL = "src/main/resources/conexao.properties";
        Conexao conexao = new Conexao();
        Usuario usuario = new Usuario();

        ConexaoManager.CriarArquivo(URL);
        ConexaoManager.EscreverProperties(URL);
        LerEGravarProperties(usuario, conexao, URL);
        PrintarProperties(usuario, conexao);
    }
}
