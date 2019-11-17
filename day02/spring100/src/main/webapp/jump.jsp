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
<h2>내가 jump.jsp파일입니다....</h2>
<%
	//control
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");

	//model
	//1. 커넥터 설정
	Class.forName("com.mysql.jdbc.Driver");
	out.println("1. 커넥터 설정 ok...");
	
	//2. db연결
	String url = "jdbc:mysql://localhost:3309/spring";
	String user = "root";
	String password = "1234";
	Connection con = DriverManager.getConnection(url, user, password);
	out.print("2. db 연결 ok...");
	
	
	//3. sql문 결정
	String sql = "insert into member values (?,?,?,?)";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1, id);
	ps.setString(2, pw);
	ps.setString(3, name);
	ps.setString(4, tel);
	
	out.print("3. SQL문 객체화 ok...");
	//부품(class)
	//자바 class
	//String site = "www.naver.com";
	//URL url = new URL(site);
	//File file = new File("c:/temp/test.txt");
	//File file2 = MakeFile.getFile("c:temp/test.txt"); 
	//4. sql문 전송
	ps.executeUpdate();
	
	//view
	out.print("4. sql문 전송 ok....!");
	
%>

</body>
</html>