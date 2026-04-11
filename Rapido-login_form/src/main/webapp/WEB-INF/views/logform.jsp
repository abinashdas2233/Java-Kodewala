<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rapido - Login</title>

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

    .login-container {
        background: #fff;
        padding: 40px;
        border-radius: 15px;
        width: 350px;
        box-shadow: 0 10px 25px rgba(0,0,0,0.2);
        text-align: center;
    }

    .logo {
        font-size: 30px;
        font-weight: bold;
        color: #222;
        margin-bottom: 5px;
    }

    .subtitle {
        font-size: 14px;
        color: #777;
        margin-bottom: 25px;
    }

    .input-field {
        width: 100%;
        padding: 12px;
        margin: 10px 0;
        border: 1px solid #ccc;
        border-radius: 8px;
        outline: none;
        transition: 0.3s;
        font-size: 14px;
    }

    .input-field:focus {
        border-color: #FFB300;
        box-shadow: 0 0 5px rgba(255,179,0,0.5);
    }

    .btn {
        width: 100%;
        padding: 12px;
        background: #000;
        color: #FFD54F;
        border: none;
        border-radius: 25px;
        font-size: 16px;
        font-weight: bold;
        cursor: pointer;
        margin-top: 15px;
        transition: 0.3s;
    }

    .btn:hover {
        background: #333;
        transform: scale(1.03);
    }

</style>

</head>
<body>

    <div class="login-container">
        <div class="logo">Rapido</div>
        <div class="subtitle">Login to continue</div>

        <form action="logdata" method="post">
            <input type="email" name="email" class="input-field" placeholder="Enter email" required>
            
            <input type="password" name="password" class="input-field" placeholder="Enter password" required>
            
            <input type="submit" value="Login" class="btn">
        </form>
    </div>

</body>
</html>