-- Last updated: 8/12/2026, 12:34:54 PM
SELECT Email
FROM Person
GROUP BY Email
HAVING COUNT(*) > 1;