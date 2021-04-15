package com.orangetalents.vacina.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Estoque {
	
	@Id
	public Long id;
	
	@ManyToOne
    @JoinColumn(name = "vacina_id")
    public Vacinas vacina;

    @ManyToOne
    @JoinColumn(name = "posto_id")
    public Postos posto;

    public int estoque;

    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Vacinas getVacina() {
		return vacina;
	}

	public void setVacina(Vacinas vacina) {
		this.vacina = vacina;
	}

	public Postos getPosto() {
		return posto;
	}

	public void setPosto(Postos posto) {
		this.posto = posto;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

}
