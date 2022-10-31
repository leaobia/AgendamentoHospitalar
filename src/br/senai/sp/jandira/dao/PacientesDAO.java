/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 22282176
 */
public class PacientesDAO {

    private static ArrayList<Paciente> paciente = new ArrayList<>();

    public static void gravar(Paciente e) { //CREATE
        paciente.add(e);
    }

    public static ArrayList<Paciente> getPaciente() { //READ
        return paciente;
    }

    public static Paciente getPaciente(Integer codigo) { //READ
        for (Paciente e : paciente) {
            if (e.getCodigo() == codigo) {
                return e;
            }
        }

        return null;
    }

    public static void atualizar(Paciente pacienteAtualizado) { //UPDATE
        for (Paciente e : paciente) {
            if (e.getCodigo() == pacienteAtualizado.getCodigo()) {
                paciente.set(paciente.indexOf(e), pacienteAtualizado);
                break;
            }
        }

    }

    public static void excluir(Integer codigo) { //DELETE
        for (Paciente e : paciente) {
            if (e.getCodigo() == codigo) {
                paciente.remove(e);
                break;
            }
        }
    }

    public static void criarListaDePlanos() {

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Paciente e1 = new Paciente("Bianca Pereira Leão", LocalDate.of(2005, 8, 11), "4618-0188");
        Paciente e2 = new Paciente("Celso Furtado", LocalDate.of(1980, 3, 9), "95866-7823");
        Paciente e3 = new Paciente("Otávio Alfonso", LocalDate.of(2007, 1, 11), "9567-8245");
        Paciente e4 = new Paciente("Cátia Lopes", LocalDate.of(1983, 5, 01), "4623-0224");

        paciente.add(e1);
        paciente.add(e2);
        paciente.add(e3);
        paciente.add(e4);

    }

     public static DefaultTableModel getPacientesModel() {
        String[] titulos = {"CÓDIGO", "NOME DO PACIENTE", "DATA DE NASCIMENTO", "TELEFONE"};;;
        String[][] dados = new String[paciente.size()][4];


        int i = 0;
        for (Paciente e : paciente) {
   
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getNome();
            dados[i][3] = e.getTelefone();
            DateTimeFormatter barra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            dados[i][2] = e.getDataNascimento().format(barra);

            i++;
        }
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;

    }
}
