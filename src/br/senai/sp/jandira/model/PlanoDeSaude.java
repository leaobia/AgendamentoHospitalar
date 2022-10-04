package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class PlanoDeSaude {

	//atributos
	private String operadora;
	private String categoria;
	private String numero;
	private LocalDate Validade;
	private static int quantidade; //1 porque cada objeto tem sua própria quantidade
//	private int quantidade; //3 
	
	
	//construtor
	public PlanoDeSaude (String operadora) {
		this.operadora = operadora;
		this.quantidade++;
	}
	
	public PlanoDeSaude () {
		this.quantidade++;
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
		Validade = validade;
	}
	public LocalDate getValidade() {
		return Validade;
	}
	
	
	//não é necessario o set porque ele vai usar o Plano de saude
	//public int getQuantidade()
	public static int getQuantidade() {
		return quantidade;
	}
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
