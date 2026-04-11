<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Item</title>

<style>
/* Body */
body {
    font-family: Arial, sans-serif;
    background-color: #f8f8f8;
    margin: 0;
    padding: 0;
}

/* Header */
.header {
    background-color: #e23744;
    color: white;
    padding: 20px;
    text-align: center;
    font-size: 26px;
    font-weight: bold;
}

/* Form Container */
.container {
    max-width: 500px;
    margin: 50px auto;
    background: white;
    padding: 30px;
    border-radius: 12px;
    box-shadow: 0px 4px 15px rgba(0,0,0,0.1);
}

/* Form Labels */
label {
    display: block;
    margin-bottom: 5px;
    font-weight: bold;
    color: #333;
}

/* Form Inputs */
input[type="text"], input[type="number"], textarea {
    width: 100%;
    padding: 10px 12px;
    margin-bottom: 20px;
    border-radius: 6px;
    border: 1px solid #ccc;
    font-size: 14px;
}

/* Textarea */
textarea {
    resize: vertical;
    height: 80px;
}

/* Submit Button */
button {
    background-color: #e23744;
    color: white;
    border: none;
    padding: 12px 25px;
    border-radius: 8px;
    cursor: pointer;
    font-size: 16px;
    transition: background-color 0.2s;
}

button:hover {
    background-color: #c92d3a;
}

/* Form Title */
h2 {
    text-align: center;
    color: #e23744;
    margin-bottom: 30px;
}
</style>

</head>
<body>

<div class="header">
    Update Item 🍽️
</div>

<div class="container">
    <h2>Edit Item</h2>

    <form action="${pageContext.request.contextPath}/updateItems" method="post">
        <input type="hidden" name="itemId" value="${item.itemId}" />

        <label for="itemName">Name:</label>
        <input type="text" name="itemName" id="itemName" value="${item.itemName}" required/>

        <label for="price">Price:</label>
        <input type="text" name="price" id="price" value="${item.price}" required/>

        <label for="quantity">Quantity:</label>
        <input type="text" name="quantity" id="quantity" value="${item.quantity}" required/>

        <label for="description">Description:</label>
        <textarea name="description" id="description" required>${item.description}</textarea>

        <div style="text-align:center;">
            <button type="submit">Update</button>
        </div>
    </form>
</div>

</body>
</html>