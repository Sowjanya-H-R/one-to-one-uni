package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Address;
import com.ty.dto.Employee;

public class EmployeeSave {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		Employee employee = new Employee();

		employee.setName("sonu");
		employee.setEmail("sonu@gmail.com");
		
		Address address=new Address();
		address.setArea("Idhra nagar");
		address.setCity("Mysore");
		address.setPinCode(571402);
		
		employee.setAddress(address);
		transaction.begin();
		entityManager.persist(employee);
		entityManager.persist(address);
		transaction.commit();
		System.out.println("-----data stored-----");

	}
}
