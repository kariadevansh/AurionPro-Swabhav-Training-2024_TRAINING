<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Transaction List</title>
</head>
<body>
<h2>Transaction List</h2>

<c:if test="${action eq 'viewTransactions'}">
    <c:if test="${not empty transactions}">
        <table border="1">
            <thead>
                <tr>
                    <th>Transaction ID</th>
                    <th>From Account</th>
                    <th>To Account</th>
                    <th>Transaction Type</th>
                    <th>Amount</th>
                    <th>Date</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="transaction" items="${transactions}">
                    <tr>
                        <td><c:out value="${transaction.transactionId}"/></td>
                        <td><c:out value="${transaction.fromAccount}"/></td>
                        <td><c:out value="${transaction.toAccount}"/></td>
                        <td><c:out value="${transaction.transactionType}"/></td>
                        <td><c:out value="${transaction.amount}"/></td>
                        <td><c:out value="${transaction.transactionDate}"/></td>
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
