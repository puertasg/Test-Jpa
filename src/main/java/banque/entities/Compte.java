package banque.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="compte")
public class Compte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_COMPTE", unique = true, nullable = false)
	private int idCompte;
	
	@Column(name="NUMERO_COMPTE", length = 40, nullable=false)
	private String numeroCompte;
	
	@Column(name="SOLDE_COMPTE", length = 40, nullable=false)
	private double soldeCompte;
	
	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private Client client;
	
	@OneToMany(mappedBy="compte")
	private Set<Operation> operations;
	
	public Compte()
	{
		
	}
	
	public Compte(String noCpt, double soldeCpt, Client c)
	{
		this.numeroCompte = noCpt;
		this.soldeCompte = soldeCpt;
		this.client = c;
	}
}
