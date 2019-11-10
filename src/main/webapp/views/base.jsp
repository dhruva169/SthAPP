<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
    <meta charset="utf-8">
    <title></title>
    <link rel="stylesheet" href="style.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.1/css/all.css">
    <style>

        body {
                  height: 93vh;
            background-color: #8e92e8;
                   background-size: cover;
            font-family: sans-serif;
               }
        h1 {
            color: peachpuff;
            text-align: center;
            font-size: 500%;
        }

        #LoginBtn
         {
            background-color: #1c87c9;
            color: white;
            text-align: center;
            text-decoration: none;
            display: block;
            font-size: 20px;
            margin: 20px auto;
            cursor: pointer;
            border: 4px solid peachpuff;
            padding: 14px 40px;
            border-radius: 34px;
            transition: 0.25s;
            text-transform: uppercase;
        }
        .paragraph {
            text-align: center;
            font-size: 250%;

            margin: 100px;


        }




    </style>
</head>

<body>
<h1>Welcome to STH management Application</h1>

<p class="paragraph">
    STH is based on the ground rules that we serve our customer the best with complete honesty and loyalty.
</p>

<div>
<%--    <a href="/login">Login</a>--%>

    <button id="LoginBtn" onclick="window.location.href = 'https://sushila-tyre-house.herokuapp.com/login';">Click Here</button>

</div>

</body>
</html>

