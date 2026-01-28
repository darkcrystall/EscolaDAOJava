/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.escola.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author EDUARDACRISTINADOSSA
 */

// responsabilidade: apenas conectar no banco
public class ConnectionFactory {
    // endereço do banco 
    private static  final String URL = "jdbc:mysql://localhost:3306/escoladao";
    // usuário do MySQL
    private static final String USER = "root";
    // senha do NySQL
    private static final String PASS = "root";
    // método que devolve uma conexão pronta
    public static Connection getConnection() throws SQLException {
        // abre a conexão e retorna para quem chamou
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
