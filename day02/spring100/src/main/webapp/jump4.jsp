<%@page import="com.kgitbank.mvc100.MemberDAO"%>
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

<jsp:useBean id="dto" class="com.kgitbank.mvc100.MemberDTO"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>
<%
	//control
	/* String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");

	MemberDTO dto = new MemberDTO();
	dto.setId(id);
	dto.setPw(pw);
	dto.setName(name);
	dto.setTel(tel); */
	
	
	//model
	MemberDAO dao = new MemberDAO();
	dao.insert(dto);
	
%>
<h3>db처리 요청됨.</h3>

</body>
</html>