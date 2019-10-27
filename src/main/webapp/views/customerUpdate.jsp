<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html>
<head>
    <title>STH - Update Customer</title>
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

        input[type=submit]{
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

<a href="/customer" class="button">Back</a>
<a href="/home" class="button">Home</a>


<h1>Update Customer</h1>

<div>
    <form:form action="/customer/update" method="post" modelAttribute="newBankDeposits">

        <p>
            <label>Customer ID</label>
            <form:input type="number" path="custId" required="required"/>
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
            <label>Pan Number</label>
            <form:input type="text" path="panNo" required="required"/>
        </p>
        <p>
            <label>Aadhar Number</label>
            <form:input type="text" path="aadharNo" required="required"/>
        </p>
        <p>
            <label>Phone Number</label>
            <form:input type="text" path="phoneNo" required="required"/>
        </p>
        <p>
            <label>E-mail</label>
            <form:input type="text" path="email" required="required"/>
        </p>
        <p>
            <label>Address</label>
            <form:input type="text" path="address" required="required"/>
        </p>
        <p>
            <label>Business Type</label>
            <form:input type="text" path="businessType" required="required"/>
        </p>

        <input type="submit" value="Submit">
    </form:form>
</div>


</body>
</html>

