package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Pan;
import com.ty.dto.Person;

public class PersonSave {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		Person person = new Person();
		person.setName("sachi");
		person.setAge(23);
		Pan pan = new Pan();

		person.setPan(pan);
		pan.setPanNumber("YUI1452");
		pan.setFatherName("ravi");
		transaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		transaction.commit();
		System.out.println("data stored");
	}
}