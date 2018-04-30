package Entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	
	@ManyToMany
	@JoinTable(name="compo",
	joinColumns= @JoinColumn(name="ID_EMP", referencedColumnName="ID"),
	inverseJoinColumns= @JoinColumn(name="ID_LIV", referencedColumnName="ID")
	)
	private Set<Emprunt> emprunts;
	
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
