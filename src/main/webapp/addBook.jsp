<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	form{
		width: 30%;
		justify-content: center;
		align-items: center;
		text-align: center;
		border: 2px solid black;
		box-shadow: 12px 20px 14px rgb(0,0,0,0.2);
		margin-left: 30%;
		padding: 20px;
		margin-top: 40px;
	}
	h2{
		justify-content: center;
		align-items: center;
		text-align: center;
		color: green;
		text-shadow: 12px 20px 14px;
		margin-top: 40px;
	}
</style>
</head>
<body>
	<%@include file="header.jsp"%>
	<form action="/insert" method="post">
		<h1>Add data</h1>
		<lable>Title:</lable>
		<input type="text" name="title" placeholder="Enter book title.." required="required"><br><br>
		<lable>Author:</lable>
		<input type="text" name="author" placeholder="Enter book author..." required="required"><br><br>
		<lable>Book quantity:</lable>
		<input type="number" name="quantity" placeholder="Enter book quantity..." required="required"><br><br>
		<button type="submit">submit</button>	 
	</form>
	<h2>${msg}</h2>
</body>
</html>