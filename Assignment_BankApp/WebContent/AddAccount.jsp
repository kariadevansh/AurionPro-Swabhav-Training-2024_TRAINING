<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Add Account</title>
</head>
<body>
    <!-- Display List of Customers Without Accounts -->
    <c:if test="${not empty customersWithoutAccount}">
        <h3>Customers Without Accounts</h3>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="customer" items="${customersWithoutAccount}">
                    <tr>
                        <td><c:out value="${customer.id}"/></td>
                        <td><c:out value="${customer.firstName}"/></td>
                        <td><c:out value="${customer.lastName}"/></td>
                        <td><c:out value="${customer.email}"/></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </c:if>

    <c:if test="${empty customersWithoutAccount}">
        <p>No customers found without accounts.</p>
    </c:if>

    <!-- Form to Create New Account -->
    <h3>Create New Account</h3>
    <form action="${pageContext.request.contextPath}/Admin" method="post">
        <input type="hidden" name="action" value="generateAccountNumber">
        <label for="customer_id">Customer ID:</label>
        <select id="customer_id" name="customer_id" required>
            <c:forEach var="customer" items="${customersWithoutAccount}">
                <option value="${customer.id}">${customer.firstName} ${customer.lastName} (${customer.email})</option>
            </c:forEach>
             
        </select><br>
        
        <label for="balance">Initial Balance:</label>
        <input type="number" id="balance" name="balance" min="0" required><br>
        
        <button type="submit">Generate Account Number</button>
    </form>
</body>
</html>
