<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html>
<head>
    <title>STH - Update Delivery</title>
</head>
<body>

<h2>Update Delivery</h2>

<div>
    <form:form action="/delivery/update" method="post" modelAttribute="newBankDeposits">
        <p>
            <label>Delievry ID</label>
            <form:input type="numnber" path="deliveryID" required="required"/>
        </p>
        <p>
            <label>Delivery Address</label>
            <form:input type="text" path="deliveryAddress" required="required"/>
        </p>
        <p>
            <label>Date Of Delivery</label>
            <form:input type="date" path="dateOfDelivery" required="required"/>
        </p>
        <p>
            <label>Date Of Order Placed</label>
            <form:input type="date" path="dateOfOrderPlaced" required="required"/>
        </p>
        <p>
            <label>Order ID</label>
            <form:input type="number" path="orderID" required="required"/>
        </p>
        <p>
            <label>Vehicle Number</label>
            <form:input type="text" path="vehicleNO" required="required"/>
        </p>
        <input type="submit" value="Submit">
    </form:form>
</div>

<a href="/delivery">Back</a><br>
<a href="/home">Home</a>

</body>
</html>

