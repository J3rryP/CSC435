<%@ page language="java"%>
<%@ page import="java.sql.*"%>
<html>
<head><title>DatabaseAccess1</title></head>
<body>
<h1 align=\"center\">DatabaseAccess</h1>
<h2 style="font-family:monospace;" ><font color="grey"><a href="http:/social/request.html" style="font-family:monospace;" ><p style="text-align:center;">^^</p></a>
<%

	final String JDBC_DRIVER="com.mysql.jdbc.Driver";  
    final String DB_URL="jdbc:mysql://localhost:3306/users";
    final String USER = "root";
    final String PASS = "raspberry888.";
    Connection conn = null;
    
    try{
    
         Class.forName("com.mysql.jdbc.Driver");

       
          conn = DriverManager.getConnection(DB_URL, USER, PASS);
		
         
         Statement stmt = conn.createStatement();
         
         String g = request.getParameter("gender");
    		if(g.equals("Male")) g = "M";
    		else g = "F";
		 String sql = "select * from users.users where gender='"+ request.getParameter("gender") +"'";    	
    		ResultSet rs = stmt.executeQuery(sql);
        	out.println("<br/> RECORDS RESULTS <br/>");
        	
        	while(rs.next()){
        		out.println(", Name: " + rs.getString("name") + " ");
        		out.println(", Age: " + rs.getString("age") + " ");
        		out.println(", Gender: " + rs.getString("gender") +"<br/>");
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
%>
</body>
</html>
