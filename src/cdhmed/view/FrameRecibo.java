/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdhmed.view;

import cdhmed.controller.Controller;
import cdhmed.model.Medico;
import cdhmed.model.Recibo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author batista
 */
public class FrameRecibo extends javax.swing.JFrame {

    /**
     * Creates new form Recibo
     */
    public FrameRecibo() {
        initComponents();
        inserirPesquisaRecibo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RECIBO");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cdhmed/etc/Add.png"))); // NOI18N
        jButton1.setText("Novo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cdhmed/etc/Edit.png"))); // NOI18N
        jButton2.setText("Alterar");
        jButton2.setMaximumSize(new java.awt.Dimension(9, 41));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cdhmed/etc/Excluir.png"))); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cdhmed/etc/Lupa.png"))); // NOI18N
        jButton4.setText("Pesquisar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton4KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton4KeyTyped(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número recibo", "Nome do médico", "Procedimento", "Valor", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(15);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Informe o número do recibo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 312, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if (jTable1.getSelectedRow() >= 0) {
            if (JOptionPane.showConfirmDialog(null, "Você deseja realmente excluir o cadastro selecionado") == 0) {
                if (Controller.excluirRecibo((int) jTable1.getValueAt(jTable1.getSelectedRow(), 0))) {
                    JOptionPane.showMessageDialog(null, "Excluido com sucesso", "excluido", 0);
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao excluir cadastro", "excluido", 2);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Recibo para Excluir", "[ERRO]", 0);
        }
        inserirPesquisaRecibo();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
//        DefaultTableModel tabela = (DefaultTableModel) jTable1.getModel();
//        tabela.setNumRows(0);
        if (jTextField1.getText().isEmpty()) {
            inserirPesquisaRecibo();
        } else {
            inserirPesquisaReciboNum();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    public void inserirPesquisaReciboNum() {
        setLocationRelativeTo(null);
        jTable1.getColumnModel().getColumn(0).setHeaderValue("Número Recibo");//Colocar o titulo da coluna
        jTable1.getColumnModel().getColumn(1).setHeaderValue("Nome do médico");//Colocar o titulo da coluna
        jTable1.getColumnModel().getColumn(2).setHeaderValue("Procedimento");//Colocar o titulo da coluna
        jTable1.getColumnModel().getColumn(3).setHeaderValue("Valor");//Colocar o titulo da coluna
        jTable1.getColumnModel().getColumn(4).setHeaderValue("Data");//Colocar o titulo da coluna

        jTable1.setCellSelectionEnabled(false);
        jTable1.setRowSelectionAllowed(true);

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
        Recibo recibo = Controller.pesquisaReciboNumero(Integer.parseInt(jTextField1.getText()));
        if (recibo != null) {
            Object[] fila = new Object[model.getColumnCount()];
            Medico med = Controller.pesquisaIdMed(recibo.getIdMedico());
            fila[0] = recibo.getNum_recibo();
            fila[1] = med.getNome();
            fila[2] = recibo.getProcedimento();
            fila[3] = recibo.getValor();
            fila[4] = Controller.formataData(recibo.getData());
            model.addRow(fila);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum Recibo Encontrado", "Cadastro vazio", 0);
        }
    }

    public void inserirPesquisaRecibo() {
        setLocationRelativeTo(null);
        jTable1.getColumnModel().getColumn(0).setHeaderValue("Número Recibo");//Colocar o titulo da coluna
        jTable1.getColumnModel().getColumn(1).setHeaderValue("Nome do médico");//Colocar o titulo da coluna
        jTable1.getColumnModel().getColumn(2).setHeaderValue("Procedimento");//Colocar o titulo da coluna
        jTable1.getColumnModel().getColumn(3).setHeaderValue("Valor");//Colocar o titulo da coluna
        jTable1.getColumnModel().getColumn(4).setHeaderValue("Data");//Colocar o titulo da coluna

        jTable1.setCellSelectionEnabled(false);
        jTable1.setRowSelectionAllowed(true);

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
        ArrayList<Recibo> listaRecibo = Controller.pesquisaAllRecibo();
        if (!listaRecibo.isEmpty()) {
            Object[] fila = new Object[model.getColumnCount()];
            for (int i = 0; i < listaRecibo.size(); i++) {
                Medico med = Controller.pesquisaIdMed(listaRecibo.get(i).getIdMedico());
                fila[0] = listaRecibo.get(i).getNum_recibo();
                fila[1] = med.getNome();
                fila[2] = listaRecibo.get(i).getProcedimento();
                fila[3] = listaRecibo.get(i).getValor();
                fila[4] = Controller.formataData(listaRecibo.get(i).getData());
                model.addRow(fila);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum Recibo Cadastrado", "Cadastro vazio", 0);
        }
    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrameNovoRecibo frameNovoRecibo = new FrameNovoRecibo();
        frameNovoRecibo.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyTyped

    }//GEN-LAST:event_jButton4KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped

    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyPressed
        if (evt.getKeyText(evt.getKeyCode()).equals("Enter")) {
            if (jTextField1.getText().isEmpty()) {
                inserirPesquisaRecibo();
            } else {
                inserirPesquisaReciboNum();
            }
        }

    }//GEN-LAST:event_jButton4KeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        jButton4KeyPressed(evt);
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jTable1.getSelectedRow() >= 0) {
            FrameAltRecibo altRecibo = new FrameAltRecibo();
            altRecibo.setCodigoSelecionado((int) jTable1.getValueAt(jTable1.getSelectedRow(), 0));
            altRecibo.insereDadosCamposdeTexto();
            altRecibo.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Recibo para Alterar", "[ERRO]", 0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameRecibo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
