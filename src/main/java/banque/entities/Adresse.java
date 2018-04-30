package banque.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class Adresse {
	
	@Id
	private int id;
	
	@Column(name="NUMERO", length=4, nullable=false)
	private int numero;
	
	@Column(name="RUE", length=50, nullable=false)
	private String rue;
	
	@Column(name="CODE_POSTAL", length=10, nullable=false)
	private int codePostal;
	
	@Column(name="VILLE", length=40, nullable=false)
	private String ville;
	
	public Adresse()
	{
		
	}
}
