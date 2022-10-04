package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {

    //atributos
    private static int contador = 99;
    private Integer codigo;
    private String nome;
    private String descricao;

    //Construtores da classe
    public Especialidade(String nome) {
        this.nome = nome;
        this.contador++;
        this.codigo = contador;
//      JOptionPane.showMessageDialog(null, "Oie!!! Eu sou o construtor!");

    }

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.contador++;
        this.codigo = contador;
    }

    public Especialidade() { //Contrutor Default (padrão)
        this.contador++;
        this.codigo = contador;
//      JOptionPane.showMessageDialog(null, "Utilizando o construtor default!!");
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
        if (nome.length() >= 3) {
            this.nome = nome;
        } else {
            JOptionPane.showMessageDialog(null, nome + " não é um nome valido!\nDeve conter pelo menos 3 letras!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        if (descricao.length() >= 10) {
            this.descricao = descricao;
        } else {
            JOptionPane.showMessageDialog(null, descricao + " A Descrição deve conter pelo menos 10 letras!");
        }

    }

    public String getDescricao() {
        return descricao;
    }

}
