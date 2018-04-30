package banque.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="operation")
public class Operation {
	
	@Id
	private int idOperation;
	
	@Column(name="DATE_OPERATION", nullable=false)
	private LocalDate dateOperation;
	
	@Column(name="MONTANT", length=40, nullable=false)
	private double montant;
	
	@Column(name="MOTIF", length=40, nullable=false)
	private String motif;
	
	public Operation()
	{
		
	}
}
