<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html>
<head>
    <title>STH - Deposits</title>
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
<div>

    <a href="/bankDeposits/all" class="button">View All Deposits</a><br>
    <a href="/bankDeposits/add" class="button">Add Deposit Entry</a><br>
    <a href="/bankDeposits/update" class="button">Update existing Entry</a><br>
<%--    <a href="/bankDeposits/${depositDate}" class="button">Get Deposit by Date</a>--%>
    <br>

    

</div>

    <a href="/home" class="button">Home</a>


</body>
</html>

