package banque.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="banque")
public class Banque {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_BANQUE", unique = true, nullable = false)
	private int idBanque;
	
	@Column(name="NOM_BANQUE", length=50, nullable=false)
	private String nomBanque;
	
	@OneToMany(mappedBy="banque")
	private Set<Client> clients;
	
	public Banque()
	{
		
	}
	
	public Banque(String n)
	{
		this.nomBanque = n;
	}

	public String getNomBanque() {
		return nomBanque;
	}

	public int getIdBanque() {
		return idBanque;
	}
}
