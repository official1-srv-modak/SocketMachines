<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Price Quote</title>
</head>
<body>
    <h1>Price Quote</h1>
    <form action="form-manager" method="post">
        <label for="type">Socket Type:</label>
        <select id="type" name="type">
            <option value="Type-A">Type A</option>
            <option value="Type-B">Type B</option>
            <option value="Type-C">Type C</option>
        </select>
		<br>
        <label for="quantity">Quantity:</label>
        <input type="number" id="quantity" name="quantity" min="1" required>
		<br>

        <label for="name">Customer Name:</label>
        <input type="text" id="name" name="name" required>
		<br>

        <label for="email">Customer Email:</label>
        <input type="email" id="email" name="email" required>
		<br>

        <button type="submit">Submit</button>
    </form>
</body>
</html>
    