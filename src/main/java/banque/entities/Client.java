package banque.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
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
	
	public Client()
	{
		
	}
}
