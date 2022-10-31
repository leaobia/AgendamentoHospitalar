/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senai.sp.jandira.dao;


import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 22282176
 */
public class PlanoDeSaudeDAO {
    private static ArrayList<PlanoDeSaude> planoDeSaude = new ArrayList<>();

    public static void gravar(PlanoDeSaude e) { //CREATE
        planoDeSaude.add(e);
    }

    public static ArrayList<PlanoDeSaude> getPlanos() { //READ
        return planoDeSaude;
    }

    public static PlanoDeSaude getPlanos (Integer codigo) { //READ
        for (PlanoDeSaude e : planoDeSaude) {
            if (e.getCodigo() == codigo) {
                return e;
            }
        }

        return null;
    }

    public static void atualizar(PlanoDeSaude planoAtualizado) { //UPDATE
        for ( PlanoDeSaude e : planoDeSaude) {
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
           
        PlanoDeSaude e1 = new PlanoDeSaude("Animed", "Prata",LocalDate.of(2028, 5, 12),"198");
        PlanoDeSaude e2 = new PlanoDeSaude("Notredame", "bronze", LocalDate.of(2028, 5, 12),"225");
        PlanoDeSaude e3 = new PlanoDeSaude("Amil", "Ouro", LocalDate.of(2028, 2, 10),"332");
        PlanoDeSaude e4 = new PlanoDeSaude("Bradesco Saúde", "Diamantes", LocalDate.of(2023, 3, 1),"405");
       
 
        planoDeSaude.add(e1);
        planoDeSaude.add(e2);
        planoDeSaude.add(e3);
        planoDeSaude.add(e4);
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


