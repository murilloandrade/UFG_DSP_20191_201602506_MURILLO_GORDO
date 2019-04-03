package br.com.murilloandrade.dsp20191.aulas0912.ap.XML;

import org.dom4j.*;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class LeitorXML {
    //Printa todos os dados
    public void LerXML(String URL) throws DocumentException {
        File arquivo = new File(URL);
        SAXReader leitor = new SAXReader();
        Document xml = leitor.read(arquivo);

        List<Node> nodes = xml.selectNodes("/class/student" );
        for (Node node : nodes)
        {
            System.out.println("Matricula: "
                    + node.selectSingleNode("matricula").getText());
            System.out.println("Nome: "
                    + node.selectSingleNode("firstname").getText());
            System.out.println("Sobrenome: "
                    + node.selectSingleNode("lastname").getText());
            System.out.println("Usuário: "
                    + node.selectSingleNode("nickname").getText());
            List<Node> listaFrequencia = node.selectSingleNode("frequencia").selectNodes("aulas");
            for (Node aula : listaFrequencia)
            {
                System.out.println("Frequencia das Aulas "+ aula.valueOf("@numero")+ ": "
                        + aula.getText());
            }
            System.out.println();
        }
    }

    //Printa os dados de uma determinada matrícula
    public void LerXML(String URL, String matricula) throws DocumentException {
        File arquivo = new File(URL);
        SAXReader leitor = new SAXReader();
        Document xml = leitor.read(arquivo);

        List<Node> nodes = xml.selectNodes("/class/student[matricula = '" + matricula + "']");
        for (Node node : nodes) {
            System.out.println("Matricula: "
                    + node.selectSingleNode("matricula").getText());
            System.out.println("Nome: "
                    + node.selectSingleNode("firstname").getText());
            System.out.println("Sobrenome: "
                    + node.selectSingleNode("lastname").getText());
            System.out.println("Usuário: "
                    + node.selectSingleNode("nickname").getText());
            List<Node> listaFrequencia = node.selectSingleNode("frequencia").selectNodes("aulas");
            for (Node aula : listaFrequencia) {
                System.out.println("Frequencia das Aulas " + aula.valueOf("@numero") + ": "
                        + aula.getText());
            }
            System.out.println();
        }
    }
}
