package TP3;

import javax.persistence.*;

public class Client {
  @Id
  @GeneratedValue
  private Integer idClient;

  @Column
  private String nom;

  @Column
  private String tel;

  public Client() {}

  public Client(String nom, String tel) {
    this.nom = nom;
    this.tel = tel;
  }

  public Integer getIdClient() {
    return idClient;
  }

  public void setIdClient(Integer idClient) {
    this.idClient = idClient;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }
}
