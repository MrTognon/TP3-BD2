package TP3;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "lignecommande")
public class Lignecommande implements Serializable{
	@Id
	private LigneCommandeId ligneCommandeId;
	
	@Column
	private Integer quantite;
	
	public Lignecommande() {}
	
	public Lignecommande(LigneCommandeId ligneCommandeId, Integer quantite) {
		this.ligneCommandeId = ligneCommandeId;
		this.quantite = quantite;
	}
	
	public Integer getQuantite() {
		return quantite;
	}
	
	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}
}
