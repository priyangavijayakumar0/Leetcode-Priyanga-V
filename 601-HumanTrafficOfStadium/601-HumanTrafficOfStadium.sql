-- Last updated: 8/12/2026, 12:32:06 PM
SELECT id, visit_date, people
FROM Stadium s1
WHERE people >= 100
  AND (
    (EXISTS (SELECT 1 FROM Stadium s2 WHERE s2.people >= 100 AND s2.id = s1.id - 1)
     AND EXISTS (SELECT 1 FROM Stadium s3 WHERE s3.people >= 100 AND s3.id = s1.id - 2))
    OR
    (EXISTS (SELECT 1 FROM Stadium s2 WHERE s2.people >= 100 AND s2.id = s1.id + 1)
     AND EXISTS (SELECT 1 FROM Stadium s3 WHERE s3.people >= 100 AND s3.id = s1.id + 2))
    OR
    (EXISTS (SELECT 1 FROM Stadium s2 WHERE s2.people >= 100 AND s2.id = s1.id - 1)
     AND EXISTS (SELECT 1 FROM Stadium s3 WHERE s3.people >= 100 AND s3.id = s1.id + 1))
  );
