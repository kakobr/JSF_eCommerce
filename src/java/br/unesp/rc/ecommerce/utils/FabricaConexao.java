/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.ecommerce.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class FabricaConexao implements IMySQL {

    private FabricaConexao() {
    }

    public static Connection getConexao() {
        Connection con = null;

        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("ERRO: " + ex.getMessage());
        }

        return con;
    }

    public static void fechar(Connection con) {

        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("ERRO: " + ex.getMessage());
            }
        }

    }

    public static void fechar(Connection con, PreparedStatement pstm) {

        if ((con != null) && (pstm != null)) {
            try {
                con.close();
                pstm.close();
            } catch (SQLException ex) {
                System.out.println("ERRO: " + ex.getMessage());
            }
        }

    }

    public static void fechar(Connection con,
            PreparedStatement pstm, ResultSet res) {
        if ((con != null) && (pstm != null) && (res != null)) {
            try {
                con.close();
                pstm.close();
                res.close();
            } catch (SQLException ex) {
                System.out.println("ERRO: " + ex.getMessage());
            }
        }
    }
}
