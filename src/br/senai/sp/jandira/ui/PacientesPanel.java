/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PacientesDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.Paciente;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author 22282176
 */
public class PacientesPanel extends javax.swing.JPanel {

    private int linha;
    
    public PacientesPanel() {
        initComponents();
        PacientesDAO.criarListaDePlanos();
        ajustarTabela();
        preencherTabela();
    }

        private int getLinha() {
        linha = tablePacientes.getSelectedRow();
        return linha;
    }

    private Integer getCodigo() {
        String codigoStr = tablePacientes.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonExcluirPaciente = new javax.swing.JButton();
        buttonEditarPaciente = new javax.swing.JButton();
        buttonAdicionarPaciente = new javax.swing.JButton();
        scroolPacientes = new javax.swing.JScrollPane();
        tablePacientes = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Pacientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 0, 153))); // NOI18N
        setPreferredSize(new java.awt.Dimension(785, 300));
        setLayout(null);

        buttonExcluirPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/excluir.png"))); // NOI18N
        buttonExcluirPaciente.setToolTipText("Excluir especialidade selecionada");
        buttonExcluirPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirPacienteActionPerformed(evt);
            }
        });
        add(buttonExcluirPaciente);
        buttonExcluirPaciente.setBounds(600, 260, 40, 30);

        buttonEditarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit32.png"))); // NOI18N
        buttonEditarPaciente.setToolTipText("Editar  especialidade selecionada");
        buttonEditarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarPacienteActionPerformed(evt);
            }
        });
        add(buttonEditarPaciente);
        buttonEditarPaciente.setBounds(650, 260, 40, 30);

        buttonAdicionarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/Button-Adicionar.png"))); // NOI18N
        buttonAdicionarPaciente.setToolTipText("Editar nova Especialidade");
        buttonAdicionarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarPacienteActionPerformed(evt);
            }
        });
        add(buttonAdicionarPaciente);
        buttonAdicionarPaciente.setBounds(700, 260, 40, 30);

        tablePacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scroolPacientes.setViewportView(tablePacientes);

        add(scroolPacientes);
        scroolPacientes.setBounds(30, 40, 680, 210);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirPacienteActionPerformed


    }//GEN-LAST:event_buttonExcluirPacienteActionPerformed

    private void buttonEditarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarPacienteActionPerformed
        if (getLinha() != -1) {
            editarPacientes();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Por favor, selecione o plano que deseja editar",
                    "ATENÇÃO!",
                    JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_buttonEditarPacienteActionPerformed
      private void editarPacientes() {
          
    }

    private void buttonAdicionarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarPacienteActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAdicionarPacienteActionPerformed
     private void preencherTabela() {

        tablePacientes.setModel(PacientesDAO.getPacientesModel());
        ajustarTabela();
        tablePacientes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    }

    private void ajustarTabela() {
        // Impedir que o usuário ajuste as colunas
        tablePacientes.getTableHeader().setReorderingAllowed(false);
        // Bloquear a edição das celulas da tabela

        tablePacientes.setDefaultEditor(Object.class, null);
        // Definir largura coluna
        tablePacientes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablePacientes.getColumnModel().getColumn(0).setPreferredWidth(50);
        tablePacientes.getColumnModel().getColumn(1).setPreferredWidth(230);
        tablePacientes.getColumnModel().getColumn(2).setPreferredWidth(150);
        tablePacientes.getColumnModel().getColumn(3).setPreferredWidth(247);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarPaciente;
    private javax.swing.JButton buttonEditarPaciente;
    private javax.swing.JButton buttonExcluirPaciente;
    private javax.swing.JScrollPane scroolPacientes;
    private javax.swing.JTable tablePacientes;
    // End of variables declaration//GEN-END:variables
}
