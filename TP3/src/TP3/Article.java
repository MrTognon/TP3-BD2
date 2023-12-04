package TP3;

import javax.persistence.*;

public class Article {
  @Id
  @GeneratedValue
  private Integer idArticle;

  @Column
  private String description;

  @Column
  private Integer quantite_disponible;

  @Column
  private Integer prix_unitaire;

  public Article() {}

  public Article(String description, Integer quantite_disponible, Integer prix_unitaire) {
    this.description = description;
    this.quantite_disponible = quantite_disponible;
    this.prix_unitaire = prix_unitaire;
  }

  public Integer getIdArticle() {
    return idArticle;
  }

  public void setIdArticle(Integer idArticle) {
    this.idArticle = idArticle;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getQuantite_disponible() {
    return quantite_disponible;
  }

  public void setQuantite_disponible(Integer quantite_disponible) {
    this.quantite_disponible = quantite_disponible;
  }

  public Integer getPrix_unitaire() {
    return prix_unitaire;
  }

  public void setPrix_unitaire(Integer prix_unitaire) {
    this.prix_unitaire = prix_unitaire;
  }
}
