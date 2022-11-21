package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Medico {

    //atributos
    private static int contador = 0;
    private String nome;
    private Especialidade[] especialidades;
    private String telefone;
    private String email;
    private String crm;
    private LocalDate dataDeNascimento;
    private Integer codigo;
    
     // Criação dos Construtores \\
    
    public Medico(Integer codigo ,String nome, String crm, String telefone,
            String email,LocalDate dataDeNascimento,
            Especialidade[] especialidades){
        
        this.codigo = codigo;
        this.contador = codigo;
        this.nome = nome;
        this.crm = crm;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
        this.telefone = telefone;
        this.especialidades = especialidades;
        gerarCodigo();
    } 
    
    public Medico(){
        gerarCodigo();
        
    }
    public Medico(Integer codigo, String nome, String crm, String telefone){
        this.codigo = codigo;
        this.nome = nome;
        this.crm = crm;
        this.telefone = telefone;
        gerarCodigo();
        
    }
    

    //metodos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEspecialidade(Especialidade[] especialidade) {
        this.especialidades = especialidade;
    }

    public Especialidade[] getEspecialidade() {
        return especialidades;
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
    public String getMedicoSeparadoPorPontoEVirgula() {
        return this.codigo + ";" + this.crm + ";" + this.nome + ";"
                + this.telefone + ";" + this.email + ";"
                + this.dataDeNascimento + ";" + this.especialidades;
    }

}
