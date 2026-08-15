-- Write your query below

select Least(from_id,to_id) as person1, Greatest(from_id,to_id) as person2 ,count(*)as call_count ,sum(duration)as total_duration
from calls  group by  LEAST(from_id, to_id),
    GREATEST(from_id, to_id);
