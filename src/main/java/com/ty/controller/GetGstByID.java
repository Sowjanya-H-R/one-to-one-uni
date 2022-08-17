package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.ty.dto.Company;
import com.ty.dto.Gst;

public class GetGstByID {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		Gst gst = entityManager.find(Gst.class, 2);
		System.out.println("Gst Id is :" + gst.getId());
		System.out.println("Gst gstNumber is :" + gst.getGstNmuber());
		System.out.println("Gst status is :" + gst.getStatus());

		System.out.println("--------------------");
		System.out.println("Company Id is :" + gst.getCompany().getId());
		System.out.println("Company name is :" + gst.getCompany().getName());
		System.out.println("Company status is :" + gst.getCompany().getPhno());

	}

}
