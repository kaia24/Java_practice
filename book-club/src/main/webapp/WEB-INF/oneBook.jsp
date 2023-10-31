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
<title>Details</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container mt-5">
		<table class="table">
			<tr>
				<td>Posted By:</td>
				<td><c:out value="${book.postedBy.username }" /></td>
			</tr>
			<tr>
				<td>Title:</td>
				<td><c:out value="${book.title}" /></td>
			</tr>
			<tr>
				<td>Author:</td>
				<td><c:out value="${book.author }" /></td>
			</tr>

			<tr>
				<td>Thoughts:</td>
				<td><c:out value="${book.description }" /></td>
			</tr>
			</tbody>
		</table>
		<a href="/dashboard"> Back</a>
		<form action="/books/delete/${book.id }" method="post">
			<input type="hidden" name="_method" value="delete" />
			<button type="submit" class="btn btn-danger">Delete</button>
		</form>

	</div>
</body>
</html>
