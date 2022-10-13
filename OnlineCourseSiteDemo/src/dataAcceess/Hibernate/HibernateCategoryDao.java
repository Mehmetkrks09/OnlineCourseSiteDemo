package dataAcceess.Hibernate;

import dataAcceess.BaseDals.IBaseCategoryDao;
import entities.Category;

public class HibernateCategoryDao  implements IBaseCategoryDao{

	@Override
	public void add(Category category) {
		 
		System.out.println(category.getCategoryName()+ " Jbdc ile Sisteme Eklendi");
		
	}

}
