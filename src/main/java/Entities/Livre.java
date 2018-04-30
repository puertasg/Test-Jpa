package Entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	@OneToMany
	private Set<Compo> compos;
	
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

	public Set<Compo> getCompos() {
		return compos;
	}
}
