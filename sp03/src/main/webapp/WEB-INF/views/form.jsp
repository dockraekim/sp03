<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Link</title>
</head>
<body>

<form action="#" method="post">
	사용자 : <br><input type="text" name="username"><br>
	비밀번호 : <br><input type="password" name="password"><br>
	성별 : <input type="radio" name="gen01" value="html" checked> 남성 
	       <input type="radio" name="gen02" value="css"> 여성 <br>
	과목 : <input type="checkbox" name="lec01" value="html" checked> JAVA 
	       <input type="checkbox" name="lec02" value="css"> HTML/CSS <br>
	<input type="submit" value="전송">
</form> 

</body>	
</html>
