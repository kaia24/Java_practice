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
<title>dashboard</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container mt-5">
		<h1>Welcome , ${userName }</h1>
		<p>
			<a href="/books/new">Create new book</a>
		</p>
		<p>
			<a href="/logout">Logout</a>
		</p>
		<h1>All Books</h1>
		<table class="table">
		<h2>Everyone's Books</h2>
			<thead>
				<tr>
					<th>titles</th>
					<th>Author</th>
					<th>Team lead</th>

				</tr>
			</thead>
			<tbody>
			
				<c:forEach var="eachBook" items="${ bookList}">
					<c:if test="${!eachBook.postedBy.id.equals(userId) }">
						<tr>
							<td><a href="/books/${eachBook.id }"> <c:out
										value="${eachBook.title}" /></a></td>
							<td><c:out value="${eachBook.author }" />
							<td><c:out value="${eachBook.postedBy.username }" /></td>

						</tr>
					</c:if>
				</c:forEach>
			</tbody>
		</table>
		<table class="table">
		<h2>My Books</h2>
			<thead>
				<tr>
					<th>Titles</th>
					<th>Author</th>
					<th>Team lead</th>

					<th>Actions</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach var="eachBook" items="${bookList}">
					<c:if test="${eachBook.postedBy.id.equals(userId) }">
						<tr>
							<td><a href="/books/${eachBook.id }"> <c:out
										value="${eachBook.title}" /></a></td>
							<td><c:out value="${eachBook.author }" />
							<td><c:out value="${eachBook.postedBy.username }" /></td>

							<td><a href="/books/edit/${eachBook.id}">Edit </a></td>

						</tr>
					</c:if>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>