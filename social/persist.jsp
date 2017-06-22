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
       
         // Open a connection
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
		
         // Execute SQL query
        Statement stmt = conn.createStatement();
         
        String g = request.getParameter("gender");
    	if(g.equals("Male")) g = "M";
    	else g = "F";
		String sql = "insert into users values('"+ request.getParameter("username") +"', '"+ request.getParameter("password")+"', '"+ g +"', '"+ Integer.parseInt(request.getParameter("age")) +"', null)";    	
    	stmt.executeUpdate(sql);
  
        out.println(", Age: " + request.getParameter("age") + "<br>");
        out.println(", Name: " + request.getParameter("username") + "<br>");
        out.println(", RECORDS INSERTED <br>");
         
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
