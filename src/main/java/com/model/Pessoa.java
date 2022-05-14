package com.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)



public class Pessoa {
	
	String hash;
	String nome;
	Integer idade;
	Integer doses;
	public Boolean covid;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Integer getDoses() {
		return doses;
	}
	public void setDoses(Integer doses) {
		this.doses = doses;
	}
	public Boolean getCovid() {
		return covid;
	}
	public void setCovid(Boolean covid) {
		this.covid = covid;
	}
	public String getHash() {
		return hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
}
