package br.com.murilloandrade.dsp20191.aulas1316.ap.Objetos.Instanciamento;

import br.com.murilloandrade.dsp20191.aulas1316.ap.Objetos.Cargo;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Objetos.Departamento;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Objetos.Funcionario;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Objetos.Lotacao;

import java.sql.Date;


public class InstanciaObjetos {
    public Cargo[] instanciarCargos() {
        Cargo[] cargos = new Cargo[3];
        cargos[0] = new Cargo("The World",8000,(long) 10);
        cargos[1] = new Cargo("Star Platinum",8001,(long) 11);
        cargos[2] = new Cargo("Hermit Purple",8002,(long) 12);
        return cargos;
    }

    public Funcionario[] instanciarFuncionarios(){
        Funcionario[] funcionarios = new Funcionario[10];
        funcionarios[0] = new Funcionario("Caesar",(long) 20160,(long) 20);
        funcionarios[1] = new Funcionario("Jonathan",(long) 20161,(long) 21);
        funcionarios[2] = new Funcionario("Joseph",(long) 20162,(long) 22);
        funcionarios[3] = new Funcionario("Jotaro",(long) 20163,(long) 23);
        funcionarios[4] = new Funcionario("Josuke",(long) 20164,(long) 24);
        funcionarios[5] = new Funcionario("Giorno",(long) 20165,(long) 25);
        funcionarios[6] = new Funcionario("Jolyne",(long) 20166,(long) 26);
        funcionarios[7] = new Funcionario("John",(long) 20167,(long) 27);
        funcionarios[8] = new Funcionario("Dio",(long) 20168,(long) 28);
        funcionarios[9] = new Funcionario("Smokey",(long) 20169,(long) 29);
        return funcionarios;
    }

    public Departamento[] instanciarDepartamentos()
    {
        Departamento[] departamentos = new Departamento[4];
        departamentos[0] = new Departamento((long) 30,"Phantom Blood");
        departamentos[1] = new Departamento((long) 31,"Battle Tendency");
        departamentos[2] = new Departamento((long) 32,"Stardust Crusaders");
        departamentos[3] = new Departamento((long) 33,"Diamond is Unbreakable");
        return departamentos;
    }

    public Lotacao[] instanciarLotacoes(Funcionario[] funcionarios,Departamento[] departamentos, Cargo[] cargos)
    {
        Lotacao[] lotacoes = new Lotacao[10];
        lotacoes[0] = new Lotacao((long) 40, new Date(1451008800), new Date(1482631200),cargos[0],departamentos[0],funcionarios[0]);
        lotacoes[1] = new Lotacao((long) 41, new Date(1230170400), new Date(1261706400),cargos[0],departamentos[0],funcionarios[1]);
        lotacoes[2] = new Lotacao((long) 42, new Date(1293242400), new Date(1324778400),cargos[0],departamentos[1],funcionarios[2]);
        lotacoes[3] = new Lotacao((long) 43, new Date(1356400800), new Date(1387936800),cargos[0],departamentos[1],funcionarios[3]);
        lotacoes[4] = new Lotacao((long) 44, new Date(1419472800), new Date(1482631200),cargos[1],departamentos[2],funcionarios[4]);
        lotacoes[5] = new Lotacao((long) 45, new Date(409633200), new Date(756784800),cargos[1],departamentos[2],funcionarios[5]);
        lotacoes[6] = new Lotacao((long) 46, new Date(914551200), new Date(946087200),cargos[1],departamentos[2],funcionarios[6]);
        lotacoes[7] = new Lotacao((long) 47, new Date(1009245600), new Date(1072317600),cargos[2],departamentos[3],funcionarios[7]);
        lotacoes[8] = new Lotacao((long) 48, new Date(1103940000), new Date(1135476000),cargos[2],departamentos[3],funcionarios[8]);
        lotacoes[9] = new Lotacao((long) 49, new Date(1198548000), new Date(1482631200),cargos[2],departamentos[3],funcionarios[9]);
        return lotacoes;
    }
}
