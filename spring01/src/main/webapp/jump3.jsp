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

<h2>�ڹ����� �Դϴ�.</h2>
<jsp:useBean id="dto" class="com.kgitbank.mvc100.MemberDTO"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/><!-- �ڵ� ���̸� Ȯ ���� ���� �ִ�. -->

<%
	/* //1. Ŀ���� ����
	Class.forName("com.mysql.jdbc.Driver");
	out.println("1. Ŀ���� ���� ok...");
	
	//2. db����
	String url = "jdbc:mysql://localhost:3309/spring";
	String user = "root";
	String password = "1234";
	Connection con = DriverManager.getConnection(url, user, password);
	out.print("2. db ���� ok...");
	
	
	//3. sql�� ����
	String sql = "insert into bbs values ('hong','hong','hong','hong')";
	PreparedStatement ps = con.prepareStatement(sql);
	out.print("3. SQL�� ��üȭ ok..."); */

	//4. sql�� ����
	ps.executeUpdate();
	out.print("4. sql�� ���� ok....!");
	
%>

</body>
</html>