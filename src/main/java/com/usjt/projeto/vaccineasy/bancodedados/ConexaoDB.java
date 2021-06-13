package com.usjt.projeto.vaccineasy.bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoDB {
    
    private static String usuario = "root";
    private static  String senha = "AulasCria2021";
    private static  String host = "localhost";
    private static  String porta = "3306";
    private static  String bd = "db_vaccineasy?useTimezone=true&serverTimezone=UTC";
    
    public static Connection abreConexao() {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://" + host + ":" + porta + "/" + bd, usuario, senha);
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
}


