package dataAcceess.Hibernate;

import dataAcceess.BaseDals.IBaseInstructorDao;
import entities.Instructor;

public class HibernateInstructorDao implements IBaseInstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println(instructor.getName()+ " Hibernate ile Eklendi");
		
	}








}
