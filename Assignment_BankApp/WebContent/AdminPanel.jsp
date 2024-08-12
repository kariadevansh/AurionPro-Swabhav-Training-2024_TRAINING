<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Panel</title>
</head>
<body>
	<c:choose>
		<c:when test="${sessionScope.userType == 'admin'}">
			<h3>Welcome to Admin Panel: ${sessionScope.username}</h3>
			<ul>
				<li><a href="AdminPanel.jsp?action=addCustomer">Add New
						Customer</a></li>
				<li><a href="AdminPanel.jsp?action=addAccount">Add Bank
						Account</a></li>
				<li><a href="AdminPanel.jsp?action=viewCustomers">View
						Customers</a></li>
				<li><a href="AdminPanel.jsp?action=viewTransactions">View
						Transactions</a></li>
			</ul>

			<!-- Logout Form -->
			<form action="${pageContext.request.contextPath}/LogoutController"
				method="post">
				<button type="submit">Logout</button>
			</form>

			<!-- Placeholder for dynamic content -->
			<div id="content">
				<c:choose>
					<c:when test="${param.action == 'addCustomer'}">
						<jsp:include page="AddCustomer.jsp" />
					</c:when>
					<c:when test="${param.action == 'addAccount'}">
						<!-- Form to Fetch Customers Without Accounts -->
						<h3>Fetch Customers Without Accounts</h3>
						<form action="${pageContext.request.contextPath}/ViewCustomersWithoutAccount"
							method="get">
							<input type="hidden" name="action"
								value="viewCustomersWithoutAccount" />
							<button type="submit">Fetch Customers Without Accounts</button>
						</form>
						<jsp:include page="AddAccount.jsp" />
					</c:when>
					<c:when test="${param.action == 'viewCustomers'}">
						<jsp:include page="ViewCustomers.jsp" />
						<form action="${pageContext.request.contextPath}/ViewCustomers"
							method="get">

							<button type="submit">View Now</button>

						</form>
					</c:when>
					<c:when test="${param.action == 'viewTransactions'}">
						<jsp:include page="ViewTransaction.jsp" />
						<form action="${pageContext.request.contextPath}/ViewTransactions"
							method="get">
							<button type="submit">View Now</button>
						</form>
					</c:when>
				</c:choose>
			</div>
		</c:when>
	</c:choose>
</body>
</html>
