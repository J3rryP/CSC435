import java.io.*;
import java.util.*;
import javax.naming.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import javax.sql.*;

package model;

public class LoginServlet extends HttpServlet {

    //Database login
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
      int exist = 0;

      try {
 		Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection(DB_URL, USER, PASS);  // Get a connection from the pool
         stmt = conn.createStatement();

         // Retrieve and process request parameters: username and password
         String userName = request.getParameter("username");
         String password = request.getParameter("password");

         boolean hasUserName = userName != null && ((userName = userName.trim()).length() > 0);
         boolean hasPassword = password != null && ((password = password.trim()).length() > 0);

         // Validate input request parameters
         if (!hasUserName) {
            out.println("<h3>Please Enter Your username!</h3>");
         } else if (!hasPassword) {
            out.println("<h3>Please Enter Your password!</h3>");
         } else {
            // Verify the username/password and retrieve the role(s)

            //System.out.println(sqlStr);  // for debugging
 			 	String sql = "select * from users where strcmp(users.name,'"+ userName +"')=0 and strcmp(users.pass,'"+ password +"')=0";
           		System.out.println(sql);
        	    ResultSet rset = stmt.executeQuery(sql);


            // Check if username/password are correct
            if (!rset.next()) {  // empty ResultSet
               out.println("<h3>Wrong username/password!</h3>");
               out.println("<p><a href='index.html'>Back to Login Menu</a></p>");
            } else {
               ++exist;
               // Create a new HTTPSession and save the username and roles
               // First, invalidate the session. if any
               HttpSession session = request.getSession(false);
               if (session != null) {
                  session.invalidate();
               }
               session = request.getSession(true);
               synchronized (session) {
                  session.setAttribute("username", userName);
                  session.setAttribute("email", rset.getString("email"));
                  session.setAttribute("age", rset.getString("age"));
                  session.setAttribute("id", rset.getString("user_id"));
                  session.setAttribute("gender", rset.getString("gender"));
               }
               out.println("<p>Hello, " + userName + "!</p>");
            }
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

      if(exist != 0){
      	String url = determineUrl();
      	request.getRequestDispatcher(url).forward(request, response);
      }else {
      		out.println("<h3>username does not exit. Please try again!</h3>");
      }

   }

   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      doGet(request, response);
   }

    String determineUrl(){
    	return "/welcome.jsp";
    }

}
