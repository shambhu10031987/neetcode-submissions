-- Write your query below

select c1.seat_id
from cinema c1 join cinema c2 
on c1.seat_id=c2.seat_id+1
where c1.free=1 and c2.free=1
UNION

SELECT DISTINCT c2.seat_id
FROM cinema c1
JOIN cinema c2
    ON c1.seat_id = c2.seat_id + 1
WHERE c1.free = 1
  AND c2.free = 1;
