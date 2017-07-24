package models;

import java.util.*;
import javax.persistence.*;

import play.data.format.*;
import play.data.validation.*;



@Entity
public class Query extends com.avaje.ebean.Model {
	
	@Id
	@Constraints.Min(10)
	private Long id;
	
	@Constraints.Required
	private String name;
	
	@Constraints.Required
	private String email;
	
	private int age;
	
	@Constraints.Required
	private String gender;
	
	public static Finder<Long,Query> find = new Finder<Long,Query>(Query.class);
	
	public Query(String nm, String em, int age){
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

	public int getInt() {
		return age;
	}
	
	@Override
	public String toString(){
		return "Name="+this.name+", Email="+this.email+", Pass="+this.age;
	}
}