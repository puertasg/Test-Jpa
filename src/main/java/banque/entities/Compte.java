package banque.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="compte")
public class Compte {
	
	@Id
	private int idCompte;
	
	@Column(name="NUMERO_COMPTE", length = 40, nullable=false)
	private String numeroCompte;
	
	@Column(name="SOLDE_COMPTE", length = 40, nullable=false)
	private double soldeCompte;
	
	@ManyToMany(mappedBy="clients")
	private Set<Client> clients;
	
	public Compte()
	{
		
	}
}
