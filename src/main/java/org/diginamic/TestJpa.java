package org.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Entities.Livre;

public class TestJpa {
	
	private static final Logger LOG = LoggerFactory.getLogger(TestJpa.class);

	public static void main(String[] args) {
		EntityManagerFactory entityManFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager entityMan = entityManFactory.createEntityManager();
		
		Livre livre = entityMan.find(Livre.class, 1);
		
		LOG.debug("ID : " + livre.getId());
		LOG.debug("Titre : " + livre.getTitre());
		LOG.debug("Auteur : " + livre.getAuteur());
		
		Query query = entityMan.createQuery("SELECT l FROM Livre l WHERE l.titre = :titreRecherche");
		query.setParameter("titreRecherche", "Germinal");
		Livre livreSelect = (Livre) query.getResultList().get(0);
		
		LOG.debug("ID : " + livreSelect.getId());
		LOG.debug("Titre : " + livreSelect.getTitre());
		LOG.debug("Auteur : " + livreSelect.getAuteur());
	}

}
