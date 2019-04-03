package br.com.murilloandrade.dsp20191.aulas0912.ap.Objetos;

import java.util.List;

public class ClassObjeto {
    public List<StudentObjeto> student;

    public ClassObjeto(List<StudentObjeto> student)
    {
        setStudent(student);
    }

    public void setStudent(List<StudentObjeto> student) {
        this.student = student;
    }

    public List<StudentObjeto> getStudent()
    {
        return student;
    }

}