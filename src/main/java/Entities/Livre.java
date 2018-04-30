package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="livre")
public class Livre {
	@Id
	private int id;
	
	@Column(name="TITRE", length = 255, nullable = false)
	private String titre;
	
	@Column(name="AUTEUR", length = 50, nullable = false)
	private String auteur;
	
	public Livre()
	{
		
	}

	public int getId() {
		return id;
	}

	public String getTitre() {
		return titre;
	}

	public String getAuteur() {
		return auteur;
	}
}
