package br.com.murilloandrade.dsp20191.aulas0508.ap;

public class Conexao {
    private String sgbd;
    private String tipoConexao;
    private String bancoDados;
    private String urlBd;
    private String sistemaOperacional;

    public Conexao(String sgbd, String tipoConexao, String bancoDados, String urlBd, String sistemaOperacional)
    {
        setSgbd(sgbd);
        setTipoConexao(tipoConexao);
        setBancoDados(bancoDados);
        setUrlBd(urlBd);
        setSistemaOperacional(sistemaOperacional);
    }

    public Conexao(String sgbd, String tipoConexao, String bancoDados, String urlBd)
    {
        setSgbd(sgbd);
        setTipoConexao(tipoConexao);
        setBancoDados(bancoDados);
        setUrlBd(urlBd);
    }

    public Conexao()
    {
    }

    public void setSgbd(String sgbd) {
        this.sgbd = sgbd;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public void setBancoDados(String bancoDados) {
        this.bancoDados = bancoDados;
    }

    public void setUrlBd(String urlBd) {
        this.urlBd = urlBd;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getSgbd() {
        return sgbd;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public String getBancoDados() {
        return bancoDados;
    }

    public String getUrlBd() {
        return urlBd;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }
}
