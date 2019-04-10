package br.com.murilloandrade.dsp20191.aulas1316.ap;

import br.com.murilloandrade.dsp20191.aulas1316.ap.Objetos.Cargo;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Objetos.Departamento;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Objetos.Funcionario;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Objetos.Instanciamento.InstanciaObjetos;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Objetos.Lotacao;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.base.CriaConexao;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.ddl.alteracao.AdicionaFKTabelaLotacoes;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.ddl.criacao.TableCargosCreate;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.ddl.criacao.TableDepartamentosCreate;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.ddl.criacao.TableFuncionariosCreate;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.ddl.criacao.TableLotacoesCreate;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.dml.insert.PersisteCargo;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.dml.insert.PersisteDepartamento;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.dml.insert.PersisteFuncionario;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.dml.insert.PersisteLotacao;

public class main {
    public static void main (String[] args) throws Exception {
        CriaConexao conn = new CriaConexao();
        conn.getConnection("file");
        InstanciaObjetos iob = new InstanciaObjetos();
        //Funcionario[] funcionarios = iob.instanciarFuncionarios();
        //Cargo[] cargos = iob.instanciarCargos();
        //Departamento[] departamentos = iob.instanciarDepartamentos();

        TableCargosCreate cargosCreate = new TableCargosCreate();
        cargosCreate.criaTabela();

        TableFuncionariosCreate funcionariosCreate = new TableFuncionariosCreate();
        funcionariosCreate.criaTabela();

        TableDepartamentosCreate departamentosCreate = new TableDepartamentosCreate();
        departamentosCreate.criaTabela();

        TableLotacoesCreate lotacoesCreate = new TableLotacoesCreate();
        lotacoesCreate.criaTabela();

        AdicionaFKTabelaLotacoes adicionaFKTabelaLotacoes = new AdicionaFKTabelaLotacoes();
        adicionaFKTabelaLotacoes.alteraTabela();

//        PersisteFuncionario pf = new PersisteFuncionario();
//        pf.persisteFuncionario(funcionarios[0]);
//        pf.persisteFuncionario(funcionarios[1]);
//        pf.persisteFuncionario(funcionarios[2]);
//        pf.persisteFuncionario(funcionarios[3]);
//        pf.persisteFuncionario(funcionarios[4]);
//        pf.persisteFuncionario(funcionarios[5]);
//        pf.persisteFuncionario(funcionarios[6]);
//        pf.persisteFuncionario(funcionarios[7]);
//        pf.persisteFuncionario(funcionarios[8]);
//        pf.persisteFuncionario(funcionarios[9]);
//
//        PersisteDepartamento pd = new PersisteDepartamento();
//        pd.persisteDepartamento(departamentos[0]);
//        pd.persisteDepartamento(departamentos[1]);
//        pd.persisteDepartamento(departamentos[2]);
//        pd.persisteDepartamento(departamentos[3]);
//
//        PersisteCargo pc = new PersisteCargo();
//        pc.persisteCargo(cargos[0]);
//        pc.persisteCargo(cargos[1]);
//        pc.persisteCargo(cargos[2]);
//
//        PersisteLotacao pl = new PersisteLotacao();

    }
}
