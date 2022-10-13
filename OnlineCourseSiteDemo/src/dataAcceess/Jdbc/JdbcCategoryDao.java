package dataAcceess.Jdbc;

import dataAcceess.BaseDals.IBaseCategoryDao;
import entities.Category;

public class JdbcCategoryDao  implements IBaseCategoryDao{

	@Override
	public void add(Category category) {
		 
		System.out.println(category.getCategoryName()+ " Hibernate ile Sisteme Eklendi");
		
	}

}
