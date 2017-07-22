import java.io.*;
import java.util.*;
import javax.naming.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import javax.sql.*;

package model;

public class RegisterServlet extends HttpServlet {

    //Login
    final String DB_URL="jdbc:mysql://localhost:3306/users";
    final String USER = "root";
    final String PASS = "raspberry888.";

   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();

      Connection conn = null;
      Statement  stmt = null;

      try {
 		 Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection(DB_URL, USER, PASS);  // Get a connection from the pool
         stmt = conn.createStatement();
 			if(conn == null) System.out.println("no connections");
         // Retrieve and process request parameters: username and password
         String userName = request.getParameter("username");
         String password = request.getParameter("password");
         String email = request.getParameter("email");
         String gender = request.getParameter("gender");
         int age = Integer.parseInt(request.getParameter("age"));

         boolean hasUserName = userName != null && ((userName = userName.trim()).length() > 0);
         boolean hasPassword = password != null && ((password = password.trim()).length() > 0);

         // Validate input request parameters
         if (!hasUserName) {
            out.println("<h3>Please Enter Your username!</h3>");
         } else if (!hasPassword) {
            out.println("<h3>Please Enter Your password!</h3>");
         } else {

            if(gender.equals("Male")) gender = "M";
    		else gender = "F";

 			String sql = "insert into users values('"+ request.getParameter("username") +"', '"+ request.getParameter("password")+"', '"+ gender +"', '"+ age +"', null , '"+ request.getParameter("email") +"')";
            System.out.println(sql);
            stmt.executeUpdate(sql);

		 }
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

      String url = determineUrl();
      request.getRequestDispatcher(url).forward(request, response);
   }

   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      doGet(request, response);
   }

   String determineUrl(){
    	return "/index.html";
    }
}
