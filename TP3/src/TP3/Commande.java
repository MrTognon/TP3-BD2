package TP3;

import javax.persistence.*;

public class Commande {
  @Id
  private Integer idCommande;
  
  @Column
  private String date;
  
  @Id
  private Integer idClient;
  
  public Commande() {}

  public Commande(Integer idCommande, String date, Integer idClient) {
    this.idCommande = idCommande;
    this.date = date;
    this.idClient = idClient;
  }

  public Integer getIdCommande() {
    return idCommande;
  }

  public void setIdCommande(Integer idCommande) {
    this.idCommande = idCommande;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Integer getIdClient() {
    return idClient;
  }

  public void setIdClient(Integer idClient) {
    this.idClient = idClient;
  }
}
