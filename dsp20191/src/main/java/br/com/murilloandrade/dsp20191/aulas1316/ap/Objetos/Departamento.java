package br.com.murilloandrade.dsp20191.aulas1316.ap.Objetos;

public class Departamento {
    private Long id;
    private String nome;
    public Departamento(Long id, String nome)
    {
        setNome(nome);
        setId(id);
    }

    public Departamento()
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

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }


}