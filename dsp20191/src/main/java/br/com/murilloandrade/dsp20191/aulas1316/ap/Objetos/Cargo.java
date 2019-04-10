package br.com.murilloandrade.dsp20191.aulas1316.ap.Objetos;

public class Cargo {
    private Long id;
    private String nome;
    private double salario;
    public Cargo(String nome, double salario, Long id)
    {
        setNome(nome);
        setSalario(salario);
        setId(id);
    }

    public Cargo()
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

    public double getSalario()
    {
        return salario;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }


}