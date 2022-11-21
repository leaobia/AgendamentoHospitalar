/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

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

}
