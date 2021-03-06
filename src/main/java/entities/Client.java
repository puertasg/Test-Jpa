package entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class Client {
	
	@Id
	private int id;
	
	@Column(name="NOM", length = 50, nullable=false)
	private String nom;
	
	@Column(name="PRENOM", length = 50, nullable=false)
	private String prenom;
	
	@OneToMany(mappedBy="client")
	private Set<Emprunt> emprunts;
	
	public Client()
	{
		
	}

	public Set<Emprunt> getEmprunts() {
		return emprunts;
	}
}
