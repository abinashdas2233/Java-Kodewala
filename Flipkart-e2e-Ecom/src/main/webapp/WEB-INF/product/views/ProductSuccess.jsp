<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f1f3f6;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        min-height: 100vh;
    }

    .success-box {
        width: 420px;
        background: white;
        padding: 40px;
        border-radius: 8px;
        box-shadow: 0 4px 12px rgba(0,0,0,0.12);
        text-align: center;
    }

    .home-btn{
        display: inline-block;
        text-decoration: none;
        background-color: #2874f0;
        color: white;
        padding: 10px 18px;
        border-radius: 4px;
        font-weight: bold;
        margin-bottom: 20px;
    }

    .home-btn:hover{
        background-color: #0b5ed7;
    }

    h1 {
        color: #2874f0;
        font-size: 28px;
        margin: 0;
    }
</style>
</head>
<body>

<div class="success-box">
    <a href="home" class="home-btn">Home</a>
    <h1>successfully created</h1>
</div>

</body>
</html>