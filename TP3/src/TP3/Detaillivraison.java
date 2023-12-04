package TP3;

import javax.persistence.*;

public class Detaillivraison {
	@Id
	private Integer idLivraison;
	
	@Id
	private Integer idArticle;
	
	@Id
	private Integer idCommande;
	
	@Column
	private Integer quantite_livree;

	public Detaillivraison() {}

	public Detaillivraison(Integer idLivraison, Integer idArticle, Integer idCommande, Integer quantite_livree) {
		this.idLivraison = idLivraison;
		this.idArticle = idArticle;
		this.idCommande = idCommande;
		this.quantite_livree = quantite_livree;
	}

	public Integer getIdLivraison() {
		return idLivraison;
	}

	public void setIdLivraison(Integer idLivraison) {
		this.idLivraison = idLivraison;
	}

	public Integer getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(Integer idArticle) {
		this.idArticle = idArticle;
	}

	public Integer getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Integer idCommande) {
		this.idCommande = idCommande;
	}

	public Integer getQuantite_livree() {
		return quantite_livree;
	}

	public void setQuantite_livree(Integer quantite_livree) {
		this.quantite_livree = quantite_livree;
	}
}
