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
            JOptionPane.showMessageDialog(null, "CPF já cadastrado", "CPF Inválido", 0);
        } else if (validaCpf(medico.getCpf())) {
            Conn.addMedicoDAO(medico);
        } else {
            JOptionPane.showMessageDialog(null, "CPF inválido, digite novamente", "CPF Inválido", 0);
        }
    }

    public static boolean validaCpf(String cpf) {
        int soma, num, resto, i, peso;
        int dig1, dig2;
        soma = 0;
        peso = 10;
        if (cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222")
                || cpf.equals("33333333333") || cpf.equals("44444444444") || cpf.equals("55555555555") || cpf.equals("66666666666")
                || cpf.equals("77777777777") || cpf.equals("88888888888") || cpf.equals("99999999999")) {
            return false;
        }

        for (i = 0; i < 9; i++) {
            num = (int) cpf.charAt(i) - 48;
            soma += (num * peso);
            peso -= 1;
        }
        resto = (soma % 11);
        if (resto < 2) {
            dig1 = 0;
        } else {
            resto = 11 - resto;
            dig1 = resto;
        }
        if (dig1 == cpf.charAt(9) - 48) {
            peso = 11;
            soma = 0;
            for (i = 0; i < 10; i++) {
                num = (int) cpf.charAt(i) - 48;
                soma += (num * peso);
                peso -= 1;
            }
            resto = (soma % 11);
            if (resto < 2) {
                dig2 = 0;
            } else {
                resto = 11 - resto;
                dig2 = resto;
            }
            if (dig2 == cpf.charAt(10) - 48) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

}
