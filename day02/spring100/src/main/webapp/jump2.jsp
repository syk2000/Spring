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
<h2>내가 jump.jsp파일입니다....</h2>
<%
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
	String sql = "insert into bbs values ('hong','hong','hong','hong')";
	PreparedStatement ps = con.prepareStatement(sql);
	out.print("3. SQL문 객체화 ok...");

	//4. sql문 전송
	ps.executeUpdate();
	out.print("4. sql문 전송 ok....!");
	
%>

</body>
</html>