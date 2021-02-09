<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Link</title>
</head>
<body>

	<h1>body 태그 내의 자바스크립트</h1>
	<p>자바스크립트로 현재 날짜/시간 정보가져오기!</p>
	<button onclick="printDate()">가져오기!</button>
	<p id="date"></p>
	<script>
	function printDate() {
		document.getElementById("date").innerHTML = Date();
	}
	</script>

</body>	
</html>
