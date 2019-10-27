<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html>
<head>
    <title>STH - Supplier</title>
    <style>
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

<a href="/home" class="button">Home</a>


<div>

    <a href="/supplier/all" class="button">View All Suppliers</a><br>
    <a href="/supplier/add" class="button">Add Supplier</a><br>
    <a href="/supplier/update" class="button">Update existing Supplier</a><br>
<%--    <a href="/supplier/${id}" class="button">Supplier By suppID</a>--%>
    <%--    <a href="/employee/delete/${id}">Customer By custID</a>--%>

    <br>



</div>



</body>
</html>

