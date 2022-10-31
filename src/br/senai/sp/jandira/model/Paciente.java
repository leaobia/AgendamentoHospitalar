package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Paciente {
    // atributos

    private static int contador = 0;
    private Integer codigo;
    private String nome;
    private LocalDate dataNascimento;
    private String telefone;
    private Endereco endereco;
    private String rg;
    private String cpf;
    private PlanoDeSaude planoDeSaude;
    private static int quantidade;

    // construtor 
     
    public Paciente(String nome) {
        this.nome = nome;
        this.quantidade++;
        gerarCodigo();
    }

    public Paciente(String nome,LocalDate dataNascimento ) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.quantidade++;
        gerarCodigo();
    }
        public Paciente(String nome, LocalDate dataNascimento, String telefone) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.quantidade++;
        gerarCodigo();
    }
    
    public Paciente() {
        this.quantidade++;
        gerarCodigo();
    }
    // metodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public PlanoDeSaude getPlanoDeSaude() {
        return planoDeSaude;
    }

    public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
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

}
