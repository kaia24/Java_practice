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
<title>New Book</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container mt-5">
	<h1>Create New Book</h1>
	<form:form action="/books/new" method="post" modelAttribute="book"
		class="form-control">
		<div>
			<form:label path="title" class="form-label">Book Title: </form:label>
			<form:input path="title" type="text" class="form-control"/>
			<form:errors path="title" class="text-danger" />
		</div>
		<div>
		<form:label path="author" class="form-label">Author: </form:label>
			<form:input path="author" type="text" class="form-control"/>
			<form:errors path="author" class="text-danger" />
		</div>
		<div>
			<form:label path="description" class="description">Description: </form:label>
			<form:textarea path="description" type="description" class="form-control"></form:textarea>
			<form:errors path="description" class="text-danger" />
		</div>
		
		<form:hidden path="postedBy" value="${userId}"/>
		<button type="submit" class="btn btn-warning">Create a Book</button>
	</form:form>
	</div>
</body>
</html>