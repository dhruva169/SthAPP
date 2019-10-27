<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
    <meta charset="utf-8">
    <title></title>
    <link rel="stylesheet" href="style.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.1/css/all.css">
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
<div class="base">
    <h1>Welcome ${fName} ${lName}</h1>
<%--    <a href="/profile">View Profile</a><br>        shows his profile details in a drop down withou creating view--%>

    <a href="/logout" class="button">Logout</a>

<%--    <button id="LoginBtn" onclick="window.location.href = 'http://localhost:8080/login';">Click Here</button>--%>

    <div id="abc">
        <a href="/bankDeposits" class="button">Bank Deposits</a>
        <a href="/credit" class="button">Customer Credit</a><br>
        <a href="/customer" class="button">Customers</a>
        <a href="/delivery" class="button">Deliveries</a><br>
        <a href="/employee" class="button">Employees</a>
        <a href="/inventory" class="button">Inventory</a><br>
        <a href="/location" class="button">Location of Tyres</a>
<%--        <a href="/inventory" class="button">Inventory</a><br>--%>
        <a href="/order" class="button">All Orders</a><br>
        <a href="/supplier" class="button">Suppliers</a>
        <a href="/todo" class="button">ToDo</a><br>
        <a href="/tyre" class="button">Tyre Details</a>
        <a href="/vehicle" class="button">Vehicles</a><br>
    </div>



</div>

<%--<div class="header">--%>
<%--    <h2 class="logo">STH</h2>--%>
<%--    <input type="checkbox" id="chk">--%>
<%--    <label for="chk" class="show-menu-btn">--%>
<%--        <i class="fas fa-ellipsis-h"></i>--%>
<%--    </label>--%>

<%--    <ul class="menu">--%>
<%--        <a href="#">Home</a>--%>
<%--        <a href="/inventory">Inventory</a>--%>
<%--        <a href="orders">Orders</a>--%>
<%--        <a href="/bankDeposits">Bank Deposits</a>--%>
<%--        <a href="/todo">ToDo</a>--%>
<%--        <label for="chk" class="hide-menu-btn">--%>
<%--            <i class="fas fa-times"></i>--%>
<%--        </label>--%>
<%--    </ul>--%>
<%--</div>--%>


<div class="content">

</div>
</body>
</html>

