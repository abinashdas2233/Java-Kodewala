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

    .container {
        width: 450px;
        background: white;
        padding: 30px;
        border-radius: 8px;
        box-shadow: 0 4px 12px rgba(0,0,0,0.12);
    }

    h2 {
        text-align: center;
        color: #2874f0;
        margin-bottom: 25px;
    }

    label {
        display: block;
        font-weight: bold;
        margin-top: 15px;
        margin-bottom: 6px;
        color: #212121;
    }

    input,
    textarea {
        width: 100%;
        padding: 12px;
        border: 1px solid #dcdcdc;
        border-radius: 4px;
        box-sizing: border-box;
        font-size: 14px;
    }

    textarea {
        resize: vertical;
    }

    button {
        width: 100%;
        margin-top: 22px;
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
<div class="container">
    <h2>Add Product</h2>

    <form action="createProduct" method="post">

        <label>Product Name</label>
        <input type="text" name="productName" required>

        <label>Status</label>
        <input type="text" name="status" required>

        <label>Description</label>
        <textarea name="description" rows="4" required></textarea>

        <label>Price</label>
        <input type="number" step="0.01" name="price" required>

        <label>Quantity</label>
        <input type="number" name="quantity" required>

        <button type="submit">Post Product</button>

    </form>
    
</div>
</body>
</html>