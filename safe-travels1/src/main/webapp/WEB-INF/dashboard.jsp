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
<title>travel</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div>

		<p>
			<a href="/travels/new">Create new travel</a>
		</p>

		<h1>Save Travels</h1>
		<table class="table">
			<thead>
				<tr>
					<th>Expense</th>
					<th>Vendor</th>
					<th>amount</th>
					<th>actions</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach var="eachTravel" items="${ travelList}">
					<tr>
						<td><a href="/travels/${eachTravel.id }"> <c:out
									value="${eachTravel.expense}" /></a></td>

						<td><c:out value="${eachTravel.vendor }" /></td>
						<td><c:out value="${eachTravel.amount}" /></td>
						<td><a href="/travels/edit/${eachTravel.id}">Edit </a></td>
						<td><form action="/travels/delete/${travel.id }"
								method="post">
								<input type="hidden" name="_method" value="delete" />
								<button type="submit" class="btn btn-danger">Delete</button>
							</form></td>
					</tr>

				</c:forEach>
			</tbody>
		</table>



	</div>
</body>
</html>