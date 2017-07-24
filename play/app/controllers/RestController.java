package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;

import models.User;
import play.mvc.*;
import play.libs.Json;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class RestController extends Controller {

   
   
    public Result getUsers() throws SQLException { //doGet
        List<User> e = User.find.all();
        return ok(Json.toJson(e));
    }
    
    public Result getUser(long a) { //doGet
    	User user = User.find.byId(a);
      return ok(Json.toJson(user));
    
  }
  
  public Result updateUser() { //doPost
	  JsonNode fish = request().body().asJson();
	  User user =  Json.fromJson(fish, User.class);
	  User user2 = User.find.byId(user.getId());
	  user2.setAge(user.getAge());
	  user2.setEmail(user.getEmail());
	  user2.setPassword(user.getPassword());
	  user2.setGender(user.getGender());
	  user2.setName(user.getName());
	  user2.update();
	  return ok(Json.toJson(user2));
    
  }
  
  public Result createUser() { //doPut
	  JsonNode fish = request().body().asJson();
	  User user =  Json.fromJson(fish, User.class);
	  user.save();
	  return ok(Json.toJson(user));
  }

}
