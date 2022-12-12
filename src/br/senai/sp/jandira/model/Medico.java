package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;

public class Medico {

    //atributos
    private static int contador = 0;
    private String nome;
    private ArrayList<Especialidade> especialidades;
    private String telefone;
    private String email;
    private String crm;
    private LocalDate dataDeNascimento;
    private Integer codigo;
    private DateTimeFormatter formatador;
    private String dataFormatada;

    // Criação dos Construtores \\
    public Medico(Integer codigo, String nome, String crm, String telefone,
            String email, LocalDate dataDeNascimento, ArrayList<Especialidade> especialidades
    ) {
        formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dataFormatada = dataDeNascimento.format(formatador);
        this.codigo = codigo;
        this.contador = codigo;
        this.nome = nome;
        this.crm = crm;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
        this.especialidades = especialidades;
        this.telefone = telefone;

        //gerarCodigo();
    }

    public Medico() {
        gerarCodigo();

    }

    public Medico(Integer codigo, String nome, String crm, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.crm = crm;
        this.telefone = telefone;
        gerarCodigo();

    }

    //metodos
    public String getDataFormatada() {
        return dataFormatada;
    }

    public void setDataFormatada(String data) {
        this.dataFormatada = data;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Especialidade> getEspecialidades() {
        return especialidades;

    }

    public void setEspecialidades(ArrayList<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }

    public void setDataNasc(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public LocalDate getDataNasc() {
        return dataDeNascimento;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;

    }

    //metodos de acesso aos atributos
    public int getContador() {
        return contador;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void set(int indexOf, Medico medicoAtualizado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
        public String getCodigosEspecialidades() {
        String codigosEspecialidades = "";
        for (Especialidade especialidade : especialidades) {
            codigosEspecialidades += especialidade.getCodigo() + "&";
        }
        return codigosEspecialidades;
    }

    public String getMedicoSeparadoPorPontoEVirgula() {
        return this.codigo + ";"
                + this.crm + ";"
                + this.nome + ";"
                + this.email + ";"
                + this.telefone + ";"
                + this.dataDeNascimento +";"
                +getCodigosEspecialidades();
    }

}
