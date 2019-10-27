<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Order Tyre</title>
    <style>
        input[type=text] {
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
<p>Tyre Model Number: ${modelNo}</p>
${error}
<p>Stock: ${inventory.quantity}</p>
<%--<h3><input id="myInput" value="" placeholder="Enter quantity">--%>
<%--    <button id="myBtn">Place order</button></h3>--%>
<%--<br>--%>

<form:form action="/order/${modelNo}" method="post" modelAttribute="placeOrder">
    <fieldset>
        <p>
    <label>OverHeadCharges</label>
    <form:input path="overheadCharges" type="number" required="required"/>
        </p>
        <p>
            <label>Payment Mode</label>
            <form:input path="paymentMode" type="text" required="required"/>
        </p>
        <p>
            <label>Status</label>
            <form:input path="status" type="text" required="required"/>
        </p>
        <p>
            <label>Customer ID</label>
            <form:input path="custID" type="number" required="required"/>
        </p>
        <p>
            <label>Model Number</label>
            <form:input path="modelNo" type="text" required="required"/>
        </p>
        <p>
            <label>Quantity</label>
            <form:input path="quantity" type="number" required="required"/>
        </p>

        <input type="submit" value="Place Order" class="button">
    </fieldset>
</form:form>


</body>
</html>