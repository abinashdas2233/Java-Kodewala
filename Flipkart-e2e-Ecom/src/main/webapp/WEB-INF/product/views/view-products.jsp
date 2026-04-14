<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Products</title>
<style>
    body{
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 30px;
        background-color: #f1f3f6;
    }

    .main-container{
        width: 750px;
        margin: auto;
        background: white;
        padding: 25px;
        border-radius: 8px;
        box-shadow: 0 4px 12px rgba(0,0,0,0.12);
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

    h2{
        text-align: center;
        color: #2874f0;
        margin-bottom: 25px;
    }

    .card{
        border: 1px solid #ddd;
        padding: 20px;
        margin-bottom: 20px;
        border-radius: 8px;
        background-color: #fafafa;
    }

    .card p{
        margin: 8px 0;
    }

    .btn{
        padding: 10px 16px;
        background-color: #2874f0;
        color: white;
        text-decoration: none;
        border-radius: 4px;
        border: none;
        cursor: pointer;
        font-weight: bold;
        margin-top: 10px;
    }

    .btn:hover{
        background-color: #0b5ed7;
    }

    input[type="number"]{
        width: 100%;
        padding: 10px;
        margin-top: 8px;
        margin-bottom: 12px;
        border: 1px solid #dcdcdc;
        border-radius: 4px;
        box-sizing: border-box;
    }
</style>
</head>
<body>

<div class="main-container">

    <a href="home" class="home-btn">Home</a>

    <h2>All Products</h2>

    <c:forEach var="product" items="${products}">
        <div class="card">
            <p><b>ID:</b> ${product.productId}</p>
            <p><b>Name:</b> ${product.productName}</p>
            <p><b>Description:</b> ${product.description}</p>
            <p><b>Price:</b> ₹${product.price}</p>
            <p><b>Status:</b> ${product.status}</p>
            <p><b>Quantity:</b> ${product.quantity}</p>

            <form action="addToCart" method="get">
                <input type="hidden" 
                       name="productId" 
                       value="${product.productId}">

                <label><b>Enter Quantity:</b></label>
                <input type="number" 
                       name="quantity" 
                       min="1" 
                       max="${product.quantity}" 
                       required>

                <button class="btn" type="submit">
                    Add To Cart
                </button>
            </form>
        </div>
    </c:forEach>

</div>

</body>
</html>