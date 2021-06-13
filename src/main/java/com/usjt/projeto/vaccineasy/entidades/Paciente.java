package com.usjt.projeto.vaccineasy.entidades;

import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Comparator;

public class Paciente implements Comparable<Paciente> {

    private int id;
    private String nome;
    private String cpf;
    private Usuario id_usuario;
    private int idade;
    private String telefone;
    private Endereco id_endereco;
    private Date dt_vacinacao;
    private boolean profissao_saude;
    private boolean vacinado;

    public Paciente() {
    }

    public Paciente(int id, String nome, String cpf, Usuario id_usuario, int idade, String telefone, Endereco id_endereco, Date dt_vacinacao, boolean profissao_saude, boolean vacinado) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.id_usuario = id_usuario;
        this.idade = idade;
        this.telefone = telefone;
        this.id_endereco = id_endereco;
        this.dt_vacinacao = dt_vacinacao;
        this.profissao_saude = profissao_saude;
        this.vacinado = vacinado;
    }

    public Paciente(String nome, String cpf, int idade, boolean profissao_saude) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.profissao_saude = profissao_saude;
    }

    public Paciente(ResultSet rs) throws SQLException {
        
        this.id = rs.getInt("id_paciente");
        this.nome = rs.getString("nome");
        this.cpf = rs.getString("cpf");
        this.idade = rs.getInt("idade");
        this.profissao_saude = rs.getBoolean("profissao_saude");
        this.dt_vacinacao = rs.getDate("dt_vacinacao");

    }
    
  

    public Paciente(String nome, int idade, Date dt_vacinacao, boolean profissao_saude) {
        this.nome = nome;
        this.idade = idade;
        this.dt_vacinacao = dt_vacinacao;
        this.profissao_saude = profissao_saude;
    }

   
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Usuario getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Usuario id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(Endereco id_endereco) {
        this.id_endereco = id_endereco;
    }

    public Date getDt_vacinacao() {
        return dt_vacinacao;
    }

    public void setDt_vacinacao(Date dt_vacinacao) {
        this.dt_vacinacao = dt_vacinacao;
    }

    public boolean isProfissao_saude() {
        return profissao_saude;
    }

    public void setProfissao_saude(boolean profissao_saude) {
        this.profissao_saude = profissao_saude;
    }

    public boolean isVacinado() {
        return vacinado;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }

    @Override
    public String toString() {
        return "Paciente{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", id_usuario=" + id_usuario + ", idade=" + idade + ", telefone=" + telefone + ", id_endereco=" + id_endereco + ", dt_vacinacao=" + dt_vacinacao + ", profissao_saude=" + profissao_saude + ", vacinado=" + vacinado + '}';
    }


    
    @Override
    public int compareTo(Paciente o){
    return Comparator.comparingInt(Paciente::getIdade)
              .thenComparing(Paciente::isProfissao_saude)
              .compare(this, o);
    }
    
    
    
    

}
