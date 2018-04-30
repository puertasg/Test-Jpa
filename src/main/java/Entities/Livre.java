package Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="livre")
public class Livre {
	@Id
	private int id;
	
	public Livre()
	{
		
	}
}
