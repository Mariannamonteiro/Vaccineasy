
package com.usjt.projeto.vaccineasy.entidades;

import java.sql.ResultSet;

public class Usuario {
    
    private int id;
    private String cpf;
    private String nome_usuario;
    private String senha;
    private String perfilUser;

    public Usuario() {
    }
    
    public Usuario(ResultSet rs){
        try{
            
            this.id = rs.getInt("id_usuario");
            this.nome_usuario = rs.getString("nome_usuario");
            this.cpf = rs.getString("cpf");
            this.perfilUser = rs.getString("perfil_usuario");
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

  
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfilUser() {
        return perfilUser;
    }

    public void setPerfilUser(String perfilUser) {
        this.perfilUser = perfilUser;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", cpf=" + cpf + ", nome_usuario=" + nome_usuario + ", perfilUser=" + perfilUser + '}';
    }

 
    
    

   
    
    
    
    
    
    
}
