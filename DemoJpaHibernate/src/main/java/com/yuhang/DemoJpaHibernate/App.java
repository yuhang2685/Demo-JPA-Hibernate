package com.yuhang.DemoJpaHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * YH:
 * In this demo, we supply a quick-start template for ORM applications using JPA of Hibernate implementation.
 * In future, if we need to use a different JPA implementation, it is as easy as changing the dependency.
 * The configuration for DB connection is located in src/main/resources/META-INF/persistence.xml,
 * for example, "pu" is the name of persistence-unit which consists of the configuration for DB connection.
 * We use persistence-unit to create a JPA Entity Manager for ORM.
 */

public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
    	
    	// YH: Maps data to object by Entity Manager
    	Alien a1 = em.find(Alien.class, 101);
    	System.out.println(a1);
    	
    	// YH: Maps object to data by Entity Manager
    	Alien a2 = new Alien();
    	a2.setAid(103);
    	a2.setAname("ERIC");
    	a2.setPoints(90);
    	
    	// YH: Writes into DB using transaction
    	em.getTransaction().begin();
    	em.persist(a2);
    	em.getTransaction().commit();
    	
    }
}
