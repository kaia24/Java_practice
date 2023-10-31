<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTFF-8">
<title>Insert title here</title>
</head>
<body>
	
		<div class="container mt-5">
		<table class="table">
			<tr>
				<td>expense:</td>
				<td><c:out value="${travel.expense}" /></td>
			</tr>
			<tr>
				<td>vendor:</td>
				<td><c:out value="${travel.vendor }" /></td>
			</tr>
			<tr>
				<td>amount:</td>
				<td><c:out value="${travel.amount }" /></td>
			</tr>
			
			</tbody>
		</table>
		<a href="/"> Back</a>
		</div>
	
</body>
</html>