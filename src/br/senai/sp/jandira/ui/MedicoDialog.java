/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Especialidade;
import java.time.LocalDate;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import com.sun.source.tree.BreakTree;
import java.awt.Component;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;

import javax.swing.JOptionPane;

/**
 *
 * @author 22282176
 */
public class MedicoDialog extends javax.swing.JDialog {

    private Medico medico;
    private OperacaoEnum operacao;
    public static ArrayList<Especialidade> especialidadesDoMedico = new ArrayList<>();

    /**
     * Creates new form MedicoDialog
     *
     * @param parent
     * @param operacao
     */
    public MedicoDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }

    public MedicoDialog(java.awt.Frame parent, boolean modal, Medico e, OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        medico = e;
        preencherFormulario();
        this.operacao = operacao;
        preencherTitulo();
        adicionandoNaList();
    }

    public MedicoDialog(java.awt.Frame parent, boolean modal, OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
        adicionandoNaList();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void preencherFormulario() {
        // NOI18N
        jTextFieldCodigo.setText(medico.getCodigo().toString());
        jTextFieldCRM.setText(medico.getCrm());
        jTextFieldNomeMedico.setText(medico.getNome());
        jTextFieldTelefone.setText(medico.getTelefone());
        jTextFieldEmail.setText(medico.getEmail());
        jTextFieldDataNasc.setText(medico.getDataNasc().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
    
    private void preencherTitulo() {
        TituloLabel.setText("MÉDICO - " + operacao);
        if (operacao == OperacaoEnum.EDITAR) {
            IconeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit32.png")));
        } else {
            IconeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/plano-de-saude.png")));
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHeader = new javax.swing.JPanel();
        TituloLabel = new javax.swing.JLabel();
        IconeLabel = new javax.swing.JLabel();
        panelBaixo = new java.awt.Panel();
        jPanelContent = new javax.swing.JPanel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelNomeMédico = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldDataNasc = new javax.swing.JFormattedTextField();
        jLabelDataNasc = new javax.swing.JLabel();
        jTextFieldCRM = new javax.swing.JTextField();
        jTextFieldNomeMedico = new javax.swing.JTextField();
        jTextFieldTelefone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListEspecialidadesDoMedico = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListEspecialidades = new javax.swing.JList<>();
        jButtonCancelar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jButtonAvancar = new javax.swing.JButton();
        jLabelCodigo1 = new javax.swing.JLabel();
        jLabelCrm = new javax.swing.JLabel();
        jLabelEspecialidadesDoMedico = new javax.swing.JLabel();
        jLabelTelefone1 = new javax.swing.JLabel();
        jLabelListaDeEspecialidades = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(693, 480));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanelHeader.setBackground(new java.awt.Color(153, 0, 153));
        jPanelHeader.setLayout(null);

        TituloLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        TituloLabel.setForeground(new java.awt.Color(255, 255, 255));
        TituloLabel.setText("MÉDICO - ADICIONAR");
        jPanelHeader.add(TituloLabel);
        TituloLabel.setBounds(100, 10, 320, 30);

        IconeLabel.setBackground(new java.awt.Color(255, 255, 255));
        IconeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/Button-Adicionar.png"))); // NOI18N
        jPanelHeader.add(IconeLabel);
        IconeLabel.setBounds(20, 0, 60, 50);

        getContentPane().add(jPanelHeader);
        jPanelHeader.setBounds(0, 0, 700, 50);

        panelBaixo.setBackground(new java.awt.Color(204, 204, 255));
        panelBaixo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelBaixo.setPreferredSize(new java.awt.Dimension(750, 300));
        panelBaixo.setLayout(null);

        jPanelContent.setBackground(new java.awt.Color(204, 204, 255));
        jPanelContent.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do Médico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(153, 0, 153))); // NOI18N
        jPanelContent.setForeground(new java.awt.Color(255, 255, 255));
        jPanelContent.setLayout(null);

        jLabelEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelEmail.setText("Email");
        jPanelContent.add(jLabelEmail);
        jLabelEmail.setBounds(230, 120, 290, 30);

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.setBackground(new java.awt.Color(255, 204, 204));
        jTextFieldCodigo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelContent.add(jTextFieldCodigo);
        jTextFieldCodigo.setBounds(10, 90, 100, 30);

        jLabelNomeMédico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelNomeMédico.setText("Nome do Médico");
        jPanelContent.add(jLabelNomeMédico);
        jLabelNomeMédico.setBounds(240, 50, 280, 40);

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

        jTextFieldEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        jPanelContent.add(jTextFieldEmail);
        jTextFieldEmail.setBounds(230, 150, 200, 30);

        jTextFieldDataNasc.setColumns(8);
        try {
            jTextFieldDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldDataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataNascActionPerformed(evt);
            }
        });
        jPanelContent.add(jTextFieldDataNasc);
        jTextFieldDataNasc.setBounds(440, 150, 160, 30);

        jLabelDataNasc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelDataNasc.setText("Data de Nascimento");
        jPanelContent.add(jLabelDataNasc);
        jLabelDataNasc.setBounds(440, 120, 200, 30);

        jTextFieldCRM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextFieldCRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCRMActionPerformed(evt);
            }
        });
        jPanelContent.add(jTextFieldCRM);
        jTextFieldCRM.setBounds(130, 90, 90, 30);

        jTextFieldNomeMedico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextFieldNomeMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeMedicoActionPerformed(evt);
            }
        });
        jPanelContent.add(jTextFieldNomeMedico);
        jTextFieldNomeMedico.setBounds(240, 90, 360, 30);

        jTextFieldTelefone.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefoneActionPerformed(evt);
            }
        });
        jPanelContent.add(jTextFieldTelefone);
        jTextFieldTelefone.setBounds(10, 150, 210, 30);

        jScrollPane1.setViewportView(jListEspecialidadesDoMedico);

        jPanelContent.add(jScrollPane1);
        jScrollPane1.setBounds(290, 220, 190, 130);

        jScrollPane2.setViewportView(jListEspecialidades);

        jPanelContent.add(jScrollPane2);
        jScrollPane2.setBounds(10, 220, 190, 130);

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
        jButtonCancelar.setBounds(500, 320, 50, 40);

        jButtonVoltar.setBackground(new java.awt.Color(255, 102, 204));
        jButtonVoltar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonVoltar.setText("<");
        jButtonVoltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        jPanelContent.add(jButtonVoltar);
        jButtonVoltar.setBounds(220, 300, 60, 50);

        jButtonAvancar.setBackground(new java.awt.Color(255, 204, 255));
        jButtonAvancar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonAvancar.setText(">");
        jButtonAvancar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAvancarActionPerformed(evt);
            }
        });
        jPanelContent.add(jButtonAvancar);
        jButtonAvancar.setBounds(220, 240, 60, 50);

        jLabelCodigo1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelCodigo1.setText("Código");
        jPanelContent.add(jLabelCodigo1);
        jLabelCodigo1.setBounds(10, 50, 110, 40);

        jLabelCrm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelCrm.setText("CRM");
        jPanelContent.add(jLabelCrm);
        jLabelCrm.setBounds(130, 50, 290, 40);

        jLabelEspecialidadesDoMedico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelEspecialidadesDoMedico.setText("Especialidades do médico:");
        jPanelContent.add(jLabelEspecialidadesDoMedico);
        jLabelEspecialidadesDoMedico.setBounds(290, 190, 290, 25);

        jLabelTelefone1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelTelefone1.setText("Telefone");
        jPanelContent.add(jLabelTelefone1);
        jLabelTelefone1.setBounds(10, 125, 290, 25);

        jLabelListaDeEspecialidades.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelListaDeEspecialidades.setText("Lista de especialidades:");
        jPanelContent.add(jLabelListaDeEspecialidades);
        jLabelListaDeEspecialidades.setBounds(10, 190, 220, 25);

        panelBaixo.add(jPanelContent);
        jPanelContent.setBounds(30, 20, 620, 370);

        getContentPane().add(panelBaixo);
        panelBaixo.setBounds(0, 50, 700, 430);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //evento do button salvar
    private ArrayList<Especialidade> pegarEspecialidades(JList<String> lista) {
        int tamanho = lista.getModel().getSize();
        
        ArrayList<Especialidade> listaNova = new ArrayList();
        for (int i = 0; i < tamanho; i++) {
            int codigo = Integer.valueOf(lista.getModel().getElementAt(i).substring(0, 1));// 1 - Cardiologia
            Especialidade e = EspecialidadeDAO.getEspecialidade(codigo);
            listaNova.add(e);
        }
        
        String a = "Senai";
        System.out.println(a.substring(1, 3));
        
        return listaNova;
    }
    
       
    private void adicionar() {
        CharSequence s = " ";
        
        if (jTextFieldCRM.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite o CRM ", "Erro.",
                    JOptionPane.ERROR_MESSAGE);
            jTextFieldCRM.requestFocus();
        } else if (jTextFieldNomeMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite o nome do médico ", "Erro.",
                    JOptionPane.ERROR_MESSAGE);
            jTextFieldNomeMedico.requestFocus();
        } else if (jTextFieldTelefone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite o telefone do médico ", "Erro.",
                    JOptionPane.ERROR_MESSAGE);
            jTextFieldTelefone.requestFocus();
        } else if (jTextFieldEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite o email do médico ", "Erro.",
                    JOptionPane.ERROR_MESSAGE);
            jTextFieldEmail.requestFocus();
        } else if (jTextFieldDataNasc.getText().contains(s) ==true) {
            JOptionPane.showMessageDialog(this, "Digite a data de nascimento médico ", "Erro.",
                    JOptionPane.ERROR_MESSAGE);
            jTextFieldDataNasc.requestFocus();

        } else {

            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            Medico medico = new Medico();
            medico.setNome(jTextFieldNomeMedico.getText());
            medico.setCrm(jTextFieldCRM.getText());
            medico.setTelefone(jTextFieldTelefone.getText());
            medico.setEmail(jTextFieldEmail.getText());
            medico.setDataNasc(LocalDate.parse(jTextFieldDataNasc.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            medico.setEspecialidades(pegarEspecialidades(jListEspecialidadesDoMedico));
            
            MedicoDAO.gravar(medico);
        JOptionPane.showMessageDialog(
                this,
                "Médico gravado com sucesso!",
                "Médico",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
            
        }
        
    }

    
   
    private void editar(){
        CharSequence s = " ";
                if (jTextFieldCRM.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite o CRM ", "Erro.",
                    JOptionPane.ERROR_MESSAGE);
            jTextFieldCRM.requestFocus();
        } else if (jTextFieldNomeMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite o nome do médico ", "Erro.",
                    JOptionPane.ERROR_MESSAGE);
            jTextFieldNomeMedico.requestFocus();
        } else if (jTextFieldTelefone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite o telefone do médico ", "Erro.",
                    JOptionPane.ERROR_MESSAGE);
            jTextFieldTelefone.requestFocus();
        } else if (jTextFieldEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite o email do médico ", "Erro.",
                    JOptionPane.ERROR_MESSAGE);
            jTextFieldEmail.requestFocus();
        } else if (jTextFieldDataNasc.getText().contains(s) == true) {
            JOptionPane.showMessageDialog(this, "Digite a data de nascimento médico neste formato :(##) #####-####.\" ", "Erro.",
                    JOptionPane.ERROR_MESSAGE);
            jTextFieldDataNasc.requestFocus();

        } else {

            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
           
            medico.setNome(jTextFieldNomeMedico.getText());
            medico.setCrm(jTextFieldCRM.getText());
            medico.setTelefone(jTextFieldTelefone.getText());
            medico.setEmail(jTextFieldEmail.getText());
            medico.setDataNasc(LocalDate.parse(jTextFieldDataNasc.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            medico.setEspecialidades(pegarEspecialidades(jListEspecialidadesDoMedico));
            
             MedicoDAO.atualizar(medico);
        JOptionPane.showMessageDialog(
                this,
                "Médico gravado com sucesso!",
                "Médico",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
        }      
    }
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

        if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
        }   

    }//GEN-LAST:event_jButtonSalvarActionPerformed




    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldCRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCRMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCRMActionPerformed

    private void jTextFieldDataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDataNascActionPerformed

    private void jTextFieldNomeMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeMedicoActionPerformed

    private void jTextFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefoneActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
//         DefaultListModel<String> listaEspecialidadeMedico = new DefaultListModel<>();
//        for (Especialidade especialidade : EspecialidadeDAO.getEspecialidades()){
//            listaEspecialidadeMedico.removeElement( jListEspecialidadesDoMedico.getSelectedValue());
//            break;
//        }
//        jListEspecialidadesDoMedico.setModel(listaEspecialidadeMedico); 
//    if (jListEspecialidadesDoMedico.isSelectionEmpty() == false) {
//
//            ArrayList<String> novaListaMedicos = new ArrayList<>();
//             
//            int tamanho = jListEspecialidadesDoMedico.getModel().getSize();
//           for (int i = 0; i > tamanho; i++) {
//               novaListaMedicos.add(jListEspecialidadesDoMedico.getModel().getElementAt(i));
//                novaListaMedicos.remove(jListEspecialidadesDoMedico.getSelectedValue());
//            
//                
//                DefaultListModel<String> listaEspecialidadeMedicoModel = new DefaultListModel<>();
//              
//                for (String acaoBotaoVoltar : novaListaMedicos) {
//                    listaEspecialidadeMedicoModel.addElement(acaoBotaoVoltar);
//                }
//                jListEspecialidadesDoMedico.setModel(listaEspecialidadeMedicoModel);
//           
//           }
//            
              if (jListEspecialidadesDoMedico.isSelectionEmpty() == false) {
            ArrayList<String> novaListaMedicos = new ArrayList<>();
            int tamanho = jListEspecialidadesDoMedico.getModel().getSize();
            for (int i = 0; i < tamanho; i++) {
                novaListaMedicos.add(jListEspecialidadesDoMedico.getModel().getElementAt(i));
            }
            novaListaMedicos.remove(jListEspecialidadesDoMedico.getSelectedValue());

            DefaultListModel<String> listaEspecialidadeMedicoModel = new DefaultListModel<String>();
            for (String acaoVoltar : novaListaMedicos) {
                listaEspecialidadeMedicoModel.addElement(acaoVoltar);
            }
            jListEspecialidadesDoMedico.setModel(listaEspecialidadeMedicoModel);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Não contem nenhuma especialidade na lista de médicos",
                    "Editando Médico",
                    JOptionPane.WARNING_MESSAGE, null);
        }
    
    


                                                  
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAvancarActionPerformed
        
//        for (Especialidade especialidade : EspecialidadeDAO.getEspecialidades()){
//            listaEspecialidadeMedico.addElement( jListEspecialidadesDoMedicoo.getSelectedValue());
//            break;
//        }
//        jListEspecialides.setModel(listaEspecialidadeMedico); 

               
//               String medicoEspecialidade = jListEspecialidades.getSelectedValue();
//               if(jListEspecialidades.getSelectedIndex()==-1){
//                   JOptionPane.showMessageDialog(jPanelContent, "Nenhum item selecionado", "Opps", 1);
//               }else{
//                   int[] value = jListEspecialidades.getSelectedIndices();
//                   
//                   listaEspecialidadeMedicoModel.addElement(medicoEspecialidade);
//                   jListEspecialidadesDoMedico.setModel(listaEspecialidadeMedicoModel);
//               
//             if (EspecialidadeDAO.getListaEspecialidadeModel().getSize() !=0) {
//                 for(int i=0;i<value.length;i++)
//                   EspecialidadeDAO.getListaEspecialidadeModel().removeElementAt(value[i]);
//                }
             

//                jListEspecialidadesDoMedicoo.setModel( EspecialidadeDAO.getListaEspecialidadeModel());
//                
//                listaEspecialidadeMedicoModel.addElement(medicoEspecialidade);
//                jListEspecialides.setModel(listaEspecialidadeMedicoModel);
//                
//                if (EspecialidadeDAO.getListaEspecialidadeModel().getSize() !=0) {
//                    EspecialidadeDAO.getListaEspecialidadeModel().removeElementAt(value);
//                }
//                jListEspecialidadesDoMedicoo.setModel( EspecialidadeDAO.getListaEspecialidadeModel());

         if (jListEspecialidades.isSelectionEmpty() == false) {

            ArrayList<String> novaLista = new ArrayList<>();
             
            int tamanho = jListEspecialidadesDoMedico.getModel().getSize();
            for (int i = 0; i < tamanho; i++) {
                novaLista.add(jListEspecialidadesDoMedico.getModel().getElementAt(i));
            }

            if (novaLista.contains(jListEspecialidades.getSelectedValue()) == false) {
                novaLista.add(jListEspecialidades.getSelectedValue());
                
                DefaultListModel<String> listaEspecialidadeMedicoModel = new DefaultListModel<>();
              
                for (String acaoBotaoAvancar : novaLista) {
                    listaEspecialidadeMedicoModel.addElement(acaoBotaoAvancar);
                }
                jListEspecialidadesDoMedico.setModel(listaEspecialidadeMedicoModel);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Você não pode adicionar uma especialidade já cadastrada!",
                        " Médico",
                        JOptionPane.WARNING_MESSAGE, null);
            }

        } else {
            JOptionPane.showMessageDialog(this,
                    "Selecione especialidade!",
                    " Médico",
                    JOptionPane.WARNING_MESSAGE, null);
        }


                
    }//GEN-LAST:event_jButtonAvancarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconeLabel;
    private javax.swing.JLabel TituloLabel;
    private javax.swing.JButton jButtonAvancar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelCodigo1;
    private javax.swing.JLabel jLabelCrm;
    private javax.swing.JLabel jLabelDataNasc;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEspecialidadesDoMedico;
    private javax.swing.JLabel jLabelListaDeEspecialidades;
    private javax.swing.JLabel jLabelNomeMédico;
    private javax.swing.JLabel jLabelTelefone1;
    private javax.swing.JList<String> jListEspecialidades;
    private javax.swing.JList<String> jListEspecialidadesDoMedico;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldCRM;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JFormattedTextField jTextFieldDataNasc;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNomeMedico;
    private javax.swing.JTextField jTextFieldTelefone;
    private java.awt.Panel panelBaixo;
    // End of variables declaration//GEN-END:variables
 private void adicionandoNaList(){ 
        jListEspecialidades.setModel(EspecialidadeDAO.getListaEspecialidadeModel());       
        
}


 
// primeiro evento


// segundo evento


}
