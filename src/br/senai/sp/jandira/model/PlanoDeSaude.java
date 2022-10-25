package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class PlanoDeSaude {

    //atributos
    private static int contador = 0;
    private Integer codigo;
    private String operadora;
    private String categoria;
    private String numero;
    private LocalDate validade;
    private static int quantidade; //1 porque cada objeto tem sua própria quantidade
//	private int quantidade; //3 

    //construtor
    public PlanoDeSaude(String operadora) {
        this.operadora = operadora;
        this.quantidade++;
        gerarCodigo();
    }

    public PlanoDeSaude(String operadora, String categoria) {
        this.operadora = operadora;
        this.categoria = categoria;
        this.quantidade++;
        gerarCodigo();
    }
        public PlanoDeSaude(String operadora, String categoria, LocalDate validade) {
        this.operadora = operadora;
        this.categoria = categoria;
        this.validade = validade;
        this.quantidade++;
        gerarCodigo();
    }
    
    public PlanoDeSaude() {
        this.quantidade++;
        gerarCodigo();
    }

    //metodos
    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public LocalDate getValidade() {
        return validade;
    }

    //não é necessario o set porque ele vai usar o Plano de saude
    //public int getQuantidade()
    public static int getQuantidade() {
        return quantidade;
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
