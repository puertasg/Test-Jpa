package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
	
	public Compo()
	{
		
	}
}
