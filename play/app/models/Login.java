package models;

import javax.persistence.Entity;

@Entity
public class Login extends com.avaje.ebean.Model {

	String email;
	String password;
	
	
	public Login(String e, String p){
		email = e;
		password = p;
	}
	
	public String getEmail(){
		return email;
	}
	
	public String getPassword(){
		return password;
	}
	
	
	public void setPassword(String password){
		this.password = password;	
	}
	
	public void setEmail(String email){
		this.email = email;	
	}
}