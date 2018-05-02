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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
}
