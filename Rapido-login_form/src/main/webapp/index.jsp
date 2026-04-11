<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rapido - Home</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: 'Segoe UI', sans-serif;
        background: linear-gradient(135deg, #FFD54F, #FFB300);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .container {
        text-align: center;
        background: white;
        padding: 40px;
        border-radius: 15px;
        box-shadow: 0 10px 25px rgba(0,0,0,0.2);
        width: 350px;
    }

    .logo {
        font-size: 32px;
        font-weight: bold;
        color: #222;
        margin-bottom: 10px;
    }

    .tagline {
        font-size: 14px;
        color: #666;
        margin-bottom: 30px;
    }

    .btn {
        display: inline-block;
        text-decoration: none;
        background: #000;
        color: #FFD54F;
        padding: 12px 25px;
        border-radius: 25px;
        font-size: 16px;
        font-weight: bold;
        transition: 0.3s ease;
    }

    .btn:hover {
        background: #333;
        transform: scale(1.05);
    }

</style>

</head>
<body>

    <div class="container">
        <div class="logo">Rapido</div>
        <div class="tagline">India’s Bike Taxi Service</div>

        <a href="redirectlogin" class="btn">Open Login</a>
    </div>

</body>
</html>