/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;
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
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 22282176
 */
public class PlanoDeSaudeDAO {

    private final static String URL = "C:\\Users\\bianc\\JAVA ARQUIVO\\PlanoDeSaude.txt";
    private final static String URL_TEMP = "C:\\Users\\bianc\\JAVA ARQUIVO\\PlanoDeSaude-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<PlanoDeSaude> planoDeSaude = new ArrayList<>();

    public static void gravar(PlanoDeSaude e) { //CREATE
        planoDeSaude.add(e);
        // GRAVAR EM ARQUIVO
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            escritor.write(e.getPlanoDeSaudeSeparadoPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "ocorreu um erro");
        }
    }

    public static ArrayList<PlanoDeSaude> getPlanos() { //READ
        return planoDeSaude;
    }

    public static PlanoDeSaude getPlanos(Integer codigo) { //READ
        for (PlanoDeSaude e : planoDeSaude) {
            if (e.getCodigo() == codigo) {
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
            for(PlanoDeSaude e : planoDeSaude){
                bwTemp.write(e.getPlanoDeSaudeSeparadoPorPontoEVirgula());
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
        for (PlanoDeSaude e : planoDeSaude) {
            if (e.getCodigo().equals(codigo)) {
                planoDeSaude.remove(e);
                break;
            }
            atualizarArquivo();
        }
    }

     public static void atualizar(PlanoDeSaude planoAtualizado) { //UPDATE
        for (PlanoDeSaude e : planoDeSaude) {
            if (e.getCodigo().equals(planoAtualizado.getCodigo())) {
                planoDeSaude.set(planoDeSaude.indexOf(e), planoAtualizado);
                break;
            }
            atualizarArquivo();
        }

    }

 

    public static void criarListaDePlanos() {
       // DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            String linha = leitor.readLine();
            
            while(linha != null){
                // transformar os dados da linha em especialidade
                //DateTimeFormatter barra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String[]vetor = linha.split(";");
               
                String[] data = vetor[4].split("-");
                       
                PlanoDeSaude e;
                e = new PlanoDeSaude(
                        
                        vetor[1],
                        vetor[2],
                        LocalDate.of(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2])),
                        vetor[4],
                        Integer.valueOf(vetor[0]));
                
     
                // Guardar na lista de especialidades
                planoDeSaude.add(e);
                
                //ler a proxima linha 
                linha = leitor.readLine();
                
            }
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao ler o arquivo");
        }
        


    }

    public static DefaultTableModel getPlanosModel() {
        String[] titulos = {"CÓDIGO", "NOME DO PLANO", "CATEGORIA", "NÚMERO DO CARTÃO", "VALIDADE"};;;
        String[][] dados = new String[planoDeSaude.size()][5];

        System.out.println("************* " + planoDeSaude.size());

        int i = 0;
        for (PlanoDeSaude e : planoDeSaude) {
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getOperadora();
            dados[i][2] = e.getCategoria();
            dados[i][3] = e.getNumero();
            DateTimeFormatter barra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            dados[i][4] = e.getValidade().format(barra);

            i++;
        }
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;

    }
}
