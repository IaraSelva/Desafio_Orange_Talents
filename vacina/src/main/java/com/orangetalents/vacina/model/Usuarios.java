package com.orangetalents.vacina.model;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name="tb_usuarios")
public class Usuarios {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	
	@NotNull
	private String nome;
	
	@NotEmpty
	private String email;
	
	@NotEmpty
	private String cpf;
	
	@NotNull
	private Date dataNascimento;
	
	@ManyToOne
	@JoinColumn(name = "vacina")
	@JsonIgnoreProperties("usuario")
	private Vacinas vacinadoCom;
	
	
	@ManyToOne
	@JoinColumn(name = "posto")
	@JsonIgnoreProperties("usuarios")
	private Postos vacinadoEm;
	

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Vacinas getVacinadoCom() {
		return vacinadoCom;
	}

	public void setVacinadoCom(Vacinas vacinadoCom) {
		this.vacinadoCom = vacinadoCom;
	}

	public Postos getVacinadoEm() {
		return vacinadoEm;
	}

	public void setVacinadoEm(Postos vacinadoEm) {
		this.vacinadoEm = vacinadoEm;
	}
	
}
