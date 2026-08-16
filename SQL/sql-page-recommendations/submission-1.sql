-- Write your query below

select distinct page_id as recommended_page from likes l
join(
select user2_id as users from friendship where user1_id=1
and user2_id!=1
union 
select user1_id  as users from friendship where user2_id=1 and user1_id!=1
)f
on f.users=l.user_id and page_id not in(
select page_id  from likes where user_id=1) 