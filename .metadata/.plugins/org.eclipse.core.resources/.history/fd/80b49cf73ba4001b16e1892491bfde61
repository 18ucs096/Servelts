<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	101 <Br>
	Amit<br>
	
	<%
	String url="jdbc:mysql://sql12.freemysqlhosting.net/sql12373822";
	String username="sql12373822";
	String password="HWDHdTwcgF";
	String query="SELECT * FROM Doctor; ";
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,username,password);
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(query);
	rs.next();
	String name=rs.getString("Name");
	System.out.println(name);
	st.close();
	con.close();

	%>
	
</body>
</html>