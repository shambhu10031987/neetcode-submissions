-- Write your query below
select t.team_id,t.team_name,
coalesce(sum(CASE
WHEN t.team_id=m.host_team and m.host_goals>m.guest_goals then 3
When t.team_id=m.guest_team and m.guest_goals>m.host_goals
then 3
When m.guest_goals=m.host_goals 
then 1
else 0
end),0) as num_points
from teams t left join matches m on t.team_id=m.host_team or 
t.team_id=m.guest_team  group by t.team_id
ORDER BY num_points DESC, t.team_id ASC;
