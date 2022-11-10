package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.ui.EspecialidadesPanel;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {

    private final static String URL = "C:\\Users\\22282176\\JAVA ARQUIVO\\Especialidade.txt";
    private final static Path PATH = Paths.get(URL);
    /*
    Essa classe será responsável pela persistência de dados 
    das especialidades, por exemplo, adicionar uma nova especialidade,
    excluir uma especialidade, etc.
     */
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    public static void gravar(Especialidade e) { //CREATE
        especialidades.add(e);

        // GRAVAR EM ARQUIVO
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            escritor.write(e.getEspecialidadeSeparadaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "ocorreu um erro");
        }
    }
    public static ArrayList<Especialidade> getEspecialidades() { //READ
        return especialidades;
    }

    public static Especialidade getEspecialidade(Integer codigo) { //READ
        for (Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                return e;
            }
        }

        return null;
    }

    public static void atualizar(Especialidade especialidadeAtualizada) { //UPDATE
        for (Especialidade e : especialidades) {
            if (e.getCodigo() == especialidadeAtualizada.getCodigo()) {
                especialidades.set(especialidades.indexOf(e), especialidadeAtualizada);
                break;
            }
        }

    }

    //instancia de um objeto
    public static void excluir(Integer codigo) { //DELETE
        for (Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                especialidades.remove(e);
                break;
            }
        }
    }

    //Criar uma lista de espeialidades
    public static void criarListaDeEspecialidade() {
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            String linha = leitor.readLine();
            while (linha != null){
                // Transformar dados da linha em uma especialidade
                String [] vetor = linha.split(";");
                Especialidade e = new Especialidade(vetor[1], 
                        vetor[2], 
                        Integer.valueOf(vetor[0]));
                
                // Guardar a especialidade na lista
                especialidades.add(e);
                // ler a próxima linha
                linha = leitor.readLine();
            }
            leitor.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu erro ao ler o arquivo");
        }}
        

    public static DefaultTableModel getEspecialidadesModel() {
        String[] titulos = {"CÓDIGO", "NOME DA ESPECIALIDADE", "DESCRIÇÃO"};
        String[][] dados = new String[especialidades.size()][3];

        int i = 0;
        for (Especialidade e : especialidades) {
            dados[i][0] = e.getCodigo().toString();
            dados[i][2] = e.getDescricao();
            dados[i][1] = e.getNome();

            i++;
        }
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;

    }

}
