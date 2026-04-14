<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cart Items</title>
<style>
    body{
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 30px;
        background-color: #f1f3f6;
    }

    h2{
        text-align: center;
        color: #2874f0;
        margin-bottom: 30px;
    }

    .main-container{
        width: 700px;
        margin: auto;
        background: white;
        padding: 25px;
        border-radius: 8px;
        box-shadow: 0 4px 12px rgba(0,0,0,0.12);
    }

    .btn{
        padding: 10px 18px;
        color: white;
        text-decoration: none;
        border-radius: 4px;
        margin-right: 10px;
        display: inline-block;
        font-weight: bold;
    }

    .remove-btn{
        background-color: #d32f2f;
    }

    .remove-btn:hover{
        background-color: #b71c1c;
    }

    .pay-btn{
        background-color: #2874f0;
    }

    .pay-btn:hover{
        background-color: #0b5ed7;
    }

    .cart-box{
        border: 1px solid #ddd;
        padding: 20px;
        margin-bottom: 20px;
        border-radius: 8px;
        background-color: #fafafa;
    }

    .cart-box p{
        margin: 8px 0;
        font-size: 15px;
    }

    .summary{
        border-top: 2px solid #ddd;
        margin-top: 25px;
        padding-top: 20px;
        text-align: center;
    }

    .summary h3{
        margin-bottom: 20px;
        color: #212121;
    }
</style>
</head>
<body>

<div class="main-container">

<h2>Cart Items</h2>

<c:set var="grandTotal" value="0" />

<c:forEach var="item" items="${cartItems}">
    <div class="cart-box">
        <p><b>Cart ID:</b> ${item.cartId}</p>
        <p><b>Product ID:</b> ${item.productId}</p>
        <p><b>Name:</b> ${item.productName}</p>
        <p><b>Price:</b> ₹${item.price}</p>
        <p><b>Quantity:</b> ${item.quantity}</p>

        <p>
            <b>Total Price:</b>
            ₹${item.price * item.quantity}
        </p>

        <c:set var="grandTotal"
               value="${grandTotal + (item.price * item.quantity)}" />

        <a class="btn remove-btn"
           href="deleteCartItem?cartId=${item.cartId}">
            Remove
        </a>
    </div>
</c:forEach>

<div class="summary">
    <h3>Grand Total: ₹${grandTotal}</h3>

    <a class="btn pay-btn"
       href="paymentPage?<c:forEach var='item' items='${cartItems}' varStatus='status'>productId=${item.productId}<c:if test='${!status.last}'>&</c:if></c:forEach>">
        Proceed To Payment
    </a>
</div>

</div>

</body>
</html>