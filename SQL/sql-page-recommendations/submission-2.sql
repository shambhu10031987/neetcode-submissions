-- Write your query below
with ctx as(
select user2_id as users from friendship where user1_id=1
union 
select user1_id  as users from friendship where user2_id=1  
)
select distinct page_id as recommended_page from likes where user_id in (select ctx.users
from ctx)and page_id not in(select page_id from likes where user_id=1) order by page_id 