<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html>
<head>
    <title>STH - Customers</title>

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

        #myInput{
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

        #myBtn{
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


    </style>

</head>
<body>

<div>

    <h1>Place Order</h1><br>
    <h3><input id="myInput" value="" placeholder="Enter Model Number">
        <button id="myBtn">Place order</button></h3>
    <br>

    <script type="text/javascript">
        var message = document.getElementById("myInput");
        document.getElementById("myBtn").addEventListener("click", function() {
            // alert("Your Order has been placed......");
            location.href="/order/"+message.value;
        });
    </script>


<%--    <a href="/order/${modelNo}" class="button">Place Order</a><br>--%>

    <br>



</div>
<br>

<a href="/home" class="button">Home</a>


</body>
</html>

