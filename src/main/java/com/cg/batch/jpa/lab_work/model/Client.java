package com.cg.batch.jpa.lab_work.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.batch.jpa.lab_work.entities.Greet;

public class Client {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("abcd");
		EntityManager em = factory.createEntityManager();
		EntityTransaction tr = em.getTransaction();
		tr.begin();
		
		Greet greet = new Greet(101,"Namrata");
		Greet greet1 = new Greet(102,"Payal");
		Greet greet2 = new Greet(103,"Motu");
		greet2.setMessage_("Welcome to JPA!");
		em.persist(greet);
		em.persist(greet1);
		em.persist(greet2);
		tr.commit();
		System.out.println("Added greeting to database.");
		em.close();
		factory.close();
		System.out.println("End");


	}

}