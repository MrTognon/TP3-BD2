package TP3;

import javax.persistence.*;

@Entity
@Table(name = "livraison")
public class Livraison {
	@Id
	@GeneratedValue
	private Integer idLivraison;
	
	@Column(name = "date")
	private String date;
	
	public Livraison() {}
	
	public Livraison(String date) {
		this.date = date;
	}
	
	public Integer getIdLivraison() {
		return idLivraison;
	}
	
	public void setIdLivraison(Integer idLivraison) {
		this.idLivraison = idLivraison;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
}
