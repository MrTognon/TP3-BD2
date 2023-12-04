package TP3;

import javax.persistence.*;

public class Lignecommande {
	@Id
	private Integer idCommande;
	
	@Id
	private Integer idArticle;
	
	@Column
	private Integer quantite;
	
	public Lignecommande() {}
	
	public Lignecommande(Integer idCommande, Integer idArticle, Integer quantite) {
		this.idCommande = idCommande;
		this.idArticle = idArticle;
		this.quantite = quantite;
	}
	
	public Integer getIdCommande() {
		return idCommande;
	}
	
	public void setIdCommande(Integer idCommande) {
		this.idCommande = idCommande;
	}
	
	public Integer getIdArticle() {
		return idArticle;
	}
	
	public void setIdArticle(Integer idArticle) {
		this.idArticle = idArticle;
	}
	
	public Integer getQuantite() {
		return quantite;
	}
	
	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}
}
