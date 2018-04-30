package org.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Entities.Livre;

public class TestJpa {
	
	private static final Logger LOG = LoggerFactory.getLogger(TestJpa.class);

	public static void main(String[] args) {
		EntityManagerFactory entityManFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager entityMan = entityManFactory.createEntityManager();
		
		Livre l = entityMan.find(Livre.class, 1);
		
		LOG.debug("ID : " + l.getId());
	}

}
