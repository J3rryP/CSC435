import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;


import com.google.gson.Gson;

package controller;

public class RestPost extends HttpServlet {

    //Login
    final String DB_URL="jdbc:mysql://localhost:3306/users";
    final String USER = "root";
    final String PASS = "raspberry888.";
    private Gson _gson = null;

 	public RestPost(){
       	super();
		_gson = new Gson();
    }


   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
      ArrayList<User> obj = new ArrayList<User>();
      Connection conn = null;
      Statement  stmt = null;

      try {
 		Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection(DB_URL, USER, PASS);  // Get a connection from the pool
         stmt = conn.createStatement();
 		 response.setContentType("application/json; charset=UTF-8");

 		 	BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));

        	String data = br.readLine();  //id=20&sex=Male&age=55&email=daqua&username=sdfscd
        	System.out.println(data);
 		  	String parts [] = data.split("&");

 		  	String username, email, age , gender, password;
   			int id ;
   			id = 0;

   			String temp [] ;

   			temp = parts[0].split("=");
   			password = temp[temp.length-1];

   			temp = parts[1].split("=");
   			gender = temp[temp.length-1];

   			temp = parts[2].split("=");
   			age = temp[temp.length-1];

   			temp = parts[3].split("=");
   			email = temp[temp.length-1];

   			temp = parts[4].split("=");
   			username = temp[temp.length-1];

   			if(gender.equals("Male")) gender = "M";
    		else gender = "F";
         	User temp1;

           	String sql = "insert into users values('"+ username +"', '"+ password +"', '"+ gender +"', "+ age +", null , '"+ email +"')";
           	System.out.println(sql);
        	stmt.executeUpdate(sql);

        	sql = "select * from users where strcmp(users.email,'"+ email +"')=0";
        	ResultSet rset = stmt.executeQuery(sql);

            if (rset.next()) {
            	id = Integer.parseInt(rset.getString("user_id"));
            	gender = rset.getString("gender");
             }

        	temp1 = new User(username,email,Integer.parseInt(age));
        	temp1.setId(id);
        	temp1.setGender(gender);
            String res = _gson.toJson(temp1);



		    PrintWriter out = response.getWriter();

			out.print(res);
			out.flush();

    	conn.close();
      	}catch(SQLException se){
        	 se.printStackTrace();
      	}catch(Exception e){
        	 e.printStackTrace();
      	}finally{

		}
        try{
    	    if(conn!=null)
            conn.close();
    	 }catch(SQLException se){
            se.printStackTrace();
        }


   }



}
