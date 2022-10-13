package business.concretes;

import java.util.List;

import business.abstracts.CategoryService;
import core.loggers.IBaseLogger;
import dataAcceess.BaseDals.IBaseCategoryDao;
import entities.Category;

public class CategoryManager  implements CategoryService{


	private IBaseCategoryDao categoryDao;
	private IBaseLogger[] loggers;
	private List<Category> categories;
	
	public CategoryManager(IBaseCategoryDao categoryDao, IBaseLogger[] loggers, List<Category> categories) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}
	
	@Override
	public void add(Category category ) {

     for(Category _category:categories) {
    	 
    	 if (_category.getCategoryName()==category.getCategoryName()) {
    		 
			System.out.println(_category.getCategoryName()+ " Sistemde Bulunmaktadır");
			return;
		}
    	 else {
    		 for(IBaseLogger logger:loggers) {
    			 logger.log(category.getCategoryName());
    		 }
    		 categoryDao.add(category);
    		 
    	 }
     }
		
	}

}
