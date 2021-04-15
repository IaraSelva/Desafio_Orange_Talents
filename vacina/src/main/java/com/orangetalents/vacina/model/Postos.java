package com.orangetalents.vacina.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="tb_postos")
public class Postos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPosto;
	
	@NotEmpty
	private String nomePosto;
	
	@NotEmpty
	private String endereco;
	
	
	@OneToMany(mappedBy = "vacinadoEm")
	private List<Usuarios> usuarios;
	
	@OneToMany(mappedBy = "posto")
	Set<Estoque> estoque;

	public Long getIdPosto() {
		return idPosto;
	}

	public void setIdPosto(Long idPosto) {
		this.idPosto = idPosto;
	}

	public String getNomePosto() {
		return nomePosto;
	}

	public void setNomePosto(String nomePosto) {
		this.nomePosto = nomePosto;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<Usuarios> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuarios> usuarios) {
		this.usuarios = usuarios;
	}

	public Set<Estoque> getEstoque() {
		return estoque;
	}

	public void setEstoque(Set<Estoque> estoque) {
		this.estoque = estoque;
	}

}
