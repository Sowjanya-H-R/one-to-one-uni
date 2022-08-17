package com.ty.controller;

import com.ty.dao.PersonDao;
import com.ty.dto.Pan;
import com.ty.dto.Person;

public class GetPersonById {
	public static void main(String[] args) {
	      PersonDao dao=new PersonDao();
	     Person person =dao.getPersonById(1);
	      System.out.println("Id is :"+person.getId());
	      System.out.println("name is :"+person.getName());
	      System.out.println("age is :"+person.getAge());

	      Pan pan=new Pan();
	      System.out.println("Id is :"+pan.getId());
	      System.out.println("panNumber is :"+pan.getPanNumber());
	      System.out.println("fatherNmae is :"+pan.getFatherName());





		}
}
