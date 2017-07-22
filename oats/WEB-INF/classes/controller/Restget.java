import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.lang.StringBuffer;


import com.google.gson.Gson;

package controller;

public class RestGet extends HttpServlet {


 	final String DB_URL="jdbc:mysql://localhost:3306/users";
    final String USER = "root";
    final String PASS = "raspberry888.";
    private Gson _gson = null;

 	public RestGet(){
       	super();
		_gson = new Gson();
    }


   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
      ArrayList<User> obj = new ArrayList<User>();
      Connection conn = null;
      Statement  stmt = null;
      String url = request.getRequestURL().toString();
      url = url.substring(6,url.length());
      String [] parts = url.split("/");
      int check = 0 ;
      if(parts[parts.length-1].equals("users")) check = 1;
      else check = 0;

      try {
 		Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection(DB_URL, USER, PASS);  // Get a connection from the pool
         stmt = conn.createStatement();
 		 response.setContentType("application/json; charset=UTF-8");

 		  	String username, email;
   				int age ;
   			ResultSet rs = null;
         	User temp;
			if(check == 1){
           		String sql = "select * from users.users ";
           		System.out.println(sql);
        	    rs = stmt.executeQuery(sql);
        	}else {
        		String sql = "select * from users where user_id="+parts[parts.length-1]+"";
           		System.out.println(sql);
        	    rs = stmt.executeQuery(sql);
        	}

        	if(rs!= null)
        	while(rs.next()){
        			username = rs.getString("name");
        			email = rs.getString("email");
        			age = Integer.parseInt(rs.getString("age"));
        			temp = new User(username,email,age);
        			temp.setId(Integer.parseInt(rs.getString("user_id")));
        			obj.add(temp);

        		}



            String res = _gson.toJson(obj);



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

   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      doGet(request, response);
   }



}
