/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author 22282176
 */
public class PlanoDeSaudePanel extends javax.swing.JPanel {

    private int linha;

    /**
     * Creates new form PlanoDeSaudePanel
     */
    public PlanoDeSaudePanel() {
        initComponents();
        PlanoDeSaudeDAO.criarListaDePlanos();
        ajustarTabela();
        preencherTabela();

    }

    private int getLinha() {
        linha = tablePlanos.getSelectedRow();
        return linha;
    }

    private Integer getCodigo() {
        String codigoStr = tablePlanos.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroolPlanos = new javax.swing.JScrollPane();
        tablePlanos = new javax.swing.JTable();
        buttonExcluirPlanos = new javax.swing.JButton();
        buttonEditarPlanos = new javax.swing.JButton();
        buttonAdicionarPlanos = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Plano de Saúde", 0, 0, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 0, 153))); // NOI18N
        setPreferredSize(new java.awt.Dimension(750, 300));
        setLayout(null);

        tablePlanos.setModel(new javax.swing.table.DefaultTableModel(
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
        scroolPlanos.setViewportView(tablePlanos);

        add(scroolPlanos);
        scroolPlanos.setBounds(30, 40, 680, 210);

        buttonExcluirPlanos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/excluir.png"))); // NOI18N
        buttonExcluirPlanos.setToolTipText("Excluir plano selecionado");
        buttonExcluirPlanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirPlanosActionPerformed(evt);
            }
        });
        add(buttonExcluirPlanos);
        buttonExcluirPlanos.setBounds(600, 260, 40, 30);

        buttonEditarPlanos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit32.png"))); // NOI18N
        buttonEditarPlanos.setToolTipText("Editar  plano selecionado");
        buttonEditarPlanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarPlanosActionPerformed(evt);
            }
        });
        add(buttonEditarPlanos);
        buttonEditarPlanos.setBounds(650, 260, 40, 30);

        buttonAdicionarPlanos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/Button-Adicionar.png"))); // NOI18N
        buttonAdicionarPlanos.setToolTipText("Adicionar novo Plano");
        buttonAdicionarPlanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarPlanosActionPerformed(evt);
            }
        });
        add(buttonAdicionarPlanos);
        buttonAdicionarPlanos.setBounds(700, 260, 40, 30);
    }// </editor-fold>//GEN-END:initComponents


    private void buttonExcluirPlanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirPlanosActionPerformed
          System.out.println(linha
        );
        if (getLinha() != -1) {
            excluirPlano();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione o plano que deseja excluir", "ATENÇÃO!", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buttonExcluirPlanosActionPerformed

        private void excluirPlano() {
        int resposta = JOptionPane.showConfirmDialog(this,
                "Você confirma a exclusão?",
                "Muita atenção!",
                JOptionPane.YES_NO_OPTION);

        if (resposta == 0) {
            String codigoStr = tablePlanos.getValueAt(linha, 0).toString();
            Integer codigo = Integer.valueOf(codigoStr);
            PlanoDeSaudeDAO.excluir(codigo);
            preencherTabela();
        }

    }
    private void buttonEditarPlanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarPlanosActionPerformed
        if (getLinha() != -1) {
            editarPlanos();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Por favor, selecione o plano que deseja editar",
                    "ATENÇÃO!",
                    JOptionPane.WARNING_MESSAGE);
        }
        // TODO add your handling code here:

    }//GEN-LAST:event_buttonEditarPlanosActionPerformed

    private void editarPlanos() {
        PlanoDeSaude planoDeSaude = PlanoDeSaudeDAO.getPlanos(getCodigo());
         PlanoDeSaudeDialog planoDeSaudeDialog = new PlanoDeSaudeDialog(null, 
                 true,
                 planoDeSaude,
                 OperacaoEnum.EDITAR);
         planoDeSaudeDialog.setVisible(true);
        preencherTabela();
    }

   
    private void buttonAdicionarPlanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarPlanosActionPerformed

        PlanoDeSaudeDialog planoDeSaudeDialog = new PlanoDeSaudeDialog(null, true, OperacaoEnum.ADICIONAR);
        planoDeSaudeDialog.setVisible(true);
        preencherTabela();
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAdicionarPlanosActionPerformed
    private void preencherTabela() {

        tablePlanos.setModel(PlanoDeSaudeDAO.getPlanosModel());
        ajustarTabela();
        tablePlanos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    }

    private void ajustarTabela() {
        // Impedir que o usuário ajuste as colunas
        tablePlanos.getTableHeader().setReorderingAllowed(false);
        // Bloquear a edição das celulas da tabela

        tablePlanos.setDefaultEditor(Object.class, null);
        // Definir largura coluna
        tablePlanos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablePlanos.getColumnModel().getColumn(0).setPreferredWidth(50);
        tablePlanos.getColumnModel().getColumn(1).setPreferredWidth(210);
        tablePlanos.getColumnModel().getColumn(2).setPreferredWidth(140);
        tablePlanos.getColumnModel().getColumn(3).setPreferredWidth(202);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarPlanos;
    private javax.swing.JButton buttonEditarPlanos;
    private javax.swing.JButton buttonExcluirPlanos;
    private javax.swing.JScrollPane scroolPlanos;
    private javax.swing.JTable tablePlanos;
    // End of variables declaration//GEN-END:variables

}
