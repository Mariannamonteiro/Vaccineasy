
package com.usjt.projeto.vaccineasy.entidades;

import java.sql.Date;


public class Vacina {
    
    private int id;
    private Paciente id_paciente;
    private Clinica clinica;
    private Date data_vacinacao;
    private Atendente id_atendente;

    public Vacina() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Paciente getIdPaciente() {
        return id_paciente;
    }

    public void setIdPaciente(Paciente idPaciente) {
        this.id_paciente = idPaciente;
    }

    public Clinica getClinica() {
        return clinica;
    }

    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }

    public Date getDataVacinacao() {
        return data_vacinacao;
    }

    public void setDataVacinacao(Date dataVacinacao) {
        this.data_vacinacao = dataVacinacao;
    }

    public Atendente getIdAtendente() {
        return id_atendente;
    }

    public void setIdAtendente(Atendente idAtendente) {
        this.id_atendente = idAtendente;
    }

   
    
    
    
    
}
