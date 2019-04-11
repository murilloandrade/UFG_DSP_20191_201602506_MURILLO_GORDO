package br.com.murilloandrade.dsp20191.aulas1316.ap.Objetos;

import java.sql.Date;

public class Lotacao {
    public Long id;
    public Date dataInicial;
    public Date dataFinal;
    public Cargo cargo;
    public Departamento departamento;
    public Funcionario funcionario;

    public Lotacao(Long id, Date dataInicial, Date dataFinal, Cargo cargo, Departamento departamento, Funcionario funcionario) {
        this.id = id;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.cargo = cargo;
        this.departamento = departamento;
        this.funcionario = funcionario;
    }

    public Lotacao() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Funcionario getFuncionario() { return funcionario; }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
