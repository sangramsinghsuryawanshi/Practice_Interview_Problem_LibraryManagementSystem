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
	<form action="/addLibrary" method="post">
		<h1>search Book and add to library</h1>
		<lable>Book name:</lable>
		<input type="text" name="bname" placeholder="search book name" required="required"><br><br>
		<lable>Book Quantity:</lable>
		<input type="number" name="bquantity" placeholder="Enter book quantity..." required="required"><br><br>
		<button type="submit">submit</button>	 
	</form>
	<h2>${msg}</h2>
	<h2>${msg1}</h2>
</body>
</html>