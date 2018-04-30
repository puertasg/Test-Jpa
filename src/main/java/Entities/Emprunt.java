package Entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
	
	@Column(name="ID_CLIENT", length = 10, nullable=false)
	private int idClient;
	
	@ManyToOne
	private Client client;
	
	public Emprunt()
	{
		
	}
}
