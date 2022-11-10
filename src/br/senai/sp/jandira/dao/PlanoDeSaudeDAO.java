/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
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

    private final static String URL = "C:\\Users\\22282176\\JAVA ARQUIVO\\PlanoDeSaude.txt";
    private final static Path PATH = Paths.get(URL);

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

    public static void atualizar(PlanoDeSaude planoAtualizado) { //UPDATE
        for (PlanoDeSaude e : planoDeSaude) {
            if (e.getCodigo() == planoAtualizado.getCodigo()) {
                planoDeSaude.set(planoDeSaude.indexOf(e), planoAtualizado);
                break;
            }
        }

    }

    public static void excluir(Integer codigo) { //DELETE
        for (PlanoDeSaude e : planoDeSaude) {
            if (e.getCodigo() == codigo) {
                planoDeSaude.remove(e);
                break;
            }
        }
    }

 

    public static void criarListaDePlanos() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        try {
//            BufferedReader leitor = Files.newBufferedReader(PATH);
//            String linha = leitor.readLine();
//             while (linha != null){
//                String [] vetor = linha.split(";");
//                PlanoDeSaude e = new PlanoDeSaude(vetor [2], vetor[3],LocalDate.parse(vetor[4], formatador), vetor[1], Integer.valueOf(vetor[0]));}
//        } catch (IOException e) {
//        }


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
