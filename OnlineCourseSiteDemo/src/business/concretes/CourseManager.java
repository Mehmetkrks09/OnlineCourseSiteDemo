package business.concretes;

import java.util.List;

import business.abstracts.CourseService;
import core.loggers.IBaseLogger;
import dataAcceess.BaseDals.IBaseCourseDao;
import dataAcceess.Hibernate.HibernateCourseDao;
import entities.Course;

public class CourseManager implements CourseService{

	private IBaseCourseDao courseDao;
	private IBaseLogger[] loggers;
	private List<Course> courses;
	
	public CourseManager(IBaseCourseDao courseDao, IBaseLogger[] loggers, List<Course> courses) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}


	
	@Override
	public void add(Course course) {

       for(Course _course:courses) {
    	   
    	   if (_course.getName()==course.getName()) {
    		   
			System.out.println(_course.getName() +" Sistemde Kayıtlıdır Lütfen Farklı Bir tane deneyiniz.");
			return;
		}
    	   else if(course.getPrice()<0) {
    		   
    		   System.out.println(course.getPrice()+" Fiyat 0'Dan Küçük olamaz.");
    	   }
    	   else {
    		   for(IBaseLogger logger:loggers) {
    			   
    			   logger.log(course.getName());
    		   }
    		   courseDao.add(course);
    		   
    	   }
       }
		
	}

}
