<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Product</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f1f3f6;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    /* Center rectangular box */
    .menu-box {
        width: 400px;
        background: white;
        padding: 30px;
        border-radius: 8px;
        box-shadow: 0 4px 12px rgba(0,0,0,0.15);
        text-align: center;
    }

    .menu-box h2 {
        margin-bottom: 25px;
        color: #2874f0;
    }

    .menu-box a {
        display: block;
        text-decoration: none;
        background-color: #2874f0;
        color: white;
        padding: 14px;
        margin: 12px 0;
        border-radius: 4px;
        font-size: 16px;
        font-weight: bold;
        transition: 0.3s ease;
    }

    .menu-box a:hover {
        background-color: #0b5ed7;
    }
</style>
</head>
<body>

<div class="menu-box">
    <h2>Flipkart Menu</h2>
    <a href="home">Home</a>
    <a href="showsearch">search product</a>
    <a href="navigateview">view products</a>
    <a href="viewCart">view cart</a>
    <a href="createproduct">upload product</a>
</div>

</body>
</html>