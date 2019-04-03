package br.com.murilloandrade.dsp20191.aulas0912.ap.XML;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class EscritorXML {
    public void EscreverXML(String UrlLeitor, String UrlEscritor, String matricula) {
        try {
            Document document = DocumentHelper.createDocument();
            Element root = document.addElement( "class" );
            Element studentElement = root.addElement("student");
            File arquivo = new File(UrlLeitor);
            SAXReader leitor = new SAXReader();
            Document xml = leitor.read(arquivo);
            Node nodeStudent = xml.selectSingleNode("/class/student[matricula = '" + matricula + "']");

            studentElement.addElement("matricula")
                    .addText(nodeStudent.selectSingleNode("matricula").getText());

            studentElement.addElement("firstname")
                    .addText(nodeStudent.selectSingleNode("firstname").getText());

            studentElement.addElement("lastname")
                    .addText(nodeStudent.selectSingleNode("lastname").getText());

            studentElement.addElement("nickname")
                    .addText(nodeStudent.selectSingleNode("nickname").getText());

            Element frequenciaElement = studentElement.addElement("frequencia");
            //Node nodeFrequencia = nodeStudent.selectSingleNode("frequencia");
            List<Node> aulas = (nodeStudent.selectSingleNode("frequencia").selectNodes("aulas"));
            for(Node aula : aulas)
            {
                frequenciaElement.addElement("aulas")
                        .addAttribute("numero", aula.valueOf("@numero"))
                        .addText(aula.getText());
            }
            OutputFormat format = OutputFormat.createPrettyPrint();
            XMLWriter writer;
            FileOutputStream fos = new FileOutputStream(UrlEscritor);
            writer = new XMLWriter(fos,format);
            writer.write( document );
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}