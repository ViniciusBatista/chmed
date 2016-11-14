/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdhmed.controller;

import cdhmed.model.Conn;
import cdhmed.model.ConnSystema;

import cdhmed.model.Medico;
import cdhmed.model.Recibo;
import cdhmed.view.FrameRecibo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public static ArrayList consultaProcedimento() {
        return ConnSystema.consultaProcedimento();
    }

    public static void addRecibo(String procedimento, String data, Double valor, int num_recibo, int id_medico) {
        Recibo recibo = new Recibo();
        recibo.setProcedimento(procedimento);
        recibo.setData(data);
        recibo.setValor(valor);
        recibo.setNum_recibo(num_recibo);
        recibo.setIdMedico(id_medico);
        Conn.addReciboDAO(recibo);
    }

    public static ArrayList<Recibo> pesquisaAllRecibo() {
        ArrayList<Recibo> listaRecibo = Conn.pesquisaAllReciboDAO();
        return listaRecibo;
    }

    public static Recibo pesquisaReciboNumero(int numero) {
        Recibo recibo = Conn.pesquisaReciboNumeroDAO(numero);
        return recibo;
    }

    public static String formataData(String dataBanco) {//Formatar data
        dataBanco = dataBanco.replace("-", "");
        String data = "";
        SimpleDateFormat formata1 = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            data = formato2.format(formata1.parse(dataBanco));
        } catch (ParseException ex) {
            Logger.getLogger(FrameRecibo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    public static void excluirRecibo(int num_recibo) {
        Conn.deleteReciboDAO(num_recibo);
    }

}
