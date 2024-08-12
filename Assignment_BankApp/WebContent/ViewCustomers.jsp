<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer List</title>
</head>
<body>
<h2>Customer List</h2>



<c:if test="${action eq 'viewCustomers'}">
    <c:if test="${not empty customers}">
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Account Number</th>
                    <th>Balance</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="customer" items="${customers}">
                    <c:forEach var="account" items="${customer.accounts}">
                        <tr>
                            <td><c:out value="${customer.id}"/></td>
                            <td><c:out value="${customer.firstName}"/></td>
                            <td><c:out value="${customer.lastName}"/></td>
                            <td><c:out value="${customer.email}"/></td>
                            <td><c:out value="${account.accountNumber}"/></td>
                            <td><c:out value="${account.balance}"/></td>
                        </tr>
                    </c:forEach>
                </c:forEach>
            </tbody>
        </table>
    </c:if>

    <c:if test="${empty customers}">
        <p>No customers found.</p>
    </c:if>
</c:if>
<%-- TODO ADD BACK BUTTON or INTEGRATE THIS PAGE PROPERLY IN ADMIN PANEL --%>
</body>
</html>
