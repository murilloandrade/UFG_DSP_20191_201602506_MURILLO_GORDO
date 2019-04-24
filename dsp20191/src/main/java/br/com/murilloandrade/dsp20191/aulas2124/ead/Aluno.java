package br.com.murilloandrade.dsp20191.aulas2124.ead;

import java.io.Serializable;

public class Aluno implements Serializable {
    private String nome;
    private long matricula;
    private String disciplina;
    private double frequencia;
    private double nota1;
    private double nota2;

    public Aluno(String nome, long matricula, String disciplina, double frequencia, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplina = disciplina;
        this.frequencia = frequencia;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public String avaliarAluno(double n1, double n2, double freq)
    {
        double media = (n1+n2)/2;
        if (media>=6 && freq>=0.75) return "Aprovado";
        else if (media<6 && freq>=0.75) return  "Reprovado por média";
        else if (media>=6 && freq<0.75) return "Reprovado por falta";
        else if (media<6 && freq<0.75) return "Reprovado por média e por falta";
        else return "Não foi possível avaliar o aluno";
    }
}