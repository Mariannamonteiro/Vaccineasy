
package com.usjt.projeto.vaccineasy.dao;

import com.usjt.projeto.vaccineasy.bancodedados.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EnderecoDao {
    
    
    public int create(String endereco, String complemento){
        int addressId = 0;
        
        
        String sql = "INSERT INTO tb_endereco (endereco, complemento) VALUES (?,?);";
        
       String sqlRetornaId = "SELECT MAX(id_endereco) as id_endereco FROM tb_endereco";
        
        ConexaoDB conexao = new ConexaoDB();
        Connection conn = conexao.abreConexao();
        
        try{
            
            
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setString(1, endereco);
            pst.setString(2, complemento);
            
            pst.executeUpdate();
            
    
            
            PreparedStatement pstm = conn.prepareStatement(sqlRetornaId);   
            ResultSet rs =  pstm.executeQuery();
            
            if(rs.next()){
                addressId = rs.getInt("id_endereco");
            }


            
        }catch(SQLException e){
            e.printStackTrace();
        }
            
            
            
        
        
        return addressId;
    }
    
}
