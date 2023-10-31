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
<title>new</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container mt-5">
		<h1>Edit Travel</h1>
		<form:form action="/travels/edit/${travel.id }" method="post" modelAttribute="travel"
			class="form-control">
			<div>
				<form:label path="expense" class="form-label">expense: </form:label>
				<form:input path="expense" type="text" class="form-control" />
				<form:errors path="expense" class="text-danger" />
			</div>
			<div>
				<form:label path="vendor" class="form-label">Vendor: </form:label>
				<form:input path="vendor" type="text" class="form-control" />
				<form:errors path="vendor" class="text-danger" />
			</div>
			<div>
				<form:label path="amount" class="form-label">amount: </form:label>
				<form:input path="amount" type="number" class="form-control" />
				<form:errors path="amount" class="text-danger" />
			</div>
			
			<button type="submit" class="btn btn-warning">Edit
				Travel</button>
		</form:form>
	</div>
</body>
</html>