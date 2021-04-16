package com.orangetalents.vacina.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;


@Entity
@Table(name="tb_vacinas")
public class Vacinas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVacina;
	
	@NotEmpty
	private String nomeVacina;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date dataAplicacao;
		
	@OneToMany(mappedBy = "vacinadoCom")
	private List<Usuarios> usuario = new ArrayList<>();
	
	@OneToMany(mappedBy = "vacina")
	Set<Estoque> estoque;

	
	public Long getIdVacina() {
		return idVacina;
	}

	public void setIdVacina(Long idVacina) {
		this.idVacina = idVacina;
	}

	public String getNomeVacina() {
		return nomeVacina;
	}

	public void setNomeVacina(String nomeVacina) {
		this.nomeVacina = nomeVacina;
	}

	public Date getDataAplicacao() {
		return dataAplicacao;
	}

	public void setDataAplicacao(Date dataAplicacao) {
		this.dataAplicacao = dataAplicacao;
	}

	public List<Usuarios> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuarios> usuario) {
		this.usuario = usuario;
	}

	public Set<Estoque> getEstoque() {
		return estoque;
	}

	public void setEstoque(Set<Estoque> estoque) {
		this.estoque = estoque;
	}

}
