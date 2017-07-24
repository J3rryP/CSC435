package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class User extends Model {
	
	@Id
	@Constraints.Min(10)
	private Long id;
	
	@Constraints.Required
	private String name;
	
	@Constraints.Required
	private String email;
	
	@Constraints.Required
	private int age;
	
	@Constraints.Required
	private String password;
	
	@Constraints.Required
	private String gender;
	
	public static Finder<Long,User> find = new Finder<Long,User>(User.class);
	
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


	public void setId(long id) {
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

	public int getAge() {
		return age;
	}
	
	public long getId() {
		return id;
	}
	
	public void setPassword(String s){
		this.password = s;
	}
	
	public String getPassword(){
		return this.password;
	}
	
	/*public String validate() {
        if (authenticate(email, password) == null) {
            return "Invalid email or password";
        }
        return null;
    }
	*/
	
	@Override
	public String toString(){
		return "Name="+this.name+", Email="+this.email+", Pass="+this.age;
	}

}