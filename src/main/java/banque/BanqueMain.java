package banque;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import banque.entities.Adresse;
import banque.entities.Banque;
import banque.entities.Client;

public class BanqueMain {
	
	private static final Logger LOG = LoggerFactory.getLogger(BanqueMain.class);

	public static void main(String[] args) {
		EntityManagerFactory entityManFactory = Persistence.createEntityManagerFactory("banque");
		EntityManager entityMan = entityManFactory.createEntityManager();
		
		EntityTransaction entityTransac = entityMan.getTransaction();
		
		entityTransac.begin();
		
		Adresse adresse = new Adresse();
		adresse.setCodePostal(12345);
		adresse.setNumero(1);
		adresse.setRue("Ma rue");
		adresse.setVille("ma ville");
		
		Banque banque = new Banque();
		banque.setNomBanque("Ma banque");
		entityMan.persist(banque);
		
		Client client = new Client("test nom", "test prenom", LocalDate.now(), banque, adresse);
		entityMan.persist(client);
		
		entityTransac.commit();
		
		LOG.debug("ID insert : " + banque.getIdBanque());
		
		entityMan.close();
		entityManFactory.close();
	}

}
