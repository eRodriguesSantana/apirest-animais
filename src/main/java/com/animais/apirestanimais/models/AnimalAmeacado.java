package com.animais.apirestanimais.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_animais_ameacados")
public class AnimalAmeacado implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private long id;
	
	private String grupo_taxonomico;
	private String classe;
	private String ordem;
	private String familia;
	private String especie;
	private String nome_comum;
	private String categoria_validada;
	private String criterio_validado;
	private String regiao;
	private String justificativa;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getGrupo_taxonomico() {
		return grupo_taxonomico;
	}
	public void setGrupo_taxonomico(String grupo_taxonomico) {
		this.grupo_taxonomico = grupo_taxonomico;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public String getOrdem() {
		return ordem;
	}
	public void setOrdem(String ordem) {
		this.ordem = ordem;
	}
	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getNome_comum() {
		return nome_comum;
	}
	public void setNome_comum(String nome_comum) {
		this.nome_comum = nome_comum;
	}
	public String getCategoria_validada() {
		return categoria_validada;
	}
	public void setCategoria_validada(String categoria_validada) {
		this.categoria_validada = categoria_validada;
	}
	public String getCriterio_validado() {
		return criterio_validado;
	}
	public void setCriterio_validado(String criterio_validado) {
		this.criterio_validado = criterio_validado;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public String getJustificativa() {
		return justificativa;
	}
	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}	
	
}
