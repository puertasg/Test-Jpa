package org.diginamic;

import java.util.Iterator;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import entities.Client;
import entities.Emprunt;
import entities.Livre;

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
		
		Emprunt emprunt = entityMan.find(Emprunt.class, 1);
		
		for (Livre l : emprunt.getLivres()) {
			LOG.debug("ID livre emprunté: " + l.getId());
			LOG.debug("Titre livre emprunté: " + l.getTitre());
			LOG.debug("Auteur livre emprunté: " + l.getAuteur());
		}
		
		Client clientEmprunt = entityMan.find(Client.class, 1);
		
		for (Emprunt  e : clientEmprunt.getEmprunts()) {
			LOG.debug("ID emprunt: " + e.getId());
			LOG.debug("Date début emprunt: " + e.getDateDebut());
			LOG.debug("Date fin emprunt: " + e.getDateFin());
			LOG.debug("Delai emprunt: " + e.getDelai());
		}
		
		entityMan.close();
		entityManFactory.close();
	}

}
