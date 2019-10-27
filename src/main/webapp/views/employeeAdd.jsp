<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
    <title>STH - Add New Employee</title>

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

<a href="/employee" class="button">Back</a>
<a href="/home" class="button">Home</a>

<h2>Add New Employee</h2>

<div>
    <form:form action="/employee/add" method="post" modelAttribute="newEmployee">
        <fieldset>
        <p>
            <label>UserName</label>
            <form:input type="text" path="username" required="required"/>
        </p>
        <p>
            <label>Password</label>
            <form:input type="password" path="password" required="required"/>
        </p>
        <p>
            <label>First Name</label>
            <form:input type="text" path="fName" required="required"/>
        </p>
        <p>
            <label>Last Name</label>
            <form:input type="text" path="lName" required="required"/>
        </p>
        <p>
            <label>Designation</label>
            <form:input type="text" path="designation" required="required"/>
        </p>
        <p>
            <label>Joining Date</label>
            <form:input type="date" path="joiningDate" required="required"/>
        </p>
        <p>
            <label>Phone Number</label>
            <form:input type="text" path="phoneNo" required="required"/>
        </p>
        <p>
            <label>Salary</label>
            <form:input type="number" path="salary" required="required"/>
        </p>
        <p>
            <label>Address</label>
            <form:input type="text" path="address" required="required"/>
        </p>
        <p>
            <label>isEnabled</label>
            <form:input type="numeber" path="enabled" required="required"/>
        </p>

            <input type="submit" value="Submit">
        </fieldset>
    </form:form>
</div>



</body>
</html>

