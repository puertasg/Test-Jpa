package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="compo")
public class Compo {
	
	@Id
	private int id;
	
	@Column(name="ID_LIV", length=10, nullable = false)
	private int idLiv;
	
	@Column(name="ID_EMP", length=10, nullable = false)
	private int idEmp;
	
	@ManyToOne
	@JoinColumn(name="ID_LIV")
	private Livre livre;
	
	public Compo()
	{
		
	}

	public Livre getLivre() {
		return livre;
	}
}
