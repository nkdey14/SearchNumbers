<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Numbers</title>
</head>
<body>
<div align="center">
<h2>Numbers are:</h2>
	First Number: ${nums.num1}<br>
	<br>Second Number: ${nums.num2}<br>
	
	<br>
	<a href="sum?fnum=${nums.num1}&snum=${nums.num2}"><input type="button" value="Add"></a>
</div>
</body>
</html>