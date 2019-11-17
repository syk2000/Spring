<%@page import="com.kgitbank.mvc01.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
String id = request.getParameter("id");
String pw = request.getParameter("pw");
String name = request.getParameter("name");
String tel = request.getParameter("tel");

MemberDAO dao = new MemberDAO();
dao.insert(id,pw,name,tel);


%>