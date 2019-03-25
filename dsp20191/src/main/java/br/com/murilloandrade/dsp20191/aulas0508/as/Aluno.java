package br.com.murilloandrade.dsp20191.aulas0508.as;

public class Aluno {
    private String nome;
    private long matricula;
    private double nota1;
    private double nota2;

    public Aluno (String nome, long matricula, double nota1, double nota2)
    {
        setNome(nome);
        setMatricula(matricula);
        setNota1(nota1);
        setNota2(nota2);
    }

    public Aluno ()
    {
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }


    public void setMatricula(long matricula)
    {
        this.matricula = matricula;
    }

    public double getNota1()
    {
        return nota1;
    }

    public void setNota1(double nota1)
    {
        this.nota1 = nota1;
    }

    public double getNota2()
    {
        return nota2;
    }

    public void setNota2(double nota2)
    {
        this.nota2 = nota2;
    }

    public long getMatricula()
    {
        return matricula;
    }
}