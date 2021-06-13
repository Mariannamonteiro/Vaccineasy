
package com.usjt.projeto.vaccineasy.dao;

import com.usjt.projeto.vaccineasy.bancodedados.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdministradorDao {
    
     public String create(int id_usuario, String nome, String cpf)throws SQLException {
        
        String resp = "";
        String sql = "INSERT INTO tb_administrador(id_usuario, nome, cpf) VALUES(?,?,?)";
   
        ConexaoDB conexao = new ConexaoDB();
        Connection conn = conexao.abreConexao();
        try  {

            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setInt(1,id_usuario );
            pst.setString(2, nome);
            pst.setString(3, cpf);
           
            
            
            int retorno = pst.executeUpdate();
            
            if(retorno > 0) {
                 resp = "Administrador " + nome + " inserido com sucesso!";
            }else{
                resp = "Falha na inserção";
            }
            
//            conn.commit();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            conn.rollback();
        }
        
        return resp;
        
    }
     
     
     
     public String update( int id_usuario, int id_administrador, String nome) throws SQLException { 
     
          String resp = "";     
          String sql = "UPDATE tb_administrador SET id_usuario = ?, nome = ?, id_administrador ";
      
          ConexaoDB conexao = new ConexaoDB();
          Connection conn = conexao.abreConexao();
          try {
          PreparedStatement pst = conn.prepareStatement(sql);
          pst.setInt(1, id_usuario);
          pst.setString( 2, nome);
          pst.setInt(3, id_administrador);
          }catch (Exception e){
          e.printStackTrace();
          conn.rollback();
     } 
          return null;
     }
     
     
    public String delete (int id_administrador)throws SQLException {     
    String resp = "";
    String sql = "DELETE FROM tb_administrador WHERE id_administrador = ?";
    ConexaoDB conexao = new ConexaoDB();
    Connection conn = conexao.abreConexao();
    try{ 
           PreparedStatement pst = conn.prepareStatement (sql);
           pst.setInt (1, id_administrador);
           pst.execute();
     }
       catch (SQLException ex){
           ex.printStackTrace();
           conn.rollback();  
       }
           return null;
    }
}
     
     
     
    

