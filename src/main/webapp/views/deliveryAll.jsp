<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
    <title>STH - All Deliveries</title>

    <style>
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
            width: 50%;

        }
        .button {
            color: white;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            /*margin-bottom: 25px;*/
            cursor: pointer;
            border: 4px solid peachpuff;
            padding: 14px 40px;
            border-radius: 34px;
            transition: 0.25s;
            background-color: #1c87c9;
            margin: 20px auto;
        }
        th, td {
            padding: 15px;
            text-align: left;

        }
        tr:nth-child(even) {background-color: darkgray;}
        tr:hover {background-color:navajowhite;}
        tr:nth-child(even){background-color: #f2f2f2}

        table {
            border-spacing: 5px;
            background-color: rebeccapurple;
        }
        body{
            background-color: #8e92e8;;
        }

    </style>

</head>
<body>

<center>
<a href="/delivery" class="button">Back</a>
<a href="/home" class="button">Home</a>

</center>
<center>
    <center><h1><caption>All deliveries</caption></h1></center>
<table width="50%">
    <tr>
        <th>ID</th>
        <th>Delivery Address</th>
        <th>Date of delivery</th>
        <th>Date of Order Placed</th>
        <th>Order ID</th>
        <th>vehicle used</th>
    </tr>
    <c:forEach items="${allDelivery}" var="credit">
        <tr>
            <td>${credit.getDeliveryID()}</td>
            <td>${credit.getDeliveryAddress()}</td>
            <td>${credit.getDateOfDelivery()}</td>
            <td>${credit.getDateOfOrderPlaced()}</td>
            <td>${credit.getOrderID()}</td>
            <td>${credit.getVehicleNO()}</td>
                <%--            <td><a href=""></a></td>--%>
                <%--           adding link to RUD operations--%>
                <%--            <td><a href="/dbms/login">Add to cart</a></td>--%>
        </tr>
    </c:forEach>
</table>

</center>

</body>
</html>