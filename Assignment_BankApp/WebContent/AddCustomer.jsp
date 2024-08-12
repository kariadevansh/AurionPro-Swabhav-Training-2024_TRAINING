<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Add New Customer</title>
</head>
<body>
    <h2>Add New Customer</h2>
    <form action="${pageContext.request.contextPath}/Admin" method="post">
   	    <input type="hidden" name="action" value="addCustomer">	
        <label for="first_name">First Name:</label>
        <input type="text" id="name" name="first_name" required><br>
        <label for="last_name">Last Name:</label>
        <input type="text" id="name" name="last_name" required><br>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br>
         <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br>
        <button type="submit">Submit</button>
        <button type="reset">Cancel</button>
    </form>
</body>
</html>
	