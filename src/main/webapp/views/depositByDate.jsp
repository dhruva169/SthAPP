<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
    <title>STH - All Deposits</title>
    <caption>All Deposits</caption>
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

${error}

<h3><input id="myInput" value="" placeholder="Enter Date">
    <button id="myBtn">Submit Date</button></h3>
<br>

<script type="text/javascript">
    var message = document.getElementById("myInput");
    document.getElementById("myBtn").addEventListener("click", function() {
        // alert("Your Order has been placed......");
        location.href="/bankDeposits/"+message.value;
    });
</script>




</body>
</html>