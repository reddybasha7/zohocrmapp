<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    <%@  include file="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing List Page</title>
</head>
<body>
	<h2>List of All Billings</h2>
	<table>
		<tr>
		    <th>Invoice Number</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Product</th>
			<th>Amount</th>
			
		</tr>
		<c:forEach var="bill" items="${bill}">
			<tr>
				<td>${bill.invoiceNumber}</td>
				<td>${bill.firstName}</td>
				<td>${bill.lastName}</td>
				<td>${bill.email}</td>
				<td>${bill.mobile}</td>
				<td>${bill.product}</td>
				<td>${bill.amount}</td>
				
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>