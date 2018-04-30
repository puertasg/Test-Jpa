package org.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestJpa {

	public static void main(String[] args) {
		EntityManagerFactory entityManFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager entityMan = entityManFactory.createEntityManager();
	}

}
