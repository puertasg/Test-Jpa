package banque;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import banque.entities.Banque;

public class BanqueMain {
	
	private static final Logger LOG = LoggerFactory.getLogger(BanqueMain.class);

	public static void main(String[] args) {
		EntityManagerFactory entityManFactory = Persistence.createEntityManagerFactory("banque");
		EntityManager entityMan = entityManFactory.createEntityManager();
		
		EntityTransaction entityTransac = entityMan.getTransaction();
		
		entityTransac.begin();
		
		Banque banque = new Banque();
		banque.setNomBanque("Ma banque");
		entityMan.persist(banque);
		
		entityTransac.commit();
		
		entityMan.close();
		entityManFactory.close();
	}

}
