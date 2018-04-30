package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
	
	public Client()
	{
		
	}
}
