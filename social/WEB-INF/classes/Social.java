
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Social
 */

//Stateless
public class Social extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			response.setContentType("text/html; charset=UTF-8");
	      // Allocate a output writer to write the response message into the network socket
			PrintWriter out = response.getWriter();


			try {
				out.println("<!DOCTYPE html>");
				out.println("<html><head>");
				out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
				out.println("<title>Echo Servlet</title></head>");
				out.println("<body><h2>You have enter</h2>");

					// Retrieve the value of the query parameter "username" (from text field)
				String username = request.getParameter("username");
					// Get null if the parameter is missing from query string.
					// Get empty string or string of white spaces if user did not fill in
				if (username == null
	               || (username = htmlFilter(username.trim())).length() == 0) {
					out.println("<p>Name: MISSING</p>");
				} else {
					out.println("<p>Name: " + username + "</p>");
				}

					// Retrieve the value of the query parameter "password" (from password field)
				String password = request.getParameter("password");
				if (password == null
						|| (password = htmlFilter(password.trim())).length() == 0) {
					out.println("<p>Password: MISSING</p>");
				} else {
					out.println("<p>Password: " + password + "</p>");
				}

				// Retrieve the value of the query parameter "gender" (from radio button)
				String gender = request.getParameter("gender");
				// Get null if the parameter is missing from query string.
				if (gender == null) {
					out.println("<p>Gender: MISSING</p>");
				} else if (gender.equals("m")) {
					out.println("<p>Gender: male</p>");
				} else {
					out.println("<p>Gender: female</p>");
				}

					// Retrieve the value of the query parameter "age" (from pull-down menu)
				String age = request.getParameter("age");
				if (age == null) {
					out.println("<p>Age: MISSING</p>");
				} else if (age.equals("10")) {
					out.println("<p>Age: &lt; 10 to 14 year old</p>");
				} else if (age.equals("14")) {
					out.println("<p>Age: 14 to 17 years old</p>");
				} else if (age.equals("18")) {
			             out.println("<p>Age: 18 to 25 years old</p>");
				} else if (age.equals("26")) {
			 		             out.println("<p>Age: 26 to 35 years old</p>");
				}else {
					out.println("<p>Age: &gt; 35+ years old</p>");
				}

					// Retrieve the value of the query parameter (from checkboxes).
					// Multiple entries possible.
					// Use getParameterValues() which returns an array of String.
				String[] groups = request.getParameterValues("group");
				// Get null if the parameter is missing from query string.
				if (groups == null || groups.length == 0) {
					out.println("<p>Group: NONE</p>");
				} else {
					out.println("<p>Group: ");
					for (String group : groups) {
						if (group.equals("vegetables")) {
							out.println("Vegetables");
						}  else if (group.equals("fruits")) {
							out.println("Fruits");
						}  else if (group.equals("grain")) {
							out.println("Grain");
						}  else if (group.equals("fish")) {
							out.println("Fish");
						}  else if (group.equals("meat")) {
							out.println("Meat");
						}  else if (group.equals("milk")) {
							out.println("Milk");
						}
					}
					out.println("</p>");
				}

			         // Retrieve the value of the query parameter "instruction" (from text area)
			         String instruction = request.getParameter("instruction");
			         // Get null if the parameter is missing from query string.
			         if (instruction == null
			              || (instruction = htmlFilter(instruction.trim())).length() == 0
			              || instruction.equals("Enter your instruction here...")) {
			            out.println("<p>Instruction: NONE</p>");
			         } else {
			            out.println("<p>Instruction: " + instruction + "</p>");
			         }

			         // Retrieve the value of the query parameter "secret" (from hidden field)
			         String secret = request.getParameter("secret");
			         out.println("<p>Secret: " + secret + "</p>");

			         // Get all the names of request parameters
			         Enumeration<String> names = request.getParameterNames();
			         out.println("<p>Request Parameter Names are: ");
			         if (names.hasMoreElements()) {
			            out.print(htmlFilter(names.nextElement().toString()));
			         }
			         do {
			            out.print(", " + htmlFilter(names.nextElement().toString()));
			         } while (names.hasMoreElements());
			         out.println(".</p>");

			         // Hyperlink "BACK" to input page
			         out.println("<a href='form_input.html'>BACK</a>");

			         out.println("</body></html>");
			      } finally {
			         out.close();  // Always close the output writer
			      }
			}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private static String htmlFilter(String message) {
	      if (message == null) return null;
	      int len = message.length();
	      StringBuffer result = new StringBuffer(len + 20);
	      char aChar;

	      for (int i = 0; i < len; ++i) {
	         aChar = message.charAt(i);
	         switch (aChar) {
	             case '<': result.append("&lt;"); break;
	             case '>': result.append("&gt;"); break;
	             case '&': result.append("&amp;"); break;
	             case '"': result.append("&quot;"); break;
	             default: result.append(aChar);
	         }
	      }
	      return (result.toString());
	   }



}
