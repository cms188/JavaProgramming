<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.Date" import="java.text.SimpleDateFormat"%>
    <%
    Date now = new Date();
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    String date = df.format(now);
    
    if(date.endsWith("12")){
    	response.sendRedirect("underCheck.jsp");
    	return;
    }
    
    request.setCharacterEncoding("utf-8");
    String uid = request.getParameter("id");
    String res = "<h3>사용자 아이디: "+uid+"</h3>";
    res += "<br>로그인 시간: "+(new Date()).toString();
    out.print(res);%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>User ID: <%=request.getParameter("id") %></h3>
</body>
</html>