package controllers;

import play.data.Form;
import play.db.Database;
import play.mvc.*;
import views.formdata.LoginData;
import views.formdata.UserData;
import views.html.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import play.data.FormFactory;
import java.sql.SQLException;

import javax.inject.Inject;

import com.avaje.ebean.ExpressionList;

import models.Login;
import models.User;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
     public FormFactory formFactory;
	
	
	@Inject
    public HomeController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }
    
    
    public Result index() {
    	Form<Login> formData = formFactory.form(Login.class).bindFromRequest();
    	return ok(index.render(formData));
    }
    
    public Result postRegister() {

    // Get the submitted form data from the request object, and run validation.
    Form<User> formData = formFactory.form(User.class).bindFromRequest();
      // Convert the formData into a Student model instance.
    
    
    User user = formData.get();
    System.out.println("this is the "+ user.getName());
    ExpressionList<User> u = User.find.where().ilike("email", user.getEmail()).and().ilike("password", user.getPassword());
    User temp = u.findUnique();
    if(temp != null){
    	flash("success", "User instance already created/edited: try another email");
    	return ok(signup.render(formData));
    }else {
    	
    	user.save();
    	flash("success", "User instance created/edited: " + user.getName());
        return redirect("/");
    }
  }
  
  public Result postLogin() throws SQLException {
    // Get the submitted form data from the request object, and run validation.
    Form<Login> formData = formFactory.form(Login.class).bindFromRequest();
      // Convert the formData into a Student model instance.
    Login user = formData.get();
    ExpressionList<User> u = User.find.where().ilike("email", user.getEmail()).and().ilike("password", user.getPassword());
    User temp = u.findUnique();
    System.out.println("this is the login "+ temp.getName());
    if(temp !=null && temp.getEmail().equals(user.getEmail())){
    	return ok(homepage.render(temp.getName()
    	        ));
    }else {
    	flash("error", "invalid email or password");
    	return ok(index.render(formData));
    	
    }
      
    
  }
  
  public Result logout() {
	    session().clear();
	    return redirect("/"
	    );
	}
  
  public Result getRegister(){
	  Form<User> formData = Form.form(User.class).bindFromRequest();
	  return ok(signup.render(formData));
  }

}
