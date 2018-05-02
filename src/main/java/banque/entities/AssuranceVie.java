package banque.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="assurancevie")
public class AssuranceVie extends Compte{
	
	@Column(name="DATE_FIN", length = 3)
	private LocalDate dateFin;
	
	@Column(name="TAUX", length = 3)
	private double taux;
	
	public AssuranceVie()
	{
		
	}
	
	public AssuranceVie(String noCpt, double soldeCpt, Client c, double t, LocalDate df)
	{
		super(noCpt, soldeCpt, c);
		this.taux = t;
		this.dateFin = df;
	}

	public double getTaux() {
		return taux;
	}

	public LocalDate getDateFin() {
		return dateFin;
	}
}
