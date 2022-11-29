/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author 22282176
 */
public class EspecialidadeDialog extends javax.swing.JDialog {
    //Atributo
    private Especialidade especialidade;
    private OperacaoEnum operacao;
    /**
     * Creates new form EspecialidadeDialog
     * @param parent
     * @param operacao
     */
     public EspecialidadeDialog(java.awt.Frame parent, boolean modal, Especialidade e, OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
         especialidade = e;
         preencherFormulario();
         this.operacao = operacao;
         preencherTitulo();
    }
    

     public EspecialidadeDialog(java.awt.Frame parent, boolean modal, OperacaoEnum operacao) {
        super(parent, modal);
        initComponents(); 
        this.operacao = operacao;
        preencherTitulo();
        
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
        jLabelNomeEspecialidade = new javax.swing.JLabel();
        jTextFieldNomeEspecialidade = new javax.swing.JTextField();
        jLabelDescEsp = new javax.swing.JLabel();
        jTextFieldDescEsp = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(684, 471));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanelHeader.setBackground(new java.awt.Color(153, 0, 153));
        jPanelHeader.setLayout(null);

        TituloLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        TituloLabel.setForeground(new java.awt.Color(255, 255, 255));
        TituloLabel.setText("ESPECIALIDADES - ADICIONAR");
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
        jPanelContent.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes de Especialidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(153, 0, 153))); // NOI18N
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
        jTextFieldCodigo.setBounds(10, 90, 120, 50);

        jLabelNomeEspecialidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelNomeEspecialidade.setText("Nome da Especialidade");
        jPanelContent.add(jLabelNomeEspecialidade);
        jLabelNomeEspecialidade.setBounds(10, 150, 280, 40);

        jTextFieldNomeEspecialidade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelContent.add(jTextFieldNomeEspecialidade);
        jTextFieldNomeEspecialidade.setBounds(10, 210, 360, 40);

        jLabelDescEsp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelDescEsp.setText("Descrição da Especialidade");
        jPanelContent.add(jLabelDescEsp);
        jLabelDescEsp.setBounds(10, 270, 280, 30);

        jTextFieldDescEsp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelContent.add(jTextFieldDescEsp);
        jTextFieldDescEsp.setBounds(10, 320, 360, 40);

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

        panelBaixo.add(jPanelContent);
        jPanelContent.setBounds(50, 50, 620, 370);

        getContentPane().add(panelBaixo);
        panelBaixo.setBounds(0, 50, 690, 420);

        setSize(new java.awt.Dimension(700, 507));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void preencherFormulario(){
   // NOI18N
        jTextFieldCodigo.setText(especialidade.getCodigo().toString());
        jTextFieldNomeEspecialidade.setText(especialidade.getNome());
    }
    
    private void preencherTitulo() {
          TituloLabel.setText("ESPECIALIDADE - " + operacao);
            if (operacao == OperacaoEnum.EDITAR){
            IconeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit32.png")));
            } else { 
                IconeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/plano-de-saude.png")));
            }
             
    }
    

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
       dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (operacao == OperacaoEnum.ADICIONAR){
            adicionar();
        }
        else{
            editar();
        }  
    }//GEN-LAST:event_jButtonSalvarActionPerformed
    
    private void adicionar(){
        Especialidade novaEspecialidade = new Especialidade();
               novaEspecialidade.setNome(jTextFieldNomeEspecialidade.getText());
               novaEspecialidade.setDescricao(jTextFieldDescEsp.getText());
       
        EspecialidadeDAO.gravar(novaEspecialidade);
        
        JOptionPane.showMessageDialog(
                this, 
                "Especialidade gravada com sucesso!", 
                "Especialiades",
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
    }
    
    private void editar() {
        especialidade.setNome(jTextFieldNomeEspecialidade.getText());
        especialidade.setDescricao(jTextFieldDescEsp.getText());
        
        EspecialidadeDAO.atualizar(especialidade);
         JOptionPane.showMessageDialog(
                this, 
                "Especialidade editada com sucesso!", 
                "Especialiades",
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
        
    }
    
    
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconeLabel;
    private javax.swing.JLabel TituloLabel;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelDescEsp;
    private javax.swing.JLabel jLabelNomeEspecialidade;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDescEsp;
    private javax.swing.JTextField jTextFieldNomeEspecialidade;
    private java.awt.Panel panelBaixo;
    // End of variables declaration//GEN-END:variables
}

