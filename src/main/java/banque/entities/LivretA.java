package banque.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="livreta")
public class LivretA extends Compte{
	
	@Column(name="TAUX", length = 3)
	private double taux;
	
	public LivretA()
	{
		
	}
	
	public LivretA(String noCpt, double soldeCpt, Client c, double t)
	{
		super(noCpt, soldeCpt, c);
		this.taux = t;
	}

	public double getTaux() {
		return taux;
	}
}
