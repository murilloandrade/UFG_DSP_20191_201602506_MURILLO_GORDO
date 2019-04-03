package br.com.murilloandrade.dsp20191.aulas0912.ap.Objetos;

import java.util.List;

public class FrequenciaObjeto {

    private List<AulasObjeto> aulas;

    public FrequenciaObjeto(List<AulasObjeto> aulas)
    {
        setAulas(aulas);
    }

    public List<AulasObjeto> getAulas() {
        return this.aulas;
    }

    public void setAulas(List<AulasObjeto> aulas) {
        this.aulas = aulas;
    }
}