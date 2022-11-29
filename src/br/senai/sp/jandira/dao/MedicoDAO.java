/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
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

    public static void gravar(Medico e) { //CREATE
        medicos.add(e);
        // GRAVAR EM ARQUIVO
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
//            escritor.write(e.getMedicoSeparadoPorPontoEVirgula());
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
            atualizarArquivo();
        }
    }

    public static void atualizar(Medico medicoAtualizado) { //UPDATE
        for (Medico e : medicos) {
            if (e.getCodigo().equals(medicoAtualizado.getCodigo())) {
                medicos.set(medicos.indexOf(e), medicoAtualizado);
                break;
            }
            atualizarArquivo();
        }

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

                Medico e;
                e = new Medico(
                        Integer.valueOf(vetor[0]),
                        vetor[1],
                        vetor[2],
                        vetor[3]);

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
        String[][] dados = new String[medicos.size()][4];

        System.out.println("************* " + medicos.size());

        int i = 0;
        for (Medico e : medicos) {
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getCrm();
            dados[i][2] = e.getNome();
            dados[i][3] = e.getTelefone();

            i++;
        }
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;

    }
}
