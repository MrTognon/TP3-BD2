package TP3;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class LigneCommandeId implements Serializable {
	private Integer idCommande;
	private Integer idClient;

	public LigneCommandeId() {}

	public LigneCommandeId(Integer idCommande, Integer idClient) {
		this.idCommande = idCommande;
		this.idClient = idClient;
	}

	public Integer getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Integer idCommande) {
		this.idCommande = idCommande;
	}

	public Integer getIdClient() {
		return idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}
}