package banque.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="operation")
public class Operation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_OPERATION", unique = true, nullable = false)
	private int idOperation;
	
	@Column(name="DATE_OPERATION", nullable=false)
	private LocalDate dateOperation;
	
	@Column(name="MONTANT", length=40, nullable=false)
	private double montant;
	
	@Column(name="MOTIF", length=40, nullable=false)
	private String motif;
	
	@ManyToOne
	@JoinColumn(name="ID_COMPTE")
	private Compte compte;
	
	public Operation()
	{
		
	}
	
	public Operation(LocalDate dateOp, double m, String mot, Compte c)
	{
		this.dateOperation = dateOp;
		this.montant = m;
		this.motif = mot;
		this.compte = c;
	}
}
