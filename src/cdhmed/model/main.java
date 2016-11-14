/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdhmed.model;

import cdhmed.view.FramePrincipal;

/**
 *
 * @author batista
 */
public class main {

    public static void main(String[] args) {
        FramePrincipal FramePrincipal = new FramePrincipal();
        FramePrincipal.setVisible(true);
        Recibo recibo = new Recibo();
        recibo.setData("10102016");
    }
}
