/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.Paciente;

/**
 *
 * @author 22282176
 */
public class PacientesDialog extends javax.swing.JDialog {
        private Paciente paciente;
        private OperacaoEnum operacao;
    /**
     * Creates new form PacientesDialog
     */
    public PacientesDialog(java.awt.Frame parent, boolean modal, Especialidade e, OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
         this.operacao = operacao;
    }
     public PacientesDialog(java.awt.Frame parent, boolean modal, OperacaoEnum operacao) {
        super(parent, modal);
        initComponents(); 
         this.operacao = operacao;

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHeader = new javax.swing.JPanel();
        TituloLabel = new javax.swing.JLabel();
        IconeLabel = new javax.swing.JLabel();
        panelBaixo = new java.awt.Panel();
        jPanelContent = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelNomePaciente = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jTextFieldNomePaciente = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jTextFieldDataNasc = new javax.swing.JFormattedTextField();
        jLabelDataNasc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 468));
        getContentPane().setLayout(null);

        jPanelHeader.setBackground(new java.awt.Color(153, 0, 153));
        jPanelHeader.setLayout(null);

        TituloLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        TituloLabel.setForeground(new java.awt.Color(255, 255, 255));
        TituloLabel.setText("PACIENTE - ADICIONAR");
        jPanelHeader.add(TituloLabel);
        TituloLabel.setBounds(100, 10, 320, 30);

        IconeLabel.setBackground(new java.awt.Color(255, 255, 255));
        IconeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/Button-Adicionar.png"))); // NOI18N
        jPanelHeader.add(IconeLabel);
        IconeLabel.setBounds(20, 0, 60, 50);

        getContentPane().add(jPanelHeader);
        jPanelHeader.setBounds(0, 0, 690, 50);

        panelBaixo.setBackground(new java.awt.Color(204, 204, 255));
        panelBaixo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelBaixo.setLayout(null);

        jPanelContent.setBackground(new java.awt.Color(204, 204, 255));
        jPanelContent.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do Paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(153, 0, 153))); // NOI18N
        jPanelContent.setForeground(new java.awt.Color(255, 255, 255));
        jPanelContent.setLayout(null);

        jLabelCodigo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelCodigo.setText("Código");
        jPanelContent.add(jLabelCodigo);
        jLabelCodigo.setBounds(10, 40, 290, 50);

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.setBackground(new java.awt.Color(255, 204, 204));
        jTextFieldCodigo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelContent.add(jTextFieldCodigo);
        jTextFieldCodigo.setBounds(10, 90, 120, 30);

        jLabelNomePaciente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelNomePaciente.setText("Nome do Paciente");
        jPanelContent.add(jLabelNomePaciente);
        jLabelNomePaciente.setBounds(10, 130, 280, 40);

        jLabelTelefone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelTelefone.setText("Telefone do Paciente");
        jPanelContent.add(jLabelTelefone);
        jLabelTelefone.setBounds(10, 220, 280, 30);

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancelar.png"))); // NOI18N
        jButtonCancelar.setToolTipText("Cancelar");
        jButtonCancelar.setBorder(null);
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanelContent.add(jButtonCancelar);
        jButtonCancelar.setBounds(485, 320, 50, 40);

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/diskette.png"))); // NOI18N
        jButtonSalvar.setToolTipText("Salvar");
        jButtonSalvar.setBorder(null);
        jButtonSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanelContent.add(jButtonSalvar);
        jButtonSalvar.setBounds(560, 320, 50, 40);

        jTextFieldNomePaciente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextFieldNomePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomePacienteActionPerformed(evt);
            }
        });
        jPanelContent.add(jTextFieldNomePaciente);
        jTextFieldNomePaciente.setBounds(10, 180, 340, 30);

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setText("   ");
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });
        jPanelContent.add(jFormattedTextField1);
        jFormattedTextField1.setBounds(10, 260, 250, 30);

        jTextFieldDataNasc.setColumns(8);
        try {
            jTextFieldDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanelContent.add(jTextFieldDataNasc);
        jTextFieldDataNasc.setBounds(390, 100, 200, 22);

        jLabelDataNasc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelDataNasc.setText("Data de Nascimento");
        jPanelContent.add(jLabelDataNasc);
        jLabelDataNasc.setBounds(390, 60, 200, 30);

        panelBaixo.add(jPanelContent);
        jPanelContent.setBounds(30, 20, 620, 370);

        getContentPane().add(panelBaixo);
        panelBaixo.setBounds(0, 50, 690, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed


    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldNomePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomePacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomePacienteActionPerformed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconeLabel;
    private javax.swing.JLabel TituloLabel;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelDataNasc;
    private javax.swing.JLabel jLabelNomePaciente;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JFormattedTextField jTextFieldDataNasc;
    private javax.swing.JTextField jTextFieldNomePaciente;
    private java.awt.Panel panelBaixo;
    // End of variables declaration//GEN-END:variables
}
