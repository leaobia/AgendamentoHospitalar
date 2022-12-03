package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {

    //atributos
    private static int contador = 0;
    private Integer codigo;
    private String nome;
    private String descricao;

    //Construtores da classe
    public Especialidade(String nome) {
        this.nome = nome;
        gerarCodigo();
//      JOptionPane.showMessageDialog(null, "Oie!!! Eu sou o construtor!");

    }

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.contador++;
        this.codigo = contador;
    }
        public Especialidade(String nome, String descricao, Integer codigo) {
        this.nome = nome;
        this.descricao = descricao;
        this.codigo = codigo;
       
    }
    public Especialidade() { //Contrutor Default (padrão)
        gerarCodigo();
//      JOptionPane.showMessageDialog(null, "Utilizando o construtor default!!");
    }

    // Método gerarCodigo
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

    public void setNome(String nome) {
     
            this.nome = nome;
    
    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        
            this.descricao = descricao;
     

    }

    public String getDescricao() {
        return descricao;
    }
    public String getEspecialidadeSeparadaPorPontoEVirgula(){
            return this.codigo + ";" + this.nome + ";" + this.descricao ;
            }
}
