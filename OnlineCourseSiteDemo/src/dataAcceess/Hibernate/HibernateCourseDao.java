package dataAcceess.Hibernate;

import dataAcceess.BaseDals.IBaseCourseDao;
import entities.Course;

public class HibernateCourseDao implements IBaseCourseDao{

	@Override
	public void add(Course course) {
		 
		System.out.println(course.getName() +" Kurs Hibernate ile Sisteme Eklendi");
		
	}

}
