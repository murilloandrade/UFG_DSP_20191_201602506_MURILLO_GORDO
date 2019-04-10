package br.com.murilloandrade.dsp20191.aulas1316.ap.Objetos.Instanciamento;

import br.com.murilloandrade.dsp20191.aulas1316.ap.Objetos.Cargo;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Objetos.Departamento;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Objetos.Funcionario;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Objetos.Lotacao;

import java.sql.Date;


public class InstanciaObjetos {
    public Cargo[] instanciarCargos() {
        Cargo[] cargos = new Cargo[3];
        cargos[0].setNome("Vendedor");
        cargos[0].setId((long) 10);
        cargos[0].setSalario(2000);

        cargos[1].setNome("Analista");
        cargos[1].setId((long) 11);
        cargos[1].setSalario(1500);

        cargos[2].setNome("Desenvolvedor");
        cargos[2].setId((long) 12);
        cargos[2].setSalario(2500);
        return cargos;
    }

    public Funcionario[] instanciarFuncionarios(){
        Funcionario[] funcionarios = new Funcionario[10];
        funcionarios[1].setId((long) 20);
        funcionarios[1].setNome("Rafael");
        funcionarios[1].setMatricula((long) 20160);

        funcionarios[1].setId((long) 21);
        funcionarios[1].setNome("Marcos");
        funcionarios[1].setMatricula((long) 20161);

        funcionarios[2].setId((long) 22);
        funcionarios[2].setNome("Caio");
        funcionarios[2].setMatricula((long) 20162);

        funcionarios[3].setId((long) 23);
        funcionarios[3].setNome("Christian");
        funcionarios[3].setMatricula((long) 20163);

        funcionarios[4].setId((long) 24);
        funcionarios[4].setNome("Maria");
        funcionarios[4].setMatricula((long) 20164);

        funcionarios[5].setId((long) 25);
        funcionarios[5].setNome("Paula");
        funcionarios[5].setMatricula((long) 20165);

        funcionarios[6].setId((long) 26);
        funcionarios[6].setNome("Victoria");
        funcionarios[6].setMatricula((long) 20166);

        funcionarios[7].setId((long) 27);
        funcionarios[7].setNome("Thais");
        funcionarios[7].setMatricula((long) 20167);

        funcionarios[8].setId((long) 28);
        funcionarios[8].setNome("Ana");
        funcionarios[8].setMatricula((long) 20168);

        funcionarios[9].setId((long) 29);
        funcionarios[9].setNome("Dandara");
        funcionarios[9].setMatricula((long) 20169);
        return funcionarios;
    }

    public Departamento[] instanciarDepartamentos()
    {
        Departamento[] departamentos = new Departamento[4];
        departamentos[0].setId((long) 30);
        departamentos[0].setNome("Departamento Norte");

        departamentos[0].setId((long) 31);
        departamentos[0].setNome("Departamento Sul");

        departamentos[0].setId((long) 32);
        departamentos[0].setNome("Departamento Leste");

        departamentos[0].setId((long) 33);
        departamentos[0].setNome("Departamento Oeste");
        return departamentos;
    }
}
