<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Zomato Items</title>

<style>

/* 🔴 Zomato Theme */
body {
    font-family: Arial, sans-serif;
    background-color: #f8f8f8;
    margin: 0;
}

/* Header */
.header {
    background-color: #e23744;
    color: white;
    padding: 15px 30px;
    font-size: 24px;
    font-weight: bold;
}

/* Container */
.container {
    padding: 20px;
}

/* Card Layout */
.card-container {
    display: flex;
    flex-wrap: wrap;
    gap: 20px;
}

/* Card */
.card {
    background: white;
    width: 280px;
    border-radius: 12px;
    box-shadow: 0px 4px 10px rgba(0,0,0,0.1);
    overflow: hidden;
    transition: transform 0.2s;
}

.card:hover {
    transform: scale(1.05);
}

/* Image */
.card img {
    width: 100%;
    height: 160px;
    object-fit: cover;
}

/* Content */
.card-content {
    padding: 15px;
}

.card-title {
    font-size: 18px;
    font-weight: bold;
}

.price {
    color: #e23744;
    font-weight: bold;
    margin-top: 5px;
}

.desc {
    font-size: 14px;
    color: gray;
    margin-top: 5px;
}

.quantity {
    margin-top: 8px;
    font-size: 13px;
}

/* Update Button */
.update-btn {
    background-color: #e23744;
    color: white;
    border: none;
    padding: 8px 15px;
    border-radius: 6px;
    cursor: pointer;
    font-size: 14px;
}

.update-btn:hover {
    background-color: #c92d3a;
}

</style>

</head>
<body>

<div class="header">
    Zomato Menu 🍽️
</div>

<div class="container">

    <div class="card-container">

        <c:forEach var="item" items="${items}">
            <div class="card">

                <!-- Food Image -->
                <img src="https://source.unsplash.com/300x200/?food" />

                <div class="card-content">

                    <div class="card-title">
                        ${item.itemName}
                    </div>

                    <div class="price">
                        ₹ ${item.price}
                    </div>

                    <div class="desc">
                        ${item.description}
                    </div>

                    <div class="quantity">
                        Available: ${item.quantity}
                    </div>

                    <!-- 🔴 Update Button -->
                    <div style="margin-top: 10px;">
                        <a href="editItem/${item.itemId}">
                            <button class="update-btn">Update</button>
                        </a>
                    </div>

                </div>

            </div>
        </c:forEach>

    </div>

</div>

</body>
</html>