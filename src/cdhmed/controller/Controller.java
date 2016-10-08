/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdhmed.controller;

import cdhmed.model.Medico;


/**
 *
 * @author batista
 */
public class Controller {

    public Controller() {
    }
    
    public static void addMedico (String nome, String cpf, String crm){
        Medico medico = new Medico();
        medico.setNome(nome);
        medico.setCpf(cpf);
        medico.setCrm(crm);
        medico.addMedico(medico);
    }
}
