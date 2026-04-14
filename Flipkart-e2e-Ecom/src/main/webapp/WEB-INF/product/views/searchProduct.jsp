<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Product</title>

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

    .search-box {
        width: 420px;
        background: white;
        padding: 35px;
        border-radius: 8px;
        box-shadow: 0 4px 12px rgba(0,0,0,0.12);
        text-align: center;
    }

    .home-btn {
        display: inline-block;
        text-decoration: none;
        background-color: #2874f0;
        color: white;
        padding: 10px 18px;
        border-radius: 4px;
        font-weight: bold;
        margin-bottom: 20px;
    }

    .home-btn:hover {
        background-color: #0b5ed7;
    }

    h2 {
        color: #2874f0;
        margin-bottom: 20px;
    }

    input {
        width: 100%;
        padding: 12px;
        border: 1px solid #dcdcdc;
        border-radius: 4px;
        box-sizing: border-box;
        margin-bottom: 18px;
        font-size: 14px;
    }

    button {
        width: 100%;
        padding: 12px;
        background-color: #2874f0;
        color: white;
        border: none;
        border-radius: 4px;
        font-size: 16px;
        font-weight: bold;
        cursor: pointer;
    }

    button:hover {
        background-color: #0b5ed7;
    }
</style>
</head>
<body>

<div class="search-box">
    <a href="home" class="home-btn">Home</a>

    <h2>Search Product</h2>

    <form action="search" method="get">
        <input type="text" 
               name="productName"
               placeholder="Enter product name" 
               required>
        <button type="submit">Search</button>
    </form>
</div>

</body>
</html>