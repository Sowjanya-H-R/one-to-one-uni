package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Company;
import com.ty.dto.Gst;

public class Gstsave {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		Gst gst=new Gst();
		gst.setGstNmuber("DFgh1245");
		gst.setStatus("Active");
		
		Company company=new Company();
		gst.setCompany(company);

		company.setName("IBM");       
		company.setPhno(821782018);
		transaction.begin();
		entityManager.persist(gst);
		entityManager.persist(company);
		transaction.commit();
		System.out.println("data stored");
	}
}
