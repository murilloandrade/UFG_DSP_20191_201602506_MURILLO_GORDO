package br.com.murilloandrade.dsp20191.aulas0912.ap.XML;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.*;

public class EditorXML {

    public void EditarXML(String URL) {
        try {
            File inputFile = new File(URL);
            SAXReader reader = new SAXReader();
            Document document = reader.read( inputFile );

            Node node = document.selectSingleNode("/class/student[matricula = '201602506']");

            List<Node> aulas = node.selectSingleNode("frequencia").selectNodes("aulas");
            for (Node aula : aulas)
            {
                if (aula.valueOf("@numero").equals("0104"))
                {
                    aula.setText("F");
                }
            }

            // Pretty print the document to System.out
            OutputFormat format = OutputFormat.createPrettyPrint();
            XMLWriter writer;
            FileOutputStream fos = new FileOutputStream(URL);
            writer = new XMLWriter(fos,format);
            writer.write( document );
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}