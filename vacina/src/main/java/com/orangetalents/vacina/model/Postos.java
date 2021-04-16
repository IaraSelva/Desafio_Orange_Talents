package com.orangetalents.vacina.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
	
	private int estoque;
	
	
	@OneToMany(mappedBy = "vacinadoEm")
	@JsonIgnoreProperties("vacinadoEm")
	private List<Usuarios> usuarios = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name = "estoque",
	joinColumns = @JoinColumn (name = "postos_id"),
	inverseJoinColumns = @JoinColumn (name = "vacinas_id"))
	@JsonIgnoreProperties({"disponivelEm", "usuario"})
	private List<Vacinas> vacinasDisponiveis = new ArrayList<>();
	
	
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
	
	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public List<Usuarios> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuarios> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Vacinas> getVacinasDisponiveis() {
		return vacinasDisponiveis;
	}

	public void setVacinasDisponiveis(List<Vacinas> vacinasDisponiveis) {
		this.vacinasDisponiveis = vacinasDisponiveis;
	}

}
