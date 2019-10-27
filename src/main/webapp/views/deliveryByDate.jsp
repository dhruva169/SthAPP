<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
    <title>STH - Delivery By Date</title>
    <caption>Delivery By Date</caption>
    <style>
        /*body{*/
        /*    align-content:center;*/
        /*}*/
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
        }
        th, td {
            padding: 15px;
        }
        th {
            text-align: left;
        }
        table {
            border-spacing: 5px;
        }

    </style>
</head>
<body>

<table width="50%">
    <tr>
        <th>All Deliveries By Date</th>
        <th>Delivery ID</th>
        <th>Delivery Address</th>
        <th>Date of Delivery</th>
        <th>Date of Order Placed</th>
        <th>Order ID</th>
        <th>Vehicle No</th>
    </tr>
    <c:forEach items="${credit}" var="credit">
        <tr>
            <td>${credit.getId()}</td>
            <td>${credit.getDueDate()}</td>
            <td>${credit.getAmount()}</td>
            <td>${credit.getCustID()}</td>
                <%--            <td><a href=""></a></td>--%>
                <%--           adding link to RUD operations--%>
                <%--            <td><a href="/dbms/login">Add to cart</a></td>--%>
        </tr>
    </c:forEach>
</table>

<a href="/credit">Back</a><br>
<a href="/home">Home</a>

</body>
</html>