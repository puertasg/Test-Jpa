package banque.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class Adresse {
	
	@Column(name="NUMERO_ADRESSE", length=4, nullable=false)
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
	
	public Adresse(String r, String v, int num, int cp)
	{
		this.rue = r;
		this.ville = v;
		this.numero = num;
		this.codePostal = cp;
	}

	public int getNumero() {
		return numero;
	}

	public String getRue() {
		return rue;
	}
	
	public int getCodePostal() {
		return codePostal;
	}

	public String getVille() {
		return ville;
	}
}
