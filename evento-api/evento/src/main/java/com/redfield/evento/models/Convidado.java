package com.redfield.evento.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Convidado
{
	@Id
	private String rg;
	private String nomeConvidado;
	@ManyToOne
	private Evento evento;
	
	public String getNomeConvidado() {
		return nomeConvidado;
	}
	public void setNomeConvidado(String nome) {
		this.nomeConvidado = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	
	
	
	
}
