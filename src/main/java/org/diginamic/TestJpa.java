package org.diginamic;

import java.util.Map;

import javax.persistence.Cache;
import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnitUtil;
import javax.persistence.Query;
import javax.persistence.SynchronizationType;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.metamodel.Metamodel;

public class TestJpa {

	public static void main(String[] args) {
		EntityManagerFactory entityManFactory = new EntityManagerFactory() {
			
			@Override
			public <T> T unwrap(Class<T> arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean isOpen() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Map<String, Object> getProperties() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public PersistenceUnitUtil getPersistenceUnitUtil() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Metamodel getMetamodel() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public CriteriaBuilder getCriteriaBuilder() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Cache getCache() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public EntityManager createEntityManager(SynchronizationType arg0, Map arg1) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public EntityManager createEntityManager(SynchronizationType arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public EntityManager createEntityManager(Map arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public EntityManager createEntityManager() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void close() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void addNamedQuery(String arg0, Query arg1) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public <T> void addNamedEntityGraph(String arg0, EntityGraph<T> arg1) {
				// TODO Auto-generated method stub
				
			}
		};

	}

}
