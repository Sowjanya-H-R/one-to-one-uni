package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Employee;

public class GetEmployeeByID {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		Employee employee=entityManager.find(Employee.class, 1);
		System.out.println("Employee Id is :"+employee.getId());
	}
}
