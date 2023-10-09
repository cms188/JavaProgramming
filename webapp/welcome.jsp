<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.Date"%>
    <%@ include file="menu.jsp" %>
    <%
    String res="<h4>Welcome to Web Market!</h4>";
    res += "<br>현재 시간: "+(new Date()).toString();
    out.print(res);%>
    <%@ include file="footer.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	
</body>
</html>