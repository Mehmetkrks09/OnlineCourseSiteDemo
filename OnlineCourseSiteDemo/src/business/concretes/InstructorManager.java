package business.concretes;

import java.util.List;

import business.abstracts.InstructorService;
import core.loggers.IBaseLogger;
import dataAcceess.BaseDals.IBaseInstructorDao;
import entities.Instructor;

public class InstructorManager implements InstructorService {

	private IBaseInstructorDao ınstructorDao;
	private IBaseLogger[] loggers;
	private List<Instructor> ınstructors;
	

	public InstructorManager(IBaseInstructorDao instructorDao, IBaseLogger[] loggers, List<Instructor> instructors) {
		super();
		ınstructorDao = instructorDao;
		this.loggers = loggers;
		ınstructors = instructors;
	}
	
	@Override
	public void add(Instructor ınstructor) {

		for (IBaseLogger logger : loggers) {
			
			logger.log(ınstructor.getName());
		}
     ınstructorDao.add(ınstructor);
		
	}

}
