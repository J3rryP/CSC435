import java.io.*;
import java.util.*;
import javax.naming.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import javax.sql.*;

package model;

public class LogoutServlet extends HttpServlet {




   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();
 	  HttpSession session = request.getSession(false);
      if (session != null) {
        session.invalidate();
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
