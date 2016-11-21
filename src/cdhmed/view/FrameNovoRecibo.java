/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdhmed.view;

import cdhmed.controller.Controller;
import cdhmed.model.Medico;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author batista
 */
public class FrameNovoRecibo extends javax.swing.JFrame {

    /**
     * Creates new form FrameNovoRecibo
     */
    public FrameNovoRecibo() {
        initComponents();
        inserirDadosnoComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxProcedimento = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNumRecibo = new javax.swing.JTextField();
        jComboBoxMedico = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jButtonGravar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jFormattedTextFieldValor = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Recibo");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jComboBoxProcedimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBoxProcedimentoKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Selecione o procedimento");

        jTextFieldNumRecibo.setMinimumSize(new java.awt.Dimension(6, 22));
        jTextFieldNumRecibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumReciboActionPerformed(evt);
            }
        });
        jTextFieldNumRecibo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNumReciboKeyPressed(evt);
            }
        });

        jComboBoxMedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBoxMedicoKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Selecione o nome do médico");

        jLabelTitle.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(111, 111, 111));
        jLabelTitle.setText("NOVO RECIBO");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Informe o número do recibo");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Informe o valor");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Informe a data");

        jFormattedTextFieldData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFormattedTextFieldDataKeyPressed(evt);
            }
        });

        jButtonGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cdhmed/etc/Gravar 32x32.png"))); // NOI18N
        jButtonGravar.setText("Gravar");
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });
        jButtonGravar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonGravarKeyPressed(evt);
            }
        });

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cdhmed/etc/Cancelar.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jFormattedTextFieldValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFormattedTextFieldValorKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBoxProcedimento, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldNumRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jFormattedTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(16, 16, 16))
                                    .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jButtonGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabelTitle)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldNumRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(jComboBoxProcedimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jComboBoxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGravar)
                    .addComponent(jButtonCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNumReciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumReciboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumReciboActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
        if (jTextFieldNumRecibo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Erro no Cadastro Verifique os Campos", "Campo vazio", 0);
        } else {
            String procedimento = jComboBoxProcedimento.getSelectedItem().toString();
            String data = jFormattedTextFieldData.getText().replace("/", "");
            Double valor = Double.parseDouble(jFormattedTextFieldValor.getText().replace(",", "."));
            int num_recibo = Integer.parseInt(jTextFieldNumRecibo.getText());
            ArrayList<Medico> listaMedico = Controller.pesquisaMed(jComboBoxMedico.getSelectedItem().toString());
            int id_medico = listaMedico.get(0).getIdMedico();
            boolean bol = Controller.verificaNumRecibo(num_recibo);
            if (bol) {//não esta funcionando
                if ((Controller.addRecibo(procedimento, data, valor, num_recibo, id_medico)) == true) {
                    JOptionPane.showMessageDialog(null, "Cadastrado com sucesso", "Cadastro OK", 2);
                } else {
                    JOptionPane.showMessageDialog(null, "Erro no Cadastro Verifique os Campos", "Cadastro vazio", 0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "ERRO número de recivo já cadastrado", "ERRO", 0);
            }
        }
    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            MaskFormatter formatoData = new MaskFormatter("##/##/####");
            jFormattedTextFieldData.setFormatterFactory(new DefaultFormatterFactory(formatoData));
        } catch (ParseException ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void jTextFieldNumReciboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumReciboKeyPressed
        if (evt.getKeyText(evt.getKeyCode()).equals("Enter")) {
            jTextFieldNumRecibo.transferFocus();
        }
    }//GEN-LAST:event_jTextFieldNumReciboKeyPressed

    private void jFormattedTextFieldValorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextFieldValorKeyPressed
        if (evt.getKeyText(evt.getKeyCode()).equals("Enter")) {
            jFormattedTextFieldValor.transferFocus();
        }
    }//GEN-LAST:event_jFormattedTextFieldValorKeyPressed

    private void jFormattedTextFieldDataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataKeyPressed
        if (evt.getKeyText(evt.getKeyCode()).equals("Enter")) {
            jFormattedTextFieldData.transferFocus();
        }
    }//GEN-LAST:event_jFormattedTextFieldDataKeyPressed

    private void jComboBoxProcedimentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxProcedimentoKeyPressed
        if (evt.getKeyText(evt.getKeyCode()).equals("Enter")) {
            jComboBoxProcedimento.transferFocus();
        }
    }//GEN-LAST:event_jComboBoxProcedimentoKeyPressed

    private void jComboBoxMedicoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxMedicoKeyPressed
        if (evt.getKeyText(evt.getKeyCode()).equals("Enter")) {
            jComboBoxMedico.transferFocus();
        }
    }//GEN-LAST:event_jComboBoxMedicoKeyPressed

    private void jButtonGravarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonGravarKeyPressed
        if (evt.getKeyText(evt.getKeyCode()).equals("Enter")) {
            if (jTextFieldNumRecibo.getText().isEmpty() && jFormattedTextFieldData.getText().isEmpty() && jFormattedTextFieldValor.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Erro no Cadastro Verifique os Campos", "Campo vazio", 0);
            } else {
                String procedimento = jComboBoxProcedimento.getSelectedItem().toString();
                String data = jFormattedTextFieldData.getText().replace("/", "");
                Double valor = Double.parseDouble(jFormattedTextFieldValor.getText().replace(",", "."));
                int num_recibo = Integer.parseInt(jTextFieldNumRecibo.getText());
                ArrayList<Medico> listaMedico = Controller.pesquisaMed(jComboBoxMedico.getSelectedItem().toString());
                int id_medico = listaMedico.get(0).getIdMedico();
                System.out.println(procedimento + data + valor + num_recibo + "ID medico" + id_medico);
                if ((Controller.addRecibo(procedimento, data, valor, num_recibo, id_medico)) == true) {
                    JOptionPane.showMessageDialog(null, "Cadastrado com sucesso", "Cadastro OK", 2);
                } else {
                    JOptionPane.showMessageDialog(null, "Erro no Cadastro Verifique os Campos", "Cadastro vazio", 0);
                }
                dispose();
            }
        }
    }//GEN-LAST:event_jButtonGravarKeyPressed

    private void inserirDadosnoComboBox() {
        ArrayList<Medico> listaMed = Controller.pesquisaAllMed();
        ArrayList<String> listaProcedimento = Controller.consultaProcedimento();
        for (int i = 0; i < listaMed.size(); i++) {
            jComboBoxMedico.addItem(listaMed.get(i).getNome());
        }
        for (int i = 0; i < listaProcedimento.size(); i++) {
            jComboBoxProcedimento.addItem(listaProcedimento.get(i));
        }
    }

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
            java.util.logging.Logger.getLogger(FrameNovoRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameNovoRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameNovoRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameNovoRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameNovoRecibo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JComboBox<String> jComboBoxMedico;
    private javax.swing.JComboBox<String> jComboBoxProcedimento;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JFormattedTextField jFormattedTextFieldValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JTextField jTextFieldNumRecibo;
    // End of variables declaration//GEN-END:variables
}
