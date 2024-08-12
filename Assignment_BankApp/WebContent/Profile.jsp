<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile</title>
</head>
<body>
	<h2>Profile</h2>

	<!-- Display Profile Information -->
	<c:if test="${not empty requestScope.profile}">
		<h2>Profile Information</h2>
		<p>First Name: ${requestScope.profile.firstName}</p>
		<p>Last Name: ${requestScope.profile.lastName}</p>
		<p>Email: ${requestScope.profile.email}</p>

		<!-- Update Profile Form -->
		<form action="${pageContext.request.contextPath}/ProfileUpdate"
			method="post">
			<h3>Update Profile</h3>
			First Name: <input type="text" name="firstName" value="${requestScope.profile.firstName}" /><br> 
			Last Name: <input type="text" name="lastName" value="${requestScope.profile.lastName}" /><br>
			Password: <input type="password" name="password" /><br>
			<button type="submit">Update</button>
			<button type="button"
				onclick="window.location.href='CustomerPanel.jsp?action=viewProfile';">Cancel</button>
		</form>
	</c:if>
</body>
</html>
