package banque;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.Metamodel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import banque.entities.Adresse;
import banque.entities.AssuranceVie;
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
		
		LivretA livretA = new LivretA("123456789abc", 1, client, 1);
		entityMan.persist(livretA);
		
		AssuranceVie assuranceVie = new AssuranceVie("123456789abc", 2, client, 2, LocalDate.now());
		entityMan.persist(assuranceVie);
		
		Operation operation = new Operation(LocalDate.now(), 126, "motif ici", livretA);
		entityMan.persist(operation);
		
		entityTransac.commit();
		
		CriteriaBuilder criteriaBuilder = entityMan.getCriteriaBuilder();
		
		CriteriaQuery<Client> criteriaQueryClient = criteriaBuilder.createQuery(Client.class);
		Metamodel meta = entityMan.getMetamodel();
		EntityType<Client> Client_ = meta.entity(Client.class);
		
		Root<Client> rootClient = criteriaQueryClient.from(Client.class);
		Join<Client, Banque> laBanque = rootClient.join(Client_.getBanque());
		criteriaQueryClient.select(rootClient);
		TypedQuery<Client> queryClient = entityMan.createQuery(criteriaQueryClient);
		List<Client> allClients = queryClient.getResultList();
		
		entityMan.close();
		entityManFactory.close();
	}

}
