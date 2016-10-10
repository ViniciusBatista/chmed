/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdhmed.model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author batista
 */
public class Medico {

    public int idMedico;
    public String nome;
    public String cpf;
    public String crm;

    public Medico() {
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public void addMedico(Medico medico) {
        ArrayList<String> listaCpf = Conn.consultaCpf();
        if (listaCpf.contains(medico.getCpf())) {
            JOptionPane.showMessageDialog(null, "CPF já cadastrado", "CPF Invalido", 0);
        } else {
            Conn.addMedicoDAO(medico);
        }
    }

}
