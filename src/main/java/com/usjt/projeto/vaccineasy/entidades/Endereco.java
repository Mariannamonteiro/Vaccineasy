
package com.usjt.projeto.vaccineasy.entidades;

public class Endereco {
    
    private int id;
    private String endereco;
    private String complemento;
   
    
    
    public Endereco() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    @Override
    public String toString() {
        return "Endereco{" + "id=" + id + ", endereco=" + endereco + ", complemento=" + complemento + '}';
    }

    
    
    
}
