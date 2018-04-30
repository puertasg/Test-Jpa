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
	
	public Livre()
	{
		
	}

	public int getId() {
		return id;
	}

	public String getTitre() {
		return titre;
	}
}
