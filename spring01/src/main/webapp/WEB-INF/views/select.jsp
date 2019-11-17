<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>${memberDTO.id}님의 검색이 요청이 되었습니다.</h3>
<h3>검색결과 입니다.</h3>
<hr color="red">
검색된 id: ${dto2.id}<br>
검색된 pw: ${dto2.pw}<br>
검색된 name: ${dto2.name}<br>
검색된 tel: ${dto2.tel}<br>

</body>
</html>