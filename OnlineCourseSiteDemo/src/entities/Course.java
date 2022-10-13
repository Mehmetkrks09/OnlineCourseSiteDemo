package entities;

public class Course {
	
	public Course(int id, int numberOfStudents, int instructorId, int categoryId, String name, String description,int price) {
		super();
		this.id = id;
		NumberOfStudents = numberOfStudents;
		this.instructorId = instructorId;
		this.categoryId = categoryId;
		this.name = name;
		this.description = description;
		this.price=price;
	}
	
	private int id;
	private int  NumberOfStudents;
	private	int instructorId;
	private	int categoryId;
	private	int price;
	private String name;
	private	String description;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumberOfStudents() {
		return NumberOfStudents;
	}
	public void setNumberOfStudents(int numberOfStudents) {
		NumberOfStudents = numberOfStudents;
	}
	public int getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
