/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdhmed.model;

/**
 *
 * @author batista
 */
public class main {

    public static void main(String[] args) {
        //Principal FramePrincipal = new Principal();
        //FramePrincipal.setVisible(true);
        Medico med = new Medico();
        Conn con = new Conn();
        med.setNome("vinicius");
        med.setCpf("059.625.183-14");
        med.setCrm("15150");
        Conn.addMedico(med);
        
    }
}
