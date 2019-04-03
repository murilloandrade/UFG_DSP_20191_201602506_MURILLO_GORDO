package br.com.murilloandrade.dsp20191.aulas0912.ap.Objetos;

public class DisciplinaObjeto {

    private ClassObjeto classe;

    public DisciplinaObjeto(ClassObjeto classe)
    {
        setClasses(classe);
    }

    public ClassObjeto getClasses() {
        return classe;
    }

    public void setClasses(ClassObjeto classes) {
        this.classe = classes;
    }
}