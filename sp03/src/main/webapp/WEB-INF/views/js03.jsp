<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Link</title>
</head>
<body>

	<h1>getDate() 메소드</h1>
	<script>
		var date = new Date();
		var days = ["일", "월", "화", "수", "목", "금", "토"];
		document.write("오늘은 " + date.getFullYear() + "년 " 
			+ date.getMonth() + "월 " 
			+ date.getDate() + "일 "  
			+ days[date.getDay()] + "요일 입니다." );
	</script>

</body>	
</html>
