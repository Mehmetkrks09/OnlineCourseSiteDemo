package entities;

public class Category {
	
	
	
	public Category(int id, int categoryId, String categoryName) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}
	
	private int id;
	private int categoryId;
	private String categoryName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	

	


}
