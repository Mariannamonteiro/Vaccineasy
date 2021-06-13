
package com.usjt.projeto.vaccineasy.entidades;

public class Clinica {
    
    private int id;
    private String nome;
    private Endereco id_endereco;

    public Clinica() {
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

    public Endereco getEndereco() {
        return id_endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.id_endereco = endereco;
    }
    
    
}
