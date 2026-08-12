-- Last updated: 8/12/2026, 12:30:39 PM
# Write your MySQL query statement below
SELECT player_id, MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;
