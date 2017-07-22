package model;
public class User {

	//Login Interface
	private String name;
	private String email;
	private int age;
	private int id;
	private String gender;

	public User(String nm, String em, int age){
		this.name=nm;
		this.age=age;
		this.email=em;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String g) {
		this.gender = g;
	}

	public String getGender() {
		return gender;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getInt() {
		return age;
	}

	@Override
	public String toString(){
		return "Name="+this.name+", Email="+this.email+", Pass="+this.age;
	}
}
