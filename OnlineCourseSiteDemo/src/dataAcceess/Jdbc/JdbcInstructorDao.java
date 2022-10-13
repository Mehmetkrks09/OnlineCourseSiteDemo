package dataAcceess.Jdbc;

import dataAcceess.BaseDals.IBaseInstructorDao;
import entities.Instructor;

public class JdbcInstructorDao implements IBaseInstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println(instructor.getName()+ " Jbdc ile Eklendi");
		
	}








}
