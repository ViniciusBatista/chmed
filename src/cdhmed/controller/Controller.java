/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdhmed.controller;

import cdhmed.model.Conn;
import cdhmed.model.ConnSystema;

import cdhmed.model.Medico;
import java.util.ArrayList;

/**
 *
 * @author batista
 */
public class Controller {

    public Controller() {
    }

    public static void addMedico(String nome, String cpf, String crm) {
        Medico medico = new Medico();
        medico.setNome(nome);
        medico.setCpf(cpf);
        medico.setCrm(crm);
        medico.addMedico(medico);
    }

    public static ArrayList<Medico> pesquisaMed(String nome) {
        ArrayList<Medico> listaMedico = Conn.pesquisaMedDAO(nome);
        return listaMedico;
    }

    public static Medico pesquisaIdMed(int id) {
        Medico medico = Conn.pesquisaIdMedDAO(id);
        return medico;
    }

    public static ArrayList<Medico> pesquisaAllMed() {
        ArrayList<Medico> listaMedico = Conn.pesquisaAllMedDAO();
        return listaMedico;
    }

    public static void atualizarMed(int id, String nome, String cpf, String crm) {
        Conn.atualizarMedDAO(id, nome, cpf, crm);
    }

    public static void excluirMed(int id) {
        Conn.excluirMedDAO(id);
    }
    
    public static ArrayList consultaProcedimento (){
        return ConnSystema.consultaProcedimento();
    }
}
