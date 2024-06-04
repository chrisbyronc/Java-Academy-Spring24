-- 6. Whazt are the products that we carry where we have at least 100 units on hand?
-- Order them in descending order by price
-- If two or more have the same price, list those in ascending order by product name


SELECT
	*
FROM
	Products
WHERE
	UnitsInStock >= 100
ORDER BY UnitPrice DESC, ProductName ASC;



-- 7. What are the products that we are carry where we have no units on hand, 
-- but 1 or more units of them on backorder? Order by product name


SELECT
	*
FROM
	Products
WHERE
	UnitsInStock = 0 AND UnitsOnOrder > 0
ORDER BY ProductName;


-- 14. What employees have a salary that is between $2000 and $2500

SELECT
	*
FROM
	Employees
WHERE
	Salary BETWEEN 2000 and 2500;
    
    
SELECT
	CategoryID, SUM(UnitPrice) AS 'SUM Price'
FROM
	Products
GROUP BY CategoryID
HAVING SUM(UnitPrice) < 200
ORDER BY SUM(UnitPrice) DESC;










