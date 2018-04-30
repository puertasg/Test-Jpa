package banque.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="banque")
public class Banque {
	
	@Id
	private int idBanque;
	
	@Column(name="NOM_BANQUE", length=50, nullable=false)
	private String nomBanque;
	
	public Banque()
	{
		
	}
}
