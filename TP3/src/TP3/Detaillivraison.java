package TP3;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "detaillivraison")
public class Detaillivraison implements Serializable{
	@Id
	private DetailLivraisonId detailLivraisonId;
	
	@Column
	private Integer quantite_livree;

	public Detaillivraison() {}

	public Detaillivraison(DetailLivraisonId detailLivraisonId, Integer quantite_livree) {
		this.detailLivraisonId = detailLivraisonId;
		this.quantite_livree = quantite_livree;
	}

	public Integer getQuantite_livree() {
		return quantite_livree;
	}

	public void setQuantite_livree(Integer quantite_livree) {
		this.quantite_livree = quantite_livree;
	}
}
