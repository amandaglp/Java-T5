package banco.views;

import banco.controllers.ClienteBean;
import banco.domains.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLSyntaxErrorException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lopes
 */
public class JFCliente extends javax.swing.JFrame {

    /**
     * Creates new form JFCliente
     */
    public JFCliente() {
        initComponents();
        listarClientes();
        desativarBotoes();
        jBtnInserir.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnGSexo = new javax.swing.ButtonGroup();
        jBtnGCivil = new javax.swing.ButtonGroup();
        jPnlCliente = new javax.swing.JPanel();
        jLblCodigo = new javax.swing.JLabel();
        jLblNome = new javax.swing.JLabel();
        jLblSexo = new javax.swing.JLabel();
        jTxtCodigo = new javax.swing.JTextField();
        jTxtNome = new javax.swing.JTextField();
        jBtnInserir = new javax.swing.JButton();
        jBtnEditar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnLimpar = new javax.swing.JButton();
        jRBtnM = new javax.swing.JRadioButton();
        jRBtnF = new javax.swing.JRadioButton();
        jLblEmail = new javax.swing.JLabel();
        jLblEstadoCivil = new javax.swing.JLabel();
        jTxtEmail = new javax.swing.JTextField();
        jRBtnS = new javax.swing.JRadioButton();
        jRBtnC = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPnlCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPnlCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPnlClienteMouseClicked(evt);
            }
        });

        jLblCodigo.setText("Código");
        jLblCodigo.setPreferredSize(new java.awt.Dimension(50, 16));

        jLblNome.setText("Nome");

        jLblSexo.setText("Sexo");

        jTxtCodigo.setEnabled(false);
        jTxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCodigoActionPerformed(evt);
            }
        });

        jTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNomeActionPerformed(evt);
            }
        });

        jBtnInserir.setText("Inserir");
        jBtnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnInserirActionPerformed(evt);
            }
        });

        jBtnEditar.setText("Editar");
        jBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarActionPerformed(evt);
            }
        });

        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnLimpar.setText("Limpar");
        jBtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimparActionPerformed(evt);
            }
        });

        jBtnGSexo.add(jRBtnM);
        jRBtnM.setText("M");
        jRBtnM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBtnMActionPerformed(evt);
            }
        });

        jBtnGSexo.add(jRBtnF);
        jRBtnF.setText("F");

        jLblEmail.setText("Email");

        jLblEstadoCivil.setText("Estado Civil");

        jBtnGCivil.add(jRBtnS);
        jRBtnS.setText("Solteiro(a)");

        jBtnGCivil.add(jRBtnC);
        jRBtnC.setText("Casado(a)");
        jRBtnC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRBtnCMouseClicked(evt);
            }
        });
        jRBtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBtnCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnlClienteLayout = new javax.swing.GroupLayout(jPnlCliente);
        jPnlCliente.setLayout(jPnlClienteLayout);
        jPnlClienteLayout.setHorizontalGroup(
            jPnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlClienteLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlClienteLayout.createSequentialGroup()
                        .addGroup(jPnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnInserir)
                            .addComponent(jLblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblEstadoCivil))
                        .addGap(18, 18, 18)
                        .addGroup(jPnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnlClienteLayout.createSequentialGroup()
                                .addGroup(jPnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPnlClienteLayout.createSequentialGroup()
                                        .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlClienteLayout.createSequentialGroup()
                                        .addComponent(jBtnEditar)
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addGroup(jPnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRBtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPnlClienteLayout.createSequentialGroup()
                                                .addComponent(jBtnExcluir)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtnLimpar)))))
                                .addGap(97, 97, 97))
                            .addGroup(jPnlClienteLayout.createSequentialGroup()
                                .addGroup(jPnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRBtnS, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPnlClienteLayout.createSequentialGroup()
                        .addComponent(jLblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jRBtnM, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRBtnF, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPnlClienteLayout.setVerticalGroup(
            jPnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlClienteLayout.createSequentialGroup()
                .addGroup(jPnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlClienteLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblNome)
                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblSexo)
                    .addComponent(jRBtnM)
                    .addComponent(jRBtnF))
                .addGap(14, 14, 14)
                .addGroup(jPnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblEmail)
                    .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblEstadoCivil)
                    .addComponent(jRBtnS)
                    .addComponent(jRBtnC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnInserir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnEditar)
                        .addComponent(jBtnExcluir)
                        .addComponent(jBtnLimpar)))
                .addGap(19, 19, 19))
        );

        jTblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Email", "Estado Civil", "Sexo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jTblClientes.setGridColor(new java.awt.Color(153, 153, 153));
        jTblClientes.setShowGrid(true);
        jTblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTblClientes);
        if (jTblClientes.getColumnModel().getColumnCount() > 0) {
            jTblClientes.getColumnModel().getColumn(0).setMinWidth(40);
            jTblClientes.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTblClientes.getColumnModel().getColumn(0).setMaxWidth(120);
            jTblClientes.getColumnModel().getColumn(1).setMinWidth(300);
            jTblClientes.getColumnModel().getColumn(1).setPreferredWidth(300);
            jTblClientes.getColumnModel().getColumn(1).setMaxWidth(600);
            jTblClientes.getColumnModel().getColumn(2).setMinWidth(200);
            jTblClientes.getColumnModel().getColumn(2).setPreferredWidth(200);
            jTblClientes.getColumnModel().getColumn(2).setMaxWidth(300);
            jTblClientes.getColumnModel().getColumn(3).setMinWidth(100);
            jTblClientes.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTblClientes.getColumnModel().getColumn(3).setMaxWidth(80);
            jTblClientes.getColumnModel().getColumn(4).setMinWidth(40);
            jTblClientes.getColumnModel().getColumn(4).setPreferredWidth(60);
            jTblClientes.getColumnModel().getColumn(4).setMaxWidth(60);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPnlCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPnlCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBtnMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBtnMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBtnMActionPerformed

    private void jBtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimparActionPerformed
        // TODO add your handling code here:
        limpar();
    }//GEN-LAST:event_jBtnLimparActionPerformed

    private void jBtnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnInserirActionPerformed
        // TODO add your handling code here:
        if (jTxtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o nome", "Atenção", JOptionPane.WARNING_MESSAGE);

        } else if (jBtnGSexo.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Selecione o sexo", "Atenção", JOptionPane.WARNING_MESSAGE);

        } else if (jTxtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o email", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else if (jBtnGCivil.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Selecione o estado civil", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            char sexo = 0;
            String civil = null;

            if (jRBtnF.isSelected()) {
                sexo = 'F';
            }
            if (jRBtnM.isSelected()) {
                sexo = 'M';
            }
            if (jRBtnS.isSelected()) {
                civil = "Solteiro(a)";
            }
            if (jRBtnC.isSelected()) {
                civil = "Casado(a)";
            }
            Cliente cliente = new Cliente(jTxtNome.getText(), sexo, jTxtEmail.getText(), civil);
            ClienteBean clienteBean = new ClienteBean();

            try {
                clienteBean.inserirCliente(cliente);
                JOptionPane.showMessageDialog(null, "Registro inserido com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLSyntaxErrorException ex) {
                JOptionPane.showMessageDialog(null, "Erro 001\nReporte o erro para o desenvolvedor", "Erro", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            } catch (SQLIntegrityConstraintViolationException e) {
                JOptionPane.showMessageDialog(null, "Nome já registrado no banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Outro problema com o banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }

            limpar();
            listarClientes();
        }

    }//GEN-LAST:event_jBtnInserirActionPerformed

    private void jTblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblClientesMouseClicked
        // TODO add your handling code here:
        jTxtCodigo.setText(String.valueOf(jTblClientes.getValueAt(jTblClientes.getSelectedRow(), 0)));
        jTxtNome.setText(String.valueOf(jTblClientes.getValueAt(jTblClientes.getSelectedRow(), 1)));
        jTxtEmail.setText(String.valueOf(jTblClientes.getValueAt(jTblClientes.getSelectedRow(), 2)));

        if (jTblClientes.getValueAt(jTblClientes.getSelectedRow(), 4).equals('M')) {
            jRBtnM.setSelected(true);

        }
        if (jTblClientes.getValueAt(jTblClientes.getSelectedRow(), 4).equals('F')) {
            jRBtnF.setSelected(true);
        }
        if (jTblClientes.getValueAt(jTblClientes.getSelectedRow(), 3).equals("Solteiro(a)")) {
            jRBtnS.setSelected(true);
        }
        if (jTblClientes.getValueAt(jTblClientes.getSelectedRow(), 3).equals("Casado(a)")) {
            jRBtnC.setSelected(true);
        }

        ativarBotoes();
        jBtnInserir.setEnabled(false);
    }//GEN-LAST:event_jTblClientesMouseClicked

    private void jBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarActionPerformed
        // TODO add your handling code here:
        if (jTxtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o nome", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else if (jBtnGSexo.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Selecione o sexo", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        if (jTxtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o email", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else if (jBtnGCivil.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Selecione o estado civil", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {

            char sexo = 0;
            String civil = null;

            if (jRBtnF.isSelected()) {
                sexo = 'F';
            }
            if (jRBtnM.isSelected()) {
                sexo = 'M';
            }
            if (jRBtnS.isSelected()) {
                civil = "Solteiro(a)";
            }
            if (jRBtnC.isSelected()) {
                civil = "Casado(a)";
            }

            Cliente cliente = new Cliente(jTxtNome.getText(), sexo, jTxtEmail.getText(), civil);
            cliente.setId(Integer.parseInt(jTxtCodigo.getText()));
            ClienteBean clienteBean = new ClienteBean();

            clienteBean.alterarCliente(cliente);
            JOptionPane.showMessageDialog(null, "Registro alterado com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
            limpar();
            listarClientes();

        }

    }//GEN-LAST:event_jBtnEditarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        // TODO add your handling code here:
        if (jTxtCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione um cliente para excluir", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            char sexo = 0;
            String civil = null;
            if (jRBtnF.isSelected()) {
                sexo = 'F';
            }

            if (jRBtnM.isSelected()) {
                sexo = 'M';
            }
            if (jRBtnS.isSelected()) {
                civil = "Solteiro(a)";
            }
            if (jRBtnC.isSelected()) {
                civil = "Casado(a)";
            }
            Cliente cliente;
            cliente = new Cliente(jTxtNome.getText(), sexo, jTxtEmail.getText(), civil);
            cliente.setId(Integer.parseInt(jTxtCodigo.getText()));

            ClienteBean clienteBean = new ClienteBean();

            int confirmacao = JOptionPane.showConfirmDialog(null, "Confirma a exclusão permanente do registro?", "Confirmação", JOptionPane.YES_NO_OPTION);

            if (confirmacao == JOptionPane.YES_OPTION) {
                clienteBean.excluirCliente(cliente);
                JOptionPane.showMessageDialog(null, "Registro excluído com sucesso", "Informação", JOptionPane.INFORMATION_MESSAGE);
                limpar();
                listarClientes();
            } else {
                JOptionPane.showMessageDialog(null, "Exclusão cancelada pelo usuário", "Informação", JOptionPane.INFORMATION_MESSAGE);
                limpar();
            }
        }
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNomeActionPerformed

    private void jTxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodigoActionPerformed

    private void jPnlClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPnlClienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPnlClienteMouseClicked

    private void jRBtnCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRBtnCMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBtnCMouseClicked

    private void jRBtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBtnCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBtnCActionPerformed

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
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnEditar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.ButtonGroup jBtnGCivil;
    private javax.swing.ButtonGroup jBtnGSexo;
    private javax.swing.JButton jBtnInserir;
    private javax.swing.JButton jBtnLimpar;
    private javax.swing.JLabel jLblCodigo;
    private javax.swing.JLabel jLblEmail;
    private javax.swing.JLabel jLblEstadoCivil;
    private javax.swing.JLabel jLblNome;
    private javax.swing.JLabel jLblSexo;
    private javax.swing.JPanel jPnlCliente;
    private javax.swing.JRadioButton jRBtnC;
    private javax.swing.JRadioButton jRBtnF;
    private javax.swing.JRadioButton jRBtnM;
    private javax.swing.JRadioButton jRBtnS;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblClientes;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtNome;
    // End of variables declaration//GEN-END:variables

    public void ativarBotoes() {
        jBtnInserir.setEnabled(true);
        jBtnEditar.setEnabled(true);
        jBtnExcluir.setEnabled(true);
        jBtnLimpar.setEnabled(true);
    }

    public void desativarBotoes() {
        jBtnInserir.setEnabled(false);
        jBtnEditar.setEnabled(false);
        jBtnExcluir.setEnabled(false);
        jBtnLimpar.setEnabled(false);
    }

    public void limpar() {
        jTxtCodigo.setText("");
        jTxtNome.setText("");
        jTxtEmail.setText("");
        jBtnGSexo.clearSelection();
        jBtnGCivil.clearSelection();
        jTblClientes.clearSelection();

        desativarBotoes();
        jBtnInserir.setEnabled(true);
    }

    public void listarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        ClienteBean clienteController = new ClienteBean();

        clientes = clienteController.listarClientes();

        DefaultTableModel modeloTabela = (DefaultTableModel) jTblClientes.getModel();
        modeloTabela.setRowCount(0);

        for (Cliente cliente : clientes) {
            Object[] linha = new Object[]{cliente.getId(), cliente.getNome(), cliente.getEmail(), cliente.getCivil(), cliente.getSexo()};
            modeloTabela.addRow(linha);
        }
    }
}