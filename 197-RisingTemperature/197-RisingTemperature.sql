-- Last updated: 8/12/2026, 12:34:36 PM
# Write your MySQL query statement below
SELECT w1.Id
FROM Weather w1
JOIN Weather w2
ON DATEDIFF(w1.RecordDate, w2.RecordDate) = 1
WHERE w1.Temperature > w2.Temperature;