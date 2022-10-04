package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Agenda {
	
	//atributos
	private LocalDate dataDaConsulta;
	private LocalTime horaDaConsulta;
	private Paciente paciente;
	private Medico medico;
	private Especialidade especialidade;
	private Endereco endereco;
	
	//metodos
	public void setDataDaConsulta(LocalDate dataDaConsulta) {
		this.dataDaConsulta = dataDaConsulta;
	}
	public LocalDate getDataDaConsulta() {
		return dataDaConsulta;
	}
	
	
	public void setHoraDaConsulta(LocalTime horaDaConsulta) {
		this.horaDaConsulta = horaDaConsulta;
	}
	public LocalTime getHoraDaConsulta() {
		return horaDaConsulta;
	}
	
	
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	
	
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Medico getMedico() {
		return medico;
	}
	
	
	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}
	public Especialidade getEspecialidade() {
		return especialidade;
	}
	
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	
	
}
