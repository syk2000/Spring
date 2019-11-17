<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	//db처리 
	String id2 = "root";
	String pw2 = "1234";
	
	if(id.equals(id2) && pw.equals(pw2)){
		out.print("<h1>로그인 ok</h1>");
	}else{
		out.print("<h1>로그인 not</h1>");
	}
	
	 
%>









</body>
</html>