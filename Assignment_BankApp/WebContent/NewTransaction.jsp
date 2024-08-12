<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>New Transaction</title>
</head>
<body>
    <h2>Make Transaction</h2>

    <!-- Form to submit transaction details -->
    <form action="${pageContext.request.contextPath}/NewTransaction" method="post">
        <c:choose>
            <c:when test="${param.transaction_type == 'transfer'}">
                Transfer To Account Number: <input type="text" name="to_account_number" value="${param.to_account_number}" /><br>
            </c:when>
            <c:otherwise>
                <input type="hidden" name="to_account_number" value="" />
            </c:otherwise>
        </c:choose>

        Amount: <input type="text" name="amount" value="${param.amount}" /><br>

        <input type="hidden" name="transaction_type" value="${param.transaction_type}" />

        <button type="submit">Submit</button>
        <button type="button" onclick="window.location.href='CustomerPanel.jsp?action=newTransaction';">Cancel</button>
    </form>
</body>
</html>