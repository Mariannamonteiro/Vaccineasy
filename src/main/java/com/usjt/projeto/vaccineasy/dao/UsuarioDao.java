package com.usjt.projeto.vaccineasy.dao;

import com.usjt.projeto.vaccineasy.GUI.TelaAdministrador;
import com.usjt.projeto.vaccineasy.GUI.TelaAtendente;
import com.usjt.projeto.vaccineasy.GUI.TelaPaciente;
import com.usjt.projeto.vaccineasy.bancodedados.ConexaoDB;
import com.usjt.projeto.vaccineasy.entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {

    public boolean validaLogin(String cpf, String senha) {

        boolean retorno = false;
        String sql = "SELECT cpf, senha, perfil_usuario, nome_usuario  FROM tb_usuario WHERE cpf = ? AND senha = ?";

        ConexaoDB conexao = new ConexaoDB();
        Connection conn = conexao.abreConexao();
        try {

            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, cpf);
            pst.setString(2, senha);

            ResultSet rs = pst.executeQuery();

            String perfilUser = "";
            String nomeUser = "";
            String cpfUser = "";

            while (rs.next()) {

                nomeUser = rs.getString("nome_usuario");
                perfilUser = rs.getString("perfil_usuario");
                cpfUser = rs.getString("cpf");
            }

            switch (perfilUser) {

                case "Administrador":
                    TelaAdministrador telaAdm = new TelaAdministrador(nomeUser);
                    telaAdm.setVisible(true);
                    retorno = true;
                    break;

                case "Atendente":
                    TelaAtendente telaAtendente = new TelaAtendente(nomeUser);
                    telaAtendente.setVisible(true);
                    retorno = true;
                    break;

                case "Paciente":
                    TelaPaciente telaPaciente = new TelaPaciente(nomeUser,cpfUser);  
                    telaPaciente.setVisible(true);
                    retorno = true;
                    break;

                default:

                    retorno = false;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();

        }

        return retorno;

    }

    public int create(String nome_usuario, String cpf, String senha, String perfil_usuario) {

        int userId = 0;

        String sql = "INSERT INTO tb_usuario (nome_usuario, cpf, senha, perfil_usuario) VALUES (?,?,?,?);";

        String sqlRetornaId = "SELECT MAX(id_usuario) as id_usuario FROM tb_usuario";

        ConexaoDB conexao = new ConexaoDB();
        Connection conn = conexao.abreConexao();

        try {

            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, nome_usuario);
            pst.setString(2, cpf);
            pst.setString(3, senha);
            pst.setString(4, perfil_usuario);

            pst.executeUpdate();

            // codigo select ultimo id 
            PreparedStatement pstm = conn.prepareStatement(sqlRetornaId);
            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                userId = rs.getInt("id_usuario");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return userId;
    }

    public boolean existe(String cpf) {

        boolean retorno = false;
        String sql = "SELECT * from tb_usuario WHERE cpf = ?";

        ConexaoDB conexao = new ConexaoDB();
        Connection con = conexao.abreConexao();

        try {

            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setString(1, cpf);

            ResultSet rs = pstm.executeQuery();

            if (rs.next() == true) {
                retorno = true;
            } else {
                retorno = false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return retorno;
    }

    public List<Usuario> buscarUsers() {

        List<Usuario> usuarioList = new ArrayList<Usuario>();
        ConexaoDB conexao = new ConexaoDB();
        Connection con = conexao.abreConexao();
        String sql = "SELECT id_usuario, nome_usuario, cpf, perfil_usuario FROM tb_usuario WHERE perfil_usuario = 'Administrador' OR perfil_usuario = 'Atendente'";

        try {

            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                Usuario user = new Usuario(rs);
                usuarioList.add(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return usuarioList;
    }

    public boolean deletarUser(int id, String perfilUser, String cpf) {

        boolean retorno = false;

        ConexaoDB conexao = new ConexaoDB();
        Connection conn = conexao.abreConexao();
        try {

            if (perfilUser.equals("Administrador")) {

                String sqlUsuario = "DELETE  FROM tb_usuario WHERE id_usuario = ? ";
                String sqlAdm = "DELETE  FROM tb_administrador WHERE cpf = ?";

                //excluir adm 
                PreparedStatement pstm = conn.prepareStatement(sqlAdm);
                pstm.setString(1, cpf);
                int resposta = pstm.executeUpdate();

                //excluir usuario
                PreparedStatement pst = conn.prepareStatement(sqlUsuario);

                pst.setInt(1, id);
                pst.executeUpdate();

                if (resposta > 0) {
                    retorno = true;
                } else {
                    retorno = false;
                }

            } else {

                String sqlUsuario = "DELETE  FROM tb_usuario WHERE id_usuario = ? ";
                String sqlAtendente = "DELETE  FROM tb_atendente WHERE cpf  = ?";

                //excluir atendente
                PreparedStatement pstm = conn.prepareStatement(sqlAtendente);
                pstm.setString(1, cpf);
                int resposta = pstm.executeUpdate();

                //excluir usuario
                PreparedStatement pst = conn.prepareStatement(sqlUsuario);

                pst.setInt(1, id);
                pst.executeUpdate();

                if (resposta > 0) {
                    retorno = true;
                } else {
                    retorno = false;
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return retorno;
    }


}
