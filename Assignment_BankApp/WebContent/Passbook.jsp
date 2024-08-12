<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Passbook</title>
</head>
<body>
	<h3>Passbook Entries:</h3>
 <%-- for debugging  use <p>Action: ${action}</p>--%>

 <!--#TODO : add a section above the table for current balance  -->
 <!-- /*add the corresponding functions to retrieve the balance from db*/ -->
	<c:if test="${action eq 'passbook'}">
		<c:if test="${not empty transactions}">
			<table border="1">
				<thead>
					<tr>
						<th>Sender Account No</th>
						<th>Receiver Account No</th>
						<th>Transaction Type</th>
						<th>Amount</th>
						<th>Date</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="transaction" items="${transactions}">
						<tr>
							<td><c:out value="${transaction.fromAccount}" /></td>
							<td><c:out value="${transaction.toAccount}" /></td>
							<td><c:out value="${transaction.transactionType}" /></td>
							<td><c:out value="${transaction.amount}" /></td>
							<td><c:out value="${transaction.transactionDate}" /></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>

		<c:if test="${empty transactions}">
			<p>No transactions found.</p>
		</c:if>
	</c:if>

</body>
</html>