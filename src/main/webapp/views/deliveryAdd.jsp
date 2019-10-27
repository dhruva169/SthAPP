<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html>
<head>
    <title>STH - Add New Delivery</title>
    <style>
        input[type=text] {
            width: 20%;
            padding: 12px 20px;
            margin: 8px 0;
            box-sizing: border-box;
            border: 2px solid red;
            border-radius: 4px;
        }
        input[type=text]:focus {
            background-color: darkgray;
            width: 50%;
        }
        input[type=number] {
            width: 20%;
            padding: 12px 20px;
            margin: 8px 0;
            box-sizing: border-box;
            border: 2px solid red;
            border-radius: 50px;
            background-repeat: no-repeat;
            -webkit-transition: width 0.4s ease-in-out;
            transition: width 0.4s ease-in-out;
        }
        input[type=number]:focus {
            background-color: darkgray;
            width: 50%;
        }
        input[type=text]{
            width: 20%;
            padding: 12px 20px;
            margin: 8px 0;
            box-sizing: border-box;
            border: 2px solid red;
            border-radius: 50px;
            background-repeat: no-repeat;
            -webkit-transition: width 0.4s ease-in-out;
            transition: width 0.4s ease-in-out;
        }
        input[type=text]:focus {
            background-color: darkgray;
            width: 50%;
        }

        input[type=date] {
            width: 20%;
            padding: 12px 20px;
            margin: 8px 0;
            box-sizing: border-box;
            border: 2px solid red;
            border-radius: 50px;
            background-repeat: no-repeat;
            -webkit-transition: width 0.4s ease-in-out;
            transition: width 0.4s ease-in-out;
        }
        input[type=date]:focus {
            background-color: darkgray;
            width: 50%;
        }


        fieldset {
            display: block;
            padding: 0.35em 0.75em 0.625em;
            border: 10px groove;
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
        body{
            text-align: center;
            background-color: #8e92e8;
            background-size: cover;
            font-family: sans-serif;
        }


    </style>




</head>
<body>

<a href="/delivery" class="button">Back</a>
<a href="/home" class="button">Home</a>



<h1>Add New Delivery</h1>

<div>
    <form:form action="/delivery/add" method="post" modelAttribute="newDelivery">
        <fieldset>
        <p>
            <label>Delievry ID</label>
            <form:input type="number" path="deliveryID" required="required"/>
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
        <input type="submit" value="Submit" class="button">
        </fieldset>
    </form:form>
</div>



</body>
</html>

