package TP3;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class DetailLivraisonId implements Serializable{
	private Integer idLivraison;
	private Integer idArticle;
	private Integer idCommande;

  public DetailLivraisonId() {}

  public DetailLivraisonId(Integer idLivraison, Integer idArticle, Integer idCommande) {
    this.idLivraison = idLivraison;
    this.idArticle = idArticle;
    this.idCommande = idCommande;
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
}
