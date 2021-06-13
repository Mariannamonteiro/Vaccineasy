
package com.usjt.projeto.vaccineasy.dao;

import com.usjt.projeto.vaccineasy.bancodedados.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AtendenteDao {
    
     public String create(int id_usuario, String nome,String cpf)throws SQLException {
        
        String resp = "";
        String sql = "INSERT INTO tb_atendente(id_usuario, nome, cpf) VALUES(?,?,?)";
   
        ConexaoDB conexao = new ConexaoDB();
        Connection conn = conexao.abreConexao();
        try  {

            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setInt(1,id_usuario );
            pst.setString(2, nome);
            pst.setString(3, cpf);
           
            
            
            int retorno = pst.executeUpdate();
            
            if(retorno > 0) {
                 resp = "Atendente " + nome + " inserido com sucesso!";
            }else{
                resp = "Falha na inserção";
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            conn.rollback();
        }
        
        return resp;
        
    }
    
}
