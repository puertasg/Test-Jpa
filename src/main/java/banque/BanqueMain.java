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
import banque.entities.LivretA;
import banque.entities.Operation;

public class BanqueMain {
	
	private static final Logger LOG = LoggerFactory.getLogger(BanqueMain.class);

	public static void main(String[] args) {
		EntityManagerFactory entityManFactory = Persistence.createEntityManagerFactory("banque");
		EntityManager entityMan = entityManFactory.createEntityManager();
		EntityTransaction entityTransac = entityMan.getTransaction();
		
		entityTransac.begin();
		
		Banque banque = new Banque("Ma banque");
		entityMan.persist(banque);
		
		Adresse adresse = new Adresse("Ma rue", "Ma ville", 1, 12345);
		Client client = new Client("test nom", "test prenom", LocalDate.now(), banque, adresse);
		entityMan.persist(client);
		
		LivretA la = new LivretA("123456789abc", 1, client, 1);
		entityMan.persist(la);
		
		Operation op = new Operation(LocalDate.now(), 126, "motif ici", la);
		entityMan.persist(op);
		
		entityTransac.commit();
		
		entityMan.close();
		entityManFactory.close();
	}

}
