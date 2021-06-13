package com.usjt.projeto.vaccineasy.dao;

import com.usjt.projeto.vaccineasy.bancodedados.ConexaoDB;
import com.usjt.projeto.vaccineasy.entidades.Paciente;
import com.usjt.projeto.vaccineasy.uteis.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PacienteDao {

    public String create(int id_usuario, String nome, String cpf, int idade, String telefone, int id_endereco, boolean profissao_saude) throws SQLException {

        String resp = "";
        String sql = "INSERT INTO tb_paciente(id_usuario, nome,cpf,idade,telefone,id_endereco,profissao_saude) "
                + "VALUES(?,?,?,?,?,?,?)";

        ConexaoDB conexao = new ConexaoDB();
        Connection conn = conexao.abreConexao();
        try {

            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setInt(1, id_usuario);
            pst.setString(2, nome);
            pst.setString(3, cpf);
            pst.setInt(4, idade);
            pst.setString(5, telefone);
            pst.setInt(6, id_endereco);
            pst.setBoolean(7, profissao_saude);

            int retorno = pst.executeUpdate();

            if (retorno > 0) {
                resp = "Paciente " + nome + " inserido com sucesso!";
            } else {
                resp = "Falha na inserção";
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            conn.rollback();
        }

        return resp;

    }

    //lista de paciente que não foi vacinado
    public List<Paciente> listaPaciente() {

        Connection conn = ConexaoDB.abreConexao();
        List<Paciente> listaDePaciente = new ArrayList<Paciente>();
        try {

            String sql = "select * from tb_paciente where dt_vacinacao is null";
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {

                Paciente paciente = new Paciente(rs);
                listaDePaciente.add(paciente);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaDePaciente;

    }

    public List<Paciente> buscarVacinacao(String dtIni, String dtFin) throws Exception {
        String sql = "SELECT * FROM tb_paciente WHERE dt_vacinacao BETWEEN ? AND ?";
        List<Paciente> vacinados = new ArrayList<>();

        try (Connection conexao = ConexaoDB.abreConexao();
                PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setDate(1, new java.sql.Date(Util.converter(dtIni).getTime()));
            ps.setDate(2, new java.sql.Date(Util.converter(dtFin).getTime()));
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    String nome = rs.getString("nome");
                    int idade = rs.getInt("idade");
                    boolean saude = rs.getBoolean("profissao_saude");
                    Date vacinacao = rs.getDate("dt_vacinacao");
                    vacinados.add(new Paciente(nome, idade, vacinacao, saude));
                }
            }
            return vacinados;
        }
    }

    public void confirmarVacinacao(int id) throws Exception {
        String sql = "UPDATE tb_paciente SET dt_vacinacao = ?, vacinado = true WHERE id_paciente = ?";
        try (Connection conn = ConexaoDB.abreConexao();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setDate(1, new java.sql.Date(new java.util.Date().getTime()));
            ps.setInt(2, id);
            ps.execute();
        }
    }

    public boolean buscarPaciente(String cpf) {

        Connection conn = ConexaoDB.abreConexao();
        boolean retorno = false;
        try {
            String sql = "select * from tb_paciente where cpf = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, cpf);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {

                Paciente pac = new Paciente(rs);

                if (pac.getDt_vacinacao() == null) {
                    retorno = false;
                } else {
                    retorno = true;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return retorno;
    }
}
