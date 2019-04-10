package br.com.murilloandrade.dsp20191.aulas0912.ap;

import br.com.murilloandrade.dsp20191.aulas0912.ap.JSON.LeitorJSON;
import br.com.murilloandrade.dsp20191.aulas0912.ap.XML.EditorXML;
import br.com.murilloandrade.dsp20191.aulas0912.ap.XML.EscritorXML;
import br.com.murilloandrade.dsp20191.aulas0912.ap.XML.LeitorXML;
import org.dom4j.DocumentException;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws DocumentException, IOException {
        String UrlXmlLeitor = "src/main/resources/students.xml";
        String UrlXmlEscritor = "src/main/resources/murillo.xml";
        String UrlJsonLeitor = "src/main/resources/students.json";
        String matriculaTeste = "201602506";

        //LeitorXML printer = new LeitorXML();
        //Remover o parâmetro matricula irá chamar um método que printa os dados de todos os alunos.
        //printer.LerXML(UrlXmlLeitor,matriculaTeste);

        //EscritorXML escritor = new EscritorXML();
        //escritor.EscreverXML(UrlXmlLeitor, UrlXmlEscritor, matriculaTeste);

        //EditorXML editor = new EditorXML();
        //editor.EditarXML(UrlXmlLeitor);

        LeitorJSON leitorJSON = new LeitorJSON();
        leitorJSON.LerJSON(UrlJsonLeitor);
    }
}
