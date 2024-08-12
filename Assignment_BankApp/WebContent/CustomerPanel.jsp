<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Panel</title>
</head>
<body>
    <c:choose>
        <c:when test="${sessionScope.userType == 'customer'}">
            <h3>Welcome to Customer Panel: ${sessionScope.username}</h3>
            <ul>
                <li><a href="CustomerPanel.jsp?action=passbook">Passbook</a></li>
                <li><a href="CustomerPanel.jsp?action=newTransaction">New Transaction</a></li>
                <li><a href="CustomerPanel.jsp?action=viewProfile">Profile</a></li>
            </ul>
            <!-- Logout Form -->
            <form action="${pageContext.request.contextPath}/LogoutController" method="post">
                <button type="submit">Logout</button>
            </form>

            <div id="content">
                <c:choose>
                    <c:when test="${param.action == 'passbook'}">
                        <jsp:include page="Passbook.jsp" />
                        <form action="${pageContext.request.contextPath}/Passbook" method="get">
                            <button type="submit">View Now</button>
                        </form>
                    </c:when>

                    <c:when test="${param.action == 'newTransaction'}">
                        <!-- Dropdown to select transaction type -->
                        <form action="${pageContext.request.contextPath}/NewTransaction" method="get">
                            Transaction Type: 
                            <select name="transaction_type" onchange="this.form.submit()">
                                <option value="" <c:if test="${empty param.transaction_type}">selected</c:if>>Select Type</option>
                                <option value="credit" <c:if test="${param.transaction_type == 'credit'}">selected</c:if>>Credit</option>
                                <option value="debit" <c:if test="${param.transaction_type == 'debit'}">selected</c:if>>Debit</option>
                                <option value="transfer" <c:if test="${param.transaction_type == 'transfer'}">selected</c:if>>Transfer</option>
                            </select>
                        </form>

                        <c:if test="${not empty param.transaction_type}">
                            <jsp:include page="NewTransaction.jsp">
                                <jsp:param name="transactionType" value="${param.transaction_type}" />
                            </jsp:include>
                        </c:if>
                    </c:when>

                    <c:when test="${param.action == 'viewProfile'}">
                        <!-- View Profile Button -->
                        <jsp:include page="Profile.jsp" />
                        <form action="${pageContext.request.contextPath}/ProfileUpdate" method="get">
                            <button type="submit">View Profile</button>
                        </form>
                        
                    </c:when>
                </c:choose>
            </div>
        </c:when>
    </c:choose>
</body>
</html>
