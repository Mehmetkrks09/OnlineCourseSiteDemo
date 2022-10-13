package entities;

public class Instructor {
	

	public Instructor(int id, String name, String lastName, String email) {
		super();
		this.id = id;
		this.name = name;
		LastName = lastName;
		this.email = email;
	}
	
	private int id;
	private String name;
	private	String LastName;
	private	String email;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	

}
