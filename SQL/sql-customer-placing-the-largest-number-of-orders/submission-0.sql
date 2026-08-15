-- Write your query below

--select customer_number from orders group by customer_number
--order by count(*) desc limit 1

--select customer_number from orders group by customer_number  having count(*)=(
 --   select max(order_count) from (

 --   )
--)
select customer_number from orders group by customer_number having count(*)=(
select max(order_count) as max_count from (select count(*) as order_count from orders group by customer_number))