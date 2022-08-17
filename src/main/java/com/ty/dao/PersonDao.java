package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Person;

public class PersonDao {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = factory.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();

	public Person getPersonById(int id) {
		Person person=entityManager.find(Person.class, 1);
		System.out.println(person);
		return person;

	}
}
