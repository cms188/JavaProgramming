<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%
    String uid = (String)request.getAttribute("id");
    if ( uid == null){
    	out.print("로그인 정보가 없습니다.");
    }
    else{
    	out.print("메인 페이지입니다.");
    	session.setAttribute("id",uid);
    	
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