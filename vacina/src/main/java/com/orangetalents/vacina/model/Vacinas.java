package com.orangetalents.vacina.model;


import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
		
	@OneToOne(mappedBy = "vacinadoCom")
	private Usuarios usuario;
	
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

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	public Set<Estoque> getEstoque() {
		return estoque;
	}

	public void setEstoque(Set<Estoque> estoque) {
		this.estoque = estoque;
	}

}
