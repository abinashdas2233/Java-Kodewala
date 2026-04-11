<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rapido - Success</title>

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

    .success-container {
        background: #fff;
        padding: 40px;
        border-radius: 15px;
        width: 350px;
        text-align: center;
        box-shadow: 0 10px 25px rgba(0,0,0,0.2);
        animation: fadeIn 0.6s ease-in-out;
    }

    .icon {
        font-size: 50px;
        color: green;
        margin-bottom: 15px;
    }

    .message {
        font-size: 20px;
        font-weight: bold;
        color: #222;
        margin-bottom: 10px;
    }

    .subtext {
        font-size: 14px;
        color: #666;
        margin-bottom: 25px;
    }

    .btn {
        text-decoration: none;
        background: #000;
        color: #FFD54F;
        padding: 12px 25px;
        border-radius: 25px;
        font-size: 14px;
        font-weight: bold;
        transition: 0.3s;
        display: inline-block;
    }

    .btn:hover {
        background: #333;
        transform: scale(1.05);
    }

    @keyframes fadeIn {
        from {
            opacity: 0;
            transform: translateY(20px);
        }
        to {
            opacity: 1;
            transform: translateY(0);
        }
    }

</style>

</head>
<body>

    <div class="success-container">
        <div class="icon">✔️</div>
        <div class="message">Login Successful!</div>
        <div class="subtext">Welcome to Rapido 🚕</div>

        <a href="redirectlogin" class="btn">Logout</a>
    </div>

</body>
</html>