package banque.entities;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class Client {
	
	@Id
	private int idClient;
	
	@Column(name="NOM_CLIENT", length=50, nullable=false)
	private String nom;
	
	@Column(name="PRENOM_CLIENT", length=50, nullable=false)
	private String prenom;
	
	@Column(name="DATE_NAISSANCE", nullable=false)
	private LocalDate dateNaissance;
	
	@Embedded
	private Adresse adresse;
	
	@ManyToOne
	@JoinColumn(name="ID")
	private Banque banque;
	
	@ManyToMany
	@JoinTable(name="compte",
	joinColumns= @JoinColumn(name="ID_COMPTE", referencedColumnName="ID"),
	inverseJoinColumns= @JoinColumn(name="ID_CLIENT", referencedColumnName="ID")
	)
	private Set<Compte> comptes;
	
	public Client()
	{
		
	}
}
