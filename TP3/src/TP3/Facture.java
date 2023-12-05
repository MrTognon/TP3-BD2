package TP3;

import javax.persistence.*;

@Entity
@Table(name = "facture")
public class Facture {
	@Id
	@GeneratedValue
	private Integer idFacture;
	
	@Column
	private Integer idClient;
	
	@Column
	private Double total;
	
	public Facture() {}
	
	public Facture(Integer idClient, Double total) {
		this.idClient = idClient;
		this.total = total;
	}
	
	public Integer getIdFacture() {
		return idFacture;
	}
	
	public void setIdFacture(Integer idFacture) {
		this.idFacture = idFacture;
	}

	public Integer getIdClient() {
		return idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}
	
	public Double getTotal() {
		return total;
	}
	

	public void setTotal(Double total) {
		this.total = total;
	}
	
}
