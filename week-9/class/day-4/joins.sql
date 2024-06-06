-- 2. List the product id, product name , unit price and supplier name
 -- of all products that cost more than $75.
 -- Order by product name
 
 
SELECT
	p.ProductID,
	p.ProductName,
	p.UnitPrice,
    s.CompanyName AS 'Supplier Name'
FROM Products AS p
JOIN Suppliers AS s ON p.SupplierID = s.SupplierID
WHERE p.UnitPrice > 75
ORDER BY p.ProductName;

 

-- 4. What is the product name(s) and categories of the most expensive products?
-- HINT: Find the max price in a subquery and then use that in your more
-- complex query that joins products and categories


SELECT
	p.ProductName,
	c.CategoryName
FROM Products p
JOIN Categories c ON c.CategoryID = p.CategoryID
WHERE p.UnitPrice = (SELECT MAX(UnitPrice) FROM Products);



-- 6. List the order id, order date, ship name, ship address of all orders that ordered "Sasquatch Ale"


SELECT
	o.OrderID,
    o.OrderDate,
    o.ShipName,
    o.ShipAddress
FROM Orders o
JOIN `Order Details` od ON od.OrderID = o.OrderID
JOIN Products p ON p.ProductID = od.ProductID
WHERE p.ProductName = "Sasquatch Ale";

-- many-to-many

-- one-to-many

-- one-to-one


SELECT * FROM Orders;





