<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Zomato Restaurant Item</title>
<style>
    /* ===== Body & Background ===== */
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-color: #fff3f3; /* light Zomato red tint */
        margin: 0;
        padding: 0;
    }

    h1 {
        text-align: center;
        color: #e23744; /* Zomato red */
        margin-top: 30px;
        font-size: 2.5em;
    }

    /* ===== Form Container ===== */
    form {
        background-color: #ffffff;
        max-width: 500px;
        margin: 40px auto;
        padding: 30px;
        border-radius: 10px;
        box-shadow: 0 4px 10px rgba(0,0,0,0.1);
    }

    label {
        display: block;
        margin-bottom: 5px;
        font-weight: bold;
        color: #333;
    }

    input[type="text"],
    input[type="number"],
    textarea {
        width: 100%;
        padding: 10px 12px;
        margin-bottom: 20px;
        border: 1px solid #ccc;
        border-radius: 6px;
        font-size: 1em;
        box-sizing: border-box;
        transition: border-color 0.3s;
    }

    input[type="text"]:focus,
    input[type="number"]:focus,
    textarea:focus {
        border-color: #e23744;
        outline: none;
    }

    textarea {
        resize: vertical;
    }

    input[type="submit"] {
        background-color: #e23744; /* Zomato red */
        color: white;
        padding: 12px 20px;
        border: none;
        border-radius: 6px;
        font-size: 1em;
        cursor: pointer;
        width: 100%;
        transition: background-color 0.3s, transform 0.2s;
    }

    input[type="submit"]:hover {
        background-color: #c02638;
        transform: translateY(-2px);
    }

    /* Responsive */
    @media (max-width: 600px) {
        form {
            margin: 20px;
            padding: 20px;
        }
    }
</style>
</head>
<body>
<h1>Zomato Restaurant Item</h1>
<form action="submitItem" method="post">
    <label for="itemName">Item Name:</label>
    <input type="text" id="itemName" name="itemName" required>

    <label for="price">Price:</label>
    <input type="number" id="price" name="price" step="0.01" required>

    <label for="quantity">Quantity:</label>
    <input type="number" id="quantity" name="quantity" required>

    <label for="description">Description:</label>
    <textarea id="description" name="description" rows="4"></textarea>

    <input type="submit" value="Submit">
</form>
</body>
</html>