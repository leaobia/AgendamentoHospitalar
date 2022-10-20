/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senai.sp.jandira.dao;


import br.senai.sp.jandira.model.PlanoDeSaude;
import java.util.ArrayList;
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

    public static ArrayList<PlanoDeSaude> getEspecialidades() { //READ
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
        
        PlanoDeSaude e1 = new PlanoDeSaude("Animed", "Prata");
        PlanoDeSaude e2 = new PlanoDeSaude("Notredame", "bronze");
        PlanoDeSaude e3 = new PlanoDeSaude("Amil", "Ouro");
        PlanoDeSaude e4 = new PlanoDeSaude("Bradesco Saúde", "Diamantes");
       
 
        planoDeSaude.add(e1);
        planoDeSaude.add(e2);
        planoDeSaude.add(e3);
        planoDeSaude.add(e4);
    }

    public static DefaultTableModel getPlanosModel() {
        String[] titulos = {"CÓDIGO", "NOME DO PLANO", "CATEGORIA"};
        String[][] dados = new String[planoDeSaude.size()][3];

        int i = 0;
        for (PlanoDeSaude e : planoDeSaude) {
            dados[i][0] = e.getCodigo().toString();
            dados[i][2] = e.getOperadora();
            dados[i][1] = e.getCategoria();

            i++;
        }
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;

    }

}
