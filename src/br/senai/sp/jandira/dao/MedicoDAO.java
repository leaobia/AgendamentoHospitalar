/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 22282176
 */
public class MedicoDAO {

    private final static String URL = "C:\\Users\\22282176\\JAVA ARQUIVO\\Medico.txt";
    private final static String URL_TEMP = "C:\\Users\\22282176\\JAVA ARQUIVO\\Medico-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<Medico> medicos = new ArrayList<>();
    
    // Criar segunda array list (essa vai ser somente as especialidades do médico
    
     public static ArrayList<Especialidade> apenasEspecialidadeDoMedico(String linha) {
        String[] vetor = linha.split(";");

        int codigoEspecialidade = 6;

        ArrayList<Especialidade> codigos = new ArrayList<>();
       
        while (codigoEspecialidade < vetor.length) {
            codigos.add(EspecialidadeDAO.getEspecialidade(Integer.valueOf(vetor[codigoEspecialidade])));
            codigoEspecialidade++;
        
        }
        return codigos;
    }

    public static void gravar(Medico e) { //CREATE
        medicos.add(e);
        // GRAVAR EM ARQUIVO
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            escritor.write(e.getMedicoSeparadoPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "ocorreu um erro");
        }
    }

    public static ArrayList<Medico> getMedicos() { //READ
        return medicos;
    }

    public static Medico getMedicos(Integer codigo) { //READ
        
        for (Medico e : medicos) {
            if (e.getCodigo().equals(codigo)) {
                System.out.println(e.getMedicoSeparadoPorPontoEVirgula());
                return e;
            }
        }

        return null;
    }

    private static void atualizarArquivo() {

        //PASSO 01 - Criar representação dos arquivos que serão manipulados
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {
            //Criar o arquivo temporário
            arquivoTemp.createNewFile();

            //Abrir o arquivo temporário para escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            /* Iterar (loop) na lista para adicionar as especialidades no arquivo
            temporário, exceto o registro que não queremos mais */
            for (Medico e : medicos) {
                bwTemp.write(e.getMedicoSeparadoPorPontoEVirgula());
                bwTemp.newLine();
            }

            bwTemp.close();

            //Excluir o arquivo atual
            arquivoAtual.delete();

            //Renomear o arquivo temporário
            arquivoTemp.renameTo(arquivoAtual);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void excluir(Integer codigo) { //DELETE
        for (Medico e : medicos) {
            if (e.getCodigo().equals(codigo)) {
                medicos.remove(e);
                break;
            }
        }
        atualizarArquivo();
    }

    public static void atualizar(Medico medicoAtualizado) { //UPDATE
        for (Medico e : medicos) {
            if (e.getCodigo().equals(medicoAtualizado.getCodigo())) {
                medicos.set(medicos.indexOf(e), medicoAtualizado);
                break;
                 
            }
            
        }
         atualizarArquivo();

    }

    public static void criarListaDeMedicos() {
        // DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            String linha = leitor.readLine();

            while (linha != null) {
                // transformar os dados da linha em especialidade
                //DateTimeFormatter barra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String[] vetor = linha.split(";");
                //Tranformando as informaçoes da linha em especialidade]
                String[] data = vetor[5].split("-"); //data

                Medico e;
                
//Integer codigo ,String nome, String crm, String telefone, String email,LocalDate dataDeNascimento                       
                e = new Medico(
                        
                        Integer.valueOf(vetor[0]),
                        vetor[2],
                        vetor[1],
                        vetor[3],
                        vetor[4],
                        LocalDate.of(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2])),
                        apenasEspecialidadeDoMedico(linha));
                        
                

                // Guardar na lista de especialidades
                medicos.add(e);
                
            

                //ler a proxima linha 
                linha = leitor.readLine();

            }
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao ler o arquivo");
        }

    }

    public static DefaultTableModel getMedicoModel() {
        String[] titulos = {"CÓDIGO", "CRM", "NOME DO MÉDICO", "TELEFONE"};
        String[][] dados = new String[medicos.size()][6];

        System.out.println("*************9999999999 " + medicos.size());
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        int i = 0;
        for (Medico e : medicos) {
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getCrm();
            dados[i][2] = e.getNome();
            dados[i][3] = e.getTelefone();
            dados[i][4] = e.getEmail();
            dados[i][5] = e.getDataNasc().format(formato);
          
           
            i++;
        }
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;
       

    }
    
    //Passo 2 - pegar a lista de especialidade do médico criando uma default list model
    
    public static DefaultListModel<Especialidade> getEspecialidadeMedicoModel() {

        DefaultListModel<Especialidade> especialidadesLista = new DefaultListModel<Especialidade>();
        
        try {
            
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();
            
            
            for (Especialidade sequenciaListaMedico : apenasEspecialidadeDoMedico(linha)) {
                especialidadesLista.addElement(sequenciaListaMedico);
            }
            
            leitor.close();
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro ao adicionar da lista do médico");
        }
        return especialidadesLista;
    }

}
