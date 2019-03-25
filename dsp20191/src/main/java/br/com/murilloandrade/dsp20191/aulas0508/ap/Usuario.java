package br.com.murilloandrade.dsp20191.aulas0508.ap;

public class Usuario {
    private String nome;
    private String login;
    private String senha;

    public Usuario(String nome, String login, String senha)
    {
        setNome(nome);
        setLogin(login);
        setSenha(senha);
    }

    public Usuario()
    {
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setLogin(String nome)
    {
        this.login = nome;
    }

    public void setSenha(String nome)
    {
        this.senha = nome;
    }

    public String getNome()
    {
        return nome;
    }

    public String getLogin()
    {
        return login;
    }

    public String getSenha()
    {
        return senha;
    }
}
