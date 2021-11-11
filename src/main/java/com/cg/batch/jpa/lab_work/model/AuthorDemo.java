package com.cg.batch.jpa.lab_work.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.batch.jpa.lab_work.entities.Author;

public interface AuthorDemo {
public static void main(String[] args) {
		
		System.out.println("Start");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("abcd");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tr = em.getTransaction();
		
		tr.begin();
        Author aut1 = new Author(101,"Namrata","Rajesh","Rai",123456789l);
		Author emp2 = new Author(102,"Payal",null,"Rai",894562186l);
		Author emp3 = new Author(103,"ranu",null,"pandye",123456789l);
		
		// Inserting record  ---> After insertion we cannot again insert that record
		em.persist(aut1);  //insert
		em.persist(emp2);
		em.persist(emp3);
		
//		em.remove(emp2);
		
		// Updating record
//		emp1.setFirstName("moni");
//		em.merge(emp1);    //Update
		
		// Displaying record
		Author aut = em.find(Author.class, 101);   //Select
		System.out.println(aut.toString());
		
		tr.commit();
		System.out.println("End");
}
}