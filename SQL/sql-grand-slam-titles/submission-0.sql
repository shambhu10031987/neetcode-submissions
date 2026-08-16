-- Write your query below
--select player_id,player_name 
--from players 

select  p.player_id,p.player_name  ,count(*) as grand_slams_count from (
select wimbledon as value from championships
union all
select fr_open  as value from championships
union all
select us_open  as value from championships
union all
select au_open  as value from championships
)t
join players p on t.value=p.player_id
group by p.player_id,p.player_name 


