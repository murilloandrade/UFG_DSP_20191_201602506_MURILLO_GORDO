package br.com.murilloandrade.dsp20191.aulas0912.ap.JSON;


import br.com.murilloandrade.dsp20191.aulas0912.ap.Objetos.ClassObjeto;
import br.com.murilloandrade.dsp20191.aulas0912.ap.Objetos.DisciplinaObjeto;
import br.com.murilloandrade.dsp20191.aulas0912.ap.Objetos.StudentObjeto;
import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.*;

import java.io.*;

public class LeitorJSON {

    public void LerJSON(String URL) throws IOException {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        builder.setPrettyPrinting();
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(URL));

        DisciplinaObjeto disciplinaObjeto = gson.fromJson(bufferedReader, DisciplinaObjeto.class);

        System.out.println(disciplinaObjeto);

    }
}