package br.com.murilloandrade.dsp20191.aulas1316.ap.Objetos;

public class Funcionario {
    private  Long id;
    private String nome;
    private Long matricula;
    public Funcionario (String nome, Long matricula, Long id)
    {
        setNome(nome);
        setMatricula(matricula);
        setId(id);
    }

    public Funcionario ()
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

    public Long getMatricula()
    {
        return matricula;
    }

    public void setMatricula(Long matricula)
    {
        this.matricula = matricula;
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