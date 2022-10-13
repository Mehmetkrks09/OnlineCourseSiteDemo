import java.util.ArrayList;
import java.util.List;

import business.abstracts.CategoryService;
import business.abstracts.CourseService;
import business.abstracts.InstructorService;
import business.concretes.CategoryManager;
import business.concretes.CourseManager;
import business.concretes.InstructorManager;
import core.loggers.DataBaseLogger;
import core.loggers.FileLogger;
import core.loggers.IBaseLogger;
import core.loggers.MailLogger;
import dataAcceess.Hibernate.HibernateCategoryDao;
import dataAcceess.Hibernate.HibernateCourseDao;
import dataAcceess.Hibernate.HibernateInstructorDao;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {

	public static void main(String[] args) {
		
		
	 IBaseLogger[] loggers = {new FileLogger(), new MailLogger(), new DataBaseLogger()};
	 System.out.println("	-------------------------------Kurs-----------------------------------------------------------");
		Course course1 = new Course(0, 5, 1, 2, "Java", "Java ileri seviye", 1500);
		Course course2 = new Course(1, 3, 1, 2, "React", "React", 100);
		
		  List<Course> courseList= new ArrayList<>();
		  courseList.add(course1);
		  
		
	
		CourseService courseManager= new CourseManager(new HibernateCourseDao(), loggers, courseList);

		courseManager.add(course2);
System.out.println("	-------------------------------Kategori-----------------------------------------------------------");
	
		
		Category category1= new Category(1, 1, "Java");
		Category category2= new Category(2, 1, "React");
		
		  List<Category> categoryList= new ArrayList<>();
		  categoryList.add(category1);
		  
		  CategoryService categorymanager= new CategoryManager(new HibernateCategoryDao(), loggers, categoryList);
		
		categorymanager.add(category2);
		System.out.println("	-------------------------------Eğitmen-----------------------------------------------------------");
		
		Instructor ınstructor1= new Instructor(1, "Mehmet", "Karakaş", "mail@gmail.com");
		Instructor ınstructor2= new Instructor(1, "Engin", "Demiroğ", "mail@gmail.com");
		
		List<Instructor> ınstructors= new ArrayList<>();
		ınstructors.add(ınstructor1);
		
		InstructorService ınstructor = new InstructorManager(new HibernateInstructorDao(), loggers, ınstructors);
		ınstructor.add(ınstructor2);
		
		
	}
	
	

}
