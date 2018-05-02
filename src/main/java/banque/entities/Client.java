package banque.entities;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import entities.Emprunt;

@Entity
@Table(name="client")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CLIENT", unique = true, nullable = false)
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
	@JoinColumn(name="ID_BANQUE")
	private Banque banque;
	
	@OneToMany(mappedBy="client")
	private Set<Compte> comptes;
	
	public Client(String n, String p, LocalDate dn, Banque b, Adresse a)
	{
		this.nom = n;
		this.prenom = p;
		this.dateNaissance = dn;
		this.banque = b;
		this.adresse = a;
	}
	
	public Client()
	{
		
	}

	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public Banque getBanque() {
		return banque;
	}

	public Set<Compte> getComptes() {
		return comptes;
	}
}
