package dataAcceess.Jdbc;

import dataAcceess.BaseDals.IBaseCourseDao;
import entities.Course;

public class JdbcCourseDao implements IBaseCourseDao{

	@Override
	public void add(Course course) {
		 
		System.out.println(course.getName() +" Kursu Jbdc ile Sisteme Eklendi");
		
	}

}
