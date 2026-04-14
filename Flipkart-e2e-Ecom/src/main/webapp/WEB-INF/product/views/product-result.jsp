<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Result</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f1f3f6;
        margin: 0;
        padding: 30px;
    }

    h2 {
        text-align: center;
        color: #2874f0;
        margin-bottom: 30px;
    }

    .container {
        width: 700px;
        margin: auto;
        background: white;
        padding: 25px;
        border-radius: 8px;
        box-shadow: 0 4px 12px rgba(0,0,0,0.12);
    }

    .product-box {
        border: 1px solid #ddd;
        padding: 18px;
        margin-bottom: 20px;
        border-radius: 8px;
        background-color: #fafafa;
    }

    .product-box p {
        margin: 8px 0;
        font-size: 15px;
        color: #212121;
    }

    hr {
        border: none;
        border-top: 1px solid #ddd;
        margin-top: 15px;
    }
</style>
</head>
<body>

<div class="container">
    <h2>Search Result</h2>

    <c:forEach var="product" items="${products}">
        <div class="product-box">
            <p><b>ID:</b> ${product.productId}</p>
            <p><b>Name:</b> ${product.productName}</p>
            <p><b>Description:</b> ${product.description}</p>
            <p><b>Price:</b> ₹${product.price}</p>
            <p><b>Status:</b> ${product.status}</p>
            <p><b>Quantity:</b> ${product.quantity}</p>
        </div>
    </c:forEach>
</div>

</body>
</html>