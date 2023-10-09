<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.Date"%>
    <%
    String uid = request.getParameter("id");
    if(uid == null) {
    	out.print("로그인 정보가 없습니다.");
    }
    else {
    	session.setAttribute("id", uid);
    	response.sendRedirect("main.jsp");
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	
</body>
</html>