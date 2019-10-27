<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
    <meta charset="utf-8">
    <title></title>
    <link rel="stylesheet" href="style.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.1/css/all.css">
    <style>
        *{
            margin: 0;
            padding: 0;
            font-family: "montserrat",sans-serif;
        }
        .header{
            height: 100px;
            background: #34495e;
            padding: 0 20px;
            color: #fff;
        }
        .logo{
            line-height: 100px;
            float: left;
            text-transform: uppercase;
        }

        .menu{
            float: right;
            line-height: 100px;
        }
        .menu a{
            color: #fff;
            text-transform: uppercase;
            text-decoration: none;
            padding: 0 10px;
            transition: 0.4s;
        }
        .show-menu-btn,.hide-menu-btn{
            transition: 0.4s;
            font-size: 30px;
            cursor: pointer;
            display: none;
        }
        .show-menu-btn{
            float: right;
        }
        .show-menu-btn i{
            line-height: 100px;
        }
        .menu a:hover,
        .show-menu-btn:hover,
        .hide-menu-btn:hover{
            color: #3498db;
        }

        #chk{
            position: absolute;
            visibility: hidden;
            z-index: -1111;
        }

        .content{
            padding: 0 20px;
        }
        .content img{
            width: 100%;
            max-width: 700px;
            margin: 20px 0;
        }
        .content p{
            text-align: justify;
        }

        @media screen and (max-width:800px) {
            .show-menu-btn,.hide-menu-btn{
                display: block;
            }
            .menu{
                position: fixed;
                width: 100%;
                height: 100vh;
                background: #333;
                right: -100%;
                top: 0;
                text-align: center;
                padding: 80px 0;
                line-height: normal;
                transition: 0.7s;
            }
            .menu a{
                display: block;
                padding: 20px;
            }
            .hide-menu-btn{
                position: absolute;
                top: 40px;
                right: 40px;
            }
            #chk:checked ~ .menu{
                right: 0;
            }
        }

    </style>
</head>
<body>

<div class="header">
    <h2 class="logo">STH</h2>
    <input type="checkbox" id="chk">
    <label for="chk" class="show-menu-btn">
        <i class="fas fa-ellipsis-h"></i>
    </label>

    <ul class="menu">

        <a href="/logout">logout</a>
        <label for="chk" class="hide-menu-btn">
            <i class="fas fa-times"></i>
        </label>
    </ul>
</div>


<div class="content">
    <center>
        <img src="img.jpg" alt="">
    </center>

    <p>
        The standard Lorem Ipsum passage, used since the 1500s.
    </p>
</div>
</body>
</html>
