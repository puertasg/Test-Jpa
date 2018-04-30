package Entities;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="emprunt")
public class Emprunt {
	
	@Id
	private int id;
	
	@Column(name="DATE_DEBUT", nullable=false)
	private LocalDate dateDebut;
	
	@Column(name="DATE_FIN", nullable=true)
	private LocalDate dateFin;
	
	@Column(name="DELAI", length = 10, nullable=true)
	private int delai;
	
	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private Client client;
	
	@ManyToMany(mappedBy="emprunts")
	private Set<Livre> livres;
	
	public Emprunt()
	{
		
	}

	public Set<Livre> getLivres() {
		return livres;
	}

	public int getId() {
		return id;
	}

	public LocalDate getDateDebut() {
		return dateDebut;
	}

	public LocalDate getDateFin() {
		return dateFin;
	}

	public int getDelai() {
		return delai;
	}

	public Client getClient() {
		return client;
	}
}
