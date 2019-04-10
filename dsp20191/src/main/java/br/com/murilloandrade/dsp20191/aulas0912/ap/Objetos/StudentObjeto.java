package br.com.murilloandrade.dsp20191.aulas0912.ap.Objetos;

import java.util.List;

public class StudentObjeto {
    public String matricula;
    public String firstname;
    public String lastname;
    public String nickname;
    public FrequenciaObjeto frequencia;

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setFrequencia(FrequenciaObjeto frequencia) {
        this.frequencia = frequencia;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public FrequenciaObjeto getFrequencia() {
        return frequencia;
    }
}
