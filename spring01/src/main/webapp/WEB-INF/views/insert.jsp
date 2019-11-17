<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>회원가입 처리가 잘되었습니다.</h1>
<hr color="blue"><br>
<h3>당신의 회원 가입 정보는 아래와 같습니다.</h3>
아이디: ${memberDTO.id}<br>
패스워드: ${memberDTO.pw}<br>
이름: ${memberDTO.name}<br>
전화번호: ${memberDTO.tel}<br><!-- views 밑에 파일까지만 갈 수가 있다. -->
</body>
</html>