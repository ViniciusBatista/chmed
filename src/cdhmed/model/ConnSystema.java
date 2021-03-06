/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdhmed.model;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author batista
 */
public class ConnSystema {

    public static Connection conSystema;

    public static void conectSystema() {
        String Driver = "org.postgresql.Driver";
        String user = "";
        String password = "";
        String url = "jdbc:postgresql://5432/systema";

        try {
            Class.forName(Driver);
            conSystema = (Connection) DriverManager.getConnection(url, user, password);
            System.out.println("Conexão realizada com sucesso");
        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void execute(String sql) {
        try {
            PreparedStatement stmt = conSystema.prepareCall(sql);
            Statement st = conSystema.createStatement();
            st.execute(sql);
            st.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static ResultSet executeQuery(String sql) {
        try {
            Statement st = conSystema.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public static ArrayList consultaProcedimento() {
        ArrayList<String> listaProcedimento = new ArrayList();
        String SQL = "select descricao from tabela where fgrupo like '%06.%' or fgrupo like '%04.%' and dtexclusao is null order by descricao";

        try {
            conectSystema();
            ResultSet rs = executeQuery(SQL);
            while (rs.next()) {
                listaProcedimento.add(rs.getString("descricao"));
            }
        } catch (SQLException e) {
            throw new RuntimeException();
        }
        return listaProcedimento;
    }
}
