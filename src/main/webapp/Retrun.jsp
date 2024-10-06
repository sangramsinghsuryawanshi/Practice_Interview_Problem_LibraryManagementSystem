<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table{
		margin-top: 40px;
		justify-content: center;
		align-items: center;
		text-align: center;
		width: 40%;
		margin-left: 30%;
	}
	th{
		background-color: black;
		color: white;
	}
</style>
</head>
<body>
	<%@include file="header.jsp"%>
	<table border="2">
		<tr>
			<th>Book Name</th>
			<th>Book quantity</th>
			<th>status</th>
			<th>return</th>
		</tr>
		<c:forEach var="b" items="${book}">
			<tr>
				<td>${b.bname}</td>
				<td>${b.bquantity}</td>
				<td>${b.status}</td>
				<td><a href="/${b.bid}">Click</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>