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
        String user = "emanuel";
        String password = "88122894";
        String url = "jdbc:postgresql://192.168.1.1:5432/systema";

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

//            ArrayList<Medico> listaMedico = new ArrayList();
//        String SQL = "select * from chmed.medico where nome like '%" + nome + "%';";
//        try {
//            conect();
//            ResultSet rs = executeQuery(SQL);
//            while (rs.next()) {
//                Medico med = new Medico();
//                med.setIdMedico(rs.getInt("id"));
//                med.setNome(rs.getString("nome"));
//                med.setCpf(rs.getString("cpf"));
//                med.setCrm(rs.getString("crm"));
//                listaMedico.add(med);
//            }
//        } catch (SQLException e) {
//            System.out.println("Erro sql Pesquisa med");
//        }
//        return listaMedico;
//    }
}
