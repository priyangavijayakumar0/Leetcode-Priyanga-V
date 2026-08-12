-- Last updated: 8/12/2026, 12:34:50 PM
# Write your MySQL query statement below
SELECT c.Name AS Customers
FROM Customers c
LEFT JOIN Orders o
ON c.Id = o.CustomerId
WHERE o.Id IS NULL;