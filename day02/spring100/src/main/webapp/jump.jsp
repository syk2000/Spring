<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- view -->
<h2>���� jump.jsp�����Դϴ�....</h2>
<%
	//control
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");

	//model
	//1. Ŀ���� ����
	Class.forName("com.mysql.jdbc.Driver");
	out.println("1. Ŀ���� ���� ok...");
	
	//2. db����
	String url = "jdbc:mysql://localhost:3309/spring";
	String user = "root";
	String password = "1234";
	Connection con = DriverManager.getConnection(url, user, password);
	out.print("2. db ���� ok...");
	
	
	//3. sql�� ����
	String sql = "insert into member values (?,?,?,?)";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1, id);
	ps.setString(2, pw);
	ps.setString(3, name);
	ps.setString(4, tel);
	
	out.print("3. SQL�� ��üȭ ok...");
	//��ǰ(class)
	//�ڹ� class
	//String site = "www.naver.com";
	//URL url = new URL(site);
	//File file = new File("c:/temp/test.txt");
	//File file2 = MakeFile.getFile("c:temp/test.txt"); 
	//4. sql�� ����
	ps.executeUpdate();
	
	//view
	out.print("4. sql�� ���� ok....!");
	
%>

</body>
</html>