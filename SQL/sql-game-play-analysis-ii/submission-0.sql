-- Write your query below

select player_id ,device_id
from (
    select player_id,device_id, event_date,min(event_date)
    over(partition by player_id) as min_event from activity
) t
 where event_date=min_event

