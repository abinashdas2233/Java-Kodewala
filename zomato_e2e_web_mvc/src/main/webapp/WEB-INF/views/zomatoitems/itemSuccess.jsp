<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
<style>
    /* ===== Body & Background ===== */
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-color: #fff3f3; /* light Zomato red tint */
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
        flex-direction: column;
    }

    h1 {
        color: #2a2a2a;
        margin-bottom: 30px;
        text-align: center;
        font-size: 2em;
    }

    /* ===== Button ===== */
    .btn {
        background-color: #e23744; /* Zomato red */
        color: white;
        padding: 12px 25px;
        border: none;
        border-radius: 6px;
        font-size: 1em;
        cursor: pointer;
        text-decoration: none;
        transition: background-color 0.3s, transform 0.2s;
    }

    .btn:hover {
        background-color: #c02638;
        transform: translateY(-2px);
    }
</style>
</head>
<body>

<h1>Item Stored Successfully!</h1>
<a href="fetchItem" class="btn">View all items</a>

</body>
</html>